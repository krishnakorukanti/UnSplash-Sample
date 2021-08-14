package com.masai.imagesplash;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.masai.imagesplash.Api.ApiService;
import com.masai.imagesplash.Api.Network;
import com.masai.imagesplash.Data.ResultsItem;
import com.masai.imagesplash.Data.UnSplashResponse;
import com.masai.imagesplash.Recycler.UnsplashAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Integer pgNo = 1;

    RecyclerView recyclerView;
    Button button;
    EditText editText;
    ExtendedFloatingActionButton nextBtn;
    List<ResultsItem> resultsItemList = new ArrayList<>();
    UnsplashAdapter unsplashAdapter;
    boolean isSearch = false;
    String query = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        unsplashAdapter = new UnsplashAdapter(resultsItemList);
        recyclerView.setAdapter(unsplashAdapter);
        fetchData();

    }

    private void fetchData() {
        ApiService apiService = Network.getRetrofitInstance(this).create(ApiService.class);
        Call<List<ResultsItem>> call = apiService.getListofPhotos("Client-ID 3ciGsvOth6xyXtvis9Ks_RuMeD7i2qJxC4D38yDmtl0", pgNo);
        call.enqueue(new Callback<List<ResultsItem>>() {
            @Override
            public void onResponse(Call<List<ResultsItem>> call, Response<List<ResultsItem>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    resultsItemList = response.body();
                    updateRecycler();
                }
            }

            @Override
            public void onFailure(Call<List<ResultsItem>> call, Throwable t) {

            }
        });


    }

    private void fetchSearchData(String query) {
        ApiService apiService = Network.getRetrofitInstance(this).create(ApiService.class);
        Call<UnSplashResponse> call = apiService.getQueryPhotos("Client-ID 3ciGsvOth6xyXtvis9Ks_RuMeD7i2qJxC4D38yDmtl0", query, pgNo);

        call.enqueue(new Callback<UnSplashResponse>() {
            @Override
            public void onResponse(Call<UnSplashResponse> call, Response<UnSplashResponse> response) {
                if (response.isSuccessful() && response.body().getResults() != null) {
                    resultsItemList = response.body().getResults();
                    updateRecycler();
                }
            }

            @Override
            public void onFailure(Call<UnSplashResponse> call, Throwable t) {
                Log.d("crishna", t.getMessage());
            }
        });

    }

    private void updateRecycler() {
        unsplashAdapter.updateData(resultsItemList);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerContainer);
        button = findViewById(R.id.searchBtn);
        editText = findViewById(R.id.searchContainer);
        nextBtn = findViewById(R.id.nextPageBtn);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (count>0){
                    button.setText("Search");
                }else button.setText("Home");
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count>0){
                    button.setText("Search");
                }else button.setText("Home");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pgNo++;
                if (isSearch)
                    searchData();
                else {

                    fetchData();}
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pgNo=1;
                searchData();

            }
        });
    }

    private void searchData() {
        if (editText.getText().toString().length() != 0) {
            query = editText.getText().toString();

            fetchSearchData(query);
            isSearch = true;
        }else {

            isSearch = false;
            fetchData();
        }

    }


}