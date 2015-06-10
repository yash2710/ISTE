package com.iste.itnu.model;

import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.iste.itnu.R;

/**
 * Created by Yash on 22-May-15.
 */
public class SponsorViewHolder extends RecyclerView.ViewHolder {
    public CardView cv;
    public NetworkImageView thumbNail;
    public TextView title;
    public Typeface tf;
    public SponsorViewHolder(View itemView) {
        super(itemView);
//        cv = (CardView) itemView.findViewById(R.id.cv);
        thumbNail = (NetworkImageView) itemView.findViewById(R.id.thumbnail);
        title = (TextView) itemView.findViewById(R.id.title);
        tf = Typeface.createFromAsset(itemView.getContext().getAssets(), "Roboto-Bold.ttf");
        title.setTypeface(tf);
    }
}
