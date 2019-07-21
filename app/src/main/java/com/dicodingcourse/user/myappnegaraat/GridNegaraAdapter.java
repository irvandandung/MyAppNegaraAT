package com.dicodingcourse.user.myappnegaraat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridNegaraAdapter extends RecyclerView.Adapter<GridNegaraAdapter.GridViewHolder> {
    public GridNegaraAdapter(Context c) {
        this.c = c;
    }

    private Context c;

    public ArrayList<Negara> getlistNegara() {
        return listNegara;
    }

    public void setlistNegara(ArrayList<Negara> listNegara) {
        this.listNegara = listNegara;
    }

    private ArrayList<Negara> listNegara;
    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_negara, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder gridViewHolder, int i) {
        Glide.with(c)
                .load(getlistNegara().get(i).getBendera())
                .apply(new RequestOptions().override(350, 550))
                .into(gridViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getlistNegara().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPhoto;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
