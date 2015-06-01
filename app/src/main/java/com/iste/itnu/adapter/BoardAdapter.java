package com.iste.itnu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.toolbox.ImageLoader;
import com.iste.itnu.AppController;
import com.iste.itnu.R;
import com.iste.itnu.model.Board;
import com.iste.itnu.model.BoardViewHolder;

import java.util.Collections;
import java.util.List;

public class BoardAdapter extends RecyclerView.Adapter<BoardViewHolder> {
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();
    private List<Board> members= Collections.emptyList();
    private LayoutInflater inflater;
    public BoardAdapter(Context activity){
        inflater=LayoutInflater.from(activity);
    }

    public void setList(List<Board> members){
        this.members=members;
        notifyItemRangeChanged(0,members.size());
    }
    @Override
    public int getItemCount() {
        return members.size();
    }


    @Override
    public BoardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowView = inflater.inflate(R.layout.second, parent, false);
        BoardViewHolder holder = new BoardViewHolder(rowView);
        return holder;
    }

    @Override
    public void onBindViewHolder(BoardViewHolder holder, int position) {
        Board m = members.get(position);
        holder.txtTitle.setText(m.getName());
        holder.txtTitle1.setText(m.getPosition());
        holder.imageView.setImageUrl(m.getUrl(),imageLoader);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}