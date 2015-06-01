package com.iste.itnu.model;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.iste.itnu.R;

/**
 * Created by Yash on 15-Feb-15.
 */
public class BoardViewHolder extends RecyclerView.ViewHolder {
    public TextView txtTitle;
    public TextView txtTitle1;
    public NetworkImageView imageView;
    Typeface tf;

    public BoardViewHolder(View itemView) {
        super(itemView);
        txtTitle = (TextView) itemView.findViewById(R.id.txt);
        txtTitle1 = (TextView) itemView.findViewById(R.id.txt1);
        tf = Typeface.createFromAsset(itemView.getContext().getAssets(), "Roboto-Bold.ttf");
        txtTitle.setTypeface(tf);
        txtTitle1.setTypeface(tf);
        imageView = (NetworkImageView) itemView.findViewById(R.id.img);
    }
}
