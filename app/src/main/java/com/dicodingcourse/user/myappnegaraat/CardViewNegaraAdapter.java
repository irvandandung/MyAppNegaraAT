package com.dicodingcourse.user.myappnegaraat;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewNegaraAdapter extends RecyclerView.Adapter<CardViewNegaraAdapter.CardViewViewHolder> {
    public CardViewNegaraAdapter(Context context) {
        this.context = context;
    }
    Negara negara;

    private Context context;

    public ArrayList<Negara> getlistNegara() {
        return listNegara;
    }

    public void setlistNegara(ArrayList<Negara> listNegara) {
        this.listNegara = listNegara;
    }

    private ArrayList<Negara> listNegara;
    @NonNull
    @Override
    public CardViewNegaraAdapter.CardViewViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_negara, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewNegaraAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        Negara n = getlistNegara().get(i);

        Glide.with(context)
                .load(n.getBendera())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvNegara.setText(n.getNegara());
        cardViewViewHolder.tvKota.setText(n.getKota());

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Bagikan Negara "+getlistNegara().get(position).getNegara(), Toast.LENGTH_SHORT).show();
            }
        }));

        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("key", getlistNegara().get(position));
                context.startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getlistNegara().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgPhoto;
        public TextView tvNegara;
        public TextView tvKota;
        public Button btnFavorite, btnShare;




        public CardViewViewHolder(View view) {
            super(view);
            imgPhoto = view.findViewById(R.id.imagenegara);
            tvNegara = view.findViewById(R.id.tv_item_negara);
            tvKota = view.findViewById(R.id.tv_item_ibukota);
            btnFavorite = view.findViewById(R.id.btnFavorite);
            btnShare = view.findViewById(R.id.btnShare);

        }
    }
}
