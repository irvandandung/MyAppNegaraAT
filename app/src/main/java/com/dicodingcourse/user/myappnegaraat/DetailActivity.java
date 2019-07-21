package com.dicodingcourse.user.myappnegaraat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    TextView namanegara,ibukota,detail,lagu,bahasa;
    private String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Negara negara = getIntent().getParcelableExtra("key");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title  = "Negara "+negara.getNegara();
        setActionBarTitle(title);

        ImageView imageView = findViewById(R.id.imagenegara);
        namanegara = findViewById(R.id.tv_item_negara);
        ibukota = findViewById(R.id.tv_item_ibukota);
        detail = findViewById(R.id.content_detail);
        lagu = findViewById(R.id.content_lagu);
        bahasa = findViewById(R.id.content_bahasa);

        Glide.with(this).load(negara.getBendera())
                .apply(new RequestOptions().override(350,550))
                .into(imageView);
        namanegara.setText(negara.getNegara());
        ibukota.setText(negara.getKota());
        detail.setText(negara.getContentDetail());
        lagu.setText(negara.getLagukebangsaan());
        bahasa.setText(negara.getBahasakebangsaan());
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
