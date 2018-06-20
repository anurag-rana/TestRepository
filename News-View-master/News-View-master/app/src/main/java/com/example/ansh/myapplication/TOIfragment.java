package com.example.ansh.myapplication;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ansh.myapplication.RvFiles.RVadapterTOI;
import com.example.ansh.myapplication.RvFiles.RVdata;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class TOIfragment extends Fragment {
    public static  final String TAG="fragment";
    RecyclerView rv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflatedView=inflater.inflate(R.layout.fragment_toi,container,false);

        new TaskDownloadDataAndChangeText(inflatedView).execute("https://newsapi.org/v1/articles?source=the-times-of-india&sortBy=latest&apiKey=9a984611d6fd4b0e971bc7fcb12c781d");


        return  inflatedView;
    }









    private class TaskDownloadDataAndChangeText extends AsyncTask<String, Void, String> {
        ProgressDialog pd;
        View fragView;

        public TaskDownloadDataAndChangeText(View fragView) {
            this.fragView = fragView;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(fragView.getContext());
            pd.setTitle("Downloading");
            pd.setMessage("Wait a sec");
            pd.show();
        }

        @Override
        protected String doInBackground(String... params) {

//            do the downloading and return string
            //
            String result_data = connectingtonet(params[0]);

            return result_data;
        }

        private String connectingtonet(String param) {
            Log.e(TAG, "Asynctask started connectingtonet:functionstarted ");
            Log.e(TAG, "connectingtonet: Link recieved:" + param);

            String result = "{null:0}";
            //Create a URL Connection
            try {
                Log.e(TAG, "connectingtonet:in the try block now ");

                OkHttpClient client = new OkHttpClient();
                Request req = new Request.Builder()
                        .url(param)
                        .build();

                Response response = client.newCall(req).execute();
                result = response.body().string();

            } catch (IOException e) {
                e.printStackTrace();
                Log.e(TAG, "connectingtonet: catch:ioexception  caught:" + e.getMessage());

            }


            return result;
        }

        private ArrayList<RVdata> JsontoPojo(String json_string) {
            ArrayList<RVdata> rVdataArr = new ArrayList<>();
            String title = "not defined";
            String details = "not defined";
            String picurl = "not defined";

            //^^^^variables to be used
            try {

                JSONObject rootjsonobject = new JSONObject(json_string);
                JSONArray articles_arr = rootjsonobject.getJSONArray("articles");
                

                for (int i = 0; i < articles_arr.length(); i++) {
                    title = articles_arr.getJSONObject(i).getString("title");
                    details = articles_arr.getJSONObject(i).getString("description")+"\n url:"+
                              articles_arr.getJSONObject(i).getString("url");
                    picurl = articles_arr.getJSONObject(i).getString("urlToImage");

                    rVdataArr.add(new RVdata(title,details,picurl));

                }

                return rVdataArr;

            } catch (JSONException e) {
                e.printStackTrace();
                Log.e(TAG, "JsontoPojo: erroroccurred");
                Log.e(TAG, "JsontoPojo: " + e.getMessage());

                Log.e(TAG, "rvdata arr:" + rVdataArr);


                return new ArrayList<>();//since it is being used by  recycler view, :.
                // to prevent sudden crashing, passing an empty arraylist of size 0
            }


        }

        @Override
        protected void onPostExecute(String json_string) {
            //can't really return anything, no matter what the arguements are.
            // .. so, do everything you wanna do in  main thread HERE,as
            // you will get everything from do in background here.
            super.onPostExecute(json_string);

            Toast.makeText(fragView.getContext(), "downloading Finished", Toast.LENGTH_SHORT).show();



            rv = (RecyclerView) fragView.findViewById(R.id.fragRVlayout);
            ArrayList<RVdata> filtered_data_arr = JsontoPojo(json_string);
            RVadapterTOI adp = new RVadapterTOI(filtered_data_arr);
            rv.setNestedScrollingEnabled(true);
            rv.setAdapter(adp);
            rv.setLayoutManager(new LinearLayoutManager(fragView.getContext()));



            if (pd.isShowing()) {
                pd.cancel();
            }



        }


    }

}
