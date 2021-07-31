package com.example.ujianandroid2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ujianandroid2.adapter.ProductAdapter;
import com.example.ujianandroid2.entity.Responses;
import com.example.ujianandroid2.service.APIClient;
import com.example.ujianandroid2.service.ProductInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        getAllProduct();
    }

    public void getAllProduct() {
        ProductInterface productInterface = APIClient.getRetrofit().create(ProductInterface.class);
        Call<Responses> call = productInterface.getAllProduct();
        call.enqueue(new Callback<Responses>() {
            @Override
            public void onResponse(Call<Responses> call, Response<Responses> response) {
                productAdapter = new ProductAdapter(response.body().getData(), MainActivity.this);
                productAdapter.notifyDataSetChanged();
                recyclerView.setAdapter(productAdapter);
            }

            @Override
            public void onFailure(Call<Responses> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}