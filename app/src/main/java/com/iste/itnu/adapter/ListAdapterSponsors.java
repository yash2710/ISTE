package com.iste.itnu.adapter;

/**
 * Created by Yash on 06-Jan-15.
 */

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.toolbox.ImageLoader;
import com.iste.itnu.AppController;
import com.iste.itnu.R;
import com.iste.itnu.model.Sponsor;
import com.iste.itnu.model.SponsorViewHolder;

import java.util.Collections;
import java.util.List;

public class ListAdapterSponsors extends RecyclerView.Adapter<SponsorViewHolder> {
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();
    private Activity activity;
    private LayoutInflater inflater;
    private List<Sponsor> sponsors= Collections.emptyList();

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void setList(List<Sponsor> sponsors){
        this.sponsors=sponsors;
        notifyItemRangeChanged(0,sponsors.size());
    }
    @Override
    public int getItemCount() {
        return sponsors.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public SponsorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowView = inflater.inflate(R.layout.list_row_s, parent, false);
        SponsorViewHolder holder = new SponsorViewHolder(rowView);
        Log.e("holder","1");
        return holder;
    }

    public ListAdapterSponsors(Context activity){
        inflater=LayoutInflater.from(activity);
    }

    @Override
    public void onBindViewHolder(SponsorViewHolder holder, int position) {
        Sponsor s = sponsors.get(position);

        holder.title.setText(s.getTitle());
        holder.thumbNail.setImageUrl(s.getUrl(),imageLoader);
        Log.e("step", "1");
    }
}