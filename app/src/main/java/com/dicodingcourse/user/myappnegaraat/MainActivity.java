package com.dicodingcourse.user.myappnegaraat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView rvCategory;
    private ArrayList<Negara> list= new ArrayList<>();
    private String title = "MyAppNegaraAsiaTenggara";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_Category);
        rvCategory.setHasFixedSize(true);


        list.addAll(NegaraData.getListData());
        showRecyclerGrid();
        showRecyclerCardView();
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewNegaraAdapter cardViewNegaraAdapter = new CardViewNegaraAdapter(this);
        cardViewNegaraAdapter.setlistNegara(list);
        rvCategory.setAdapter(cardViewNegaraAdapter);
        setActionBarTitle(title);
    }

    private void showRecyclerGrid() {
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridNegaraAdapter gridPresidentAdapter = new GridNegaraAdapter(this);
        gridPresidentAdapter.setlistNegara(list);
        rvCategory.setAdapter(gridPresidentAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedPresident(list.get(position));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void showSelectedPresident(Negara negara){
        Toast.makeText(this, "Kamu memilih bendera " +negara.getNegara(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_card:
                showRecyclerCardView();
                break;
            case R.id.action_bendera:
                showRecyclerGrid();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
