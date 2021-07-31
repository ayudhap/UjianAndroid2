package com.example.ujianandroid2.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ujianandroid2.R;
import com.example.ujianandroid2.entity.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private ArrayList<Product> products;
    Context context;

    public ProductAdapter(ArrayList<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_product, parent, false);
        return new ProductAdapter.ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.tvProduct.setText(products.get(position).getProduct());
        holder.tvPrice.setText(products.get(position).getPrice());
        holder.tvDescription.setText(products.get(position).getDescription());
        holder.tvVariant.setText(products.get(position).getVariant());
    }

    @Override
    public int getItemCount() {
        return (products != null) ? products.size() : 0;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView tvProduct, tvPrice, tvDescription, tvVariant;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProduct = itemView.findViewById(R.id.tv_product);
            tvPrice = itemView.findViewById(R.id.tv_price);
            tvDescription = itemView.findViewById(R.id.tv_description);
            tvVariant = itemView.findViewById(R.id.tv_variant);
        }
    }
}
