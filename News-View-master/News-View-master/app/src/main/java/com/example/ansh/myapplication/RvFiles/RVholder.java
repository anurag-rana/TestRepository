package com.example.ansh.myapplication.RvFiles;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ansh.myapplication.R;

/**
 * Created by ansh on 18/10/17.news_Title_Layout news_img_layout textviewCard news_message_Layout
 */

public class RVholder extends ViewHolder {
    public ImageView image_holder;
    public TextView title_holder;
    public CardView card_holder;
    public TextView details_holder;


    public RVholder(View itemView) {
        super(itemView);

        title_holder = itemView.findViewById(R.id.news_Title_Layout);
        details_holder = itemView.findViewById(R.id.news_message_Layout);
        card_holder = itemView.findViewById(R.id.textviewCard);
        image_holder = itemView.findViewById(R.id.news_img_layout);




    }

}
