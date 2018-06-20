package com.example.ansh.myapplication.RvFiles;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ansh.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ansh on 18/10/17.
 */


public class RVadapterTOI extends RecyclerView.Adapter<RVholder> {
    private ArrayList<RVdata> dataArr;

    public RVadapterTOI(ArrayList<RVdata> datarr) {
        //WARNING:it is caller-class's responsibility to null arraylist exception, else APP WILL CRASH!!!
        this.dataArr=datarr;
    }

    @Override
    public RVholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedview= LayoutInflater.from(parent.getContext()).inflate(R.layout.frag_rv_each_row,null,false);
        return new RVholder(inflatedview);
    }

    @Override
    public void onBindViewHolder(RVholder holder, int position) {
        final RVholder h=holder;

        h.title_holder.setText(dataArr.get(position).getTitle());
        h.details_holder.setText(dataArr.get(position).getMessage());
        Picasso.with(h.itemView.getContext()).load(dataArr.get(position).getImageUrl())
                .fit()
                .error(R.mipmap.ic_launcher)
                .into(h.image_holder);

        h.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int visible= CardView.VISIBLE;
                int gone=CardView.GONE;
                h.card_holder.setVisibility(h.card_holder.getVisibility()==visible?gone:visible);

            }
        });
//
//
    }

    @Override
    public int getItemCount() {
        //setsno. of images to display. can use not only an arraylist's length for it,
        // but also a constant no like 10,15,20,..indicating. the size of Recycler view
        return dataArr.size();
    }
}
