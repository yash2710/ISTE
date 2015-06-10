package com.iste.itnu.adapter;

/**
 * Created by Yash on 31-Dec-14.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.toolbox.ImageLoader;
import com.iste.itnu.AppController;
import com.iste.itnu.R;
import com.iste.itnu.model.Gallery;
import com.iste.itnu.model.GalleryViewHolder;

import java.util.Collections;
import java.util.List;

public class CustomListAdapter extends RecyclerView.Adapter<GalleryViewHolder> {
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();
    private Context activity;
    private LayoutInflater inflater;
    private List<Gallery> movieItems= Collections.emptyList();

    public CustomListAdapter(Context activity) {
        inflater = LayoutInflater.from(activity);
    }

    @Override
    public int getItemCount() {
        return movieItems.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void setList(List<Gallery> movieItems){
        this.movieItems=movieItems;
        notifyItemRangeChanged(0,movieItems.size());
    }

    @Override
    public GalleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowView = inflater.inflate(R.layout.list_row, parent, false);
        GalleryViewHolder holder = new GalleryViewHolder(rowView);
        return holder;
    }

    @Override
    public void onBindViewHolder(GalleryViewHolder holder, int position) {
        Gallery g = movieItems.get(position);
//        holder.title.setText(g.getTitle());
//        holder.year.setText(Integer.toString(g.getYear()));
        holder.imageView.setImageUrl(g.getThumbnailUrl(),imageLoader);
    }
}