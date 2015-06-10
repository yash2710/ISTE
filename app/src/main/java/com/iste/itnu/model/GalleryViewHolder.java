package com.iste.itnu.model;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.iste.itnu.R;

/**
 * Created by Yash on 25-May-15.
 */
public class GalleryViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView year;
    public NetworkImageView imageView;
    Typeface tf;

    public GalleryViewHolder(View itemView) {
        super(itemView);
        //title = (TextView) itemView.findViewById(R.id.title);
//        year = (TextView) itemView.findViewById(R.id.year);
//        tf = Typeface.createFromAsset(itemView.getContext().getAssets(), "Roboto-Bold.ttf");
//        title.setTypeface(tf);
//        year.setTypeface(tf);
        imageView = (NetworkImageView) itemView.findViewById(R.id.thumbnail);
    }
}
