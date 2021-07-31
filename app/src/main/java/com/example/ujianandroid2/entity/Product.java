package com.example.ujianandroid2.entity;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("id")
    private long id;
    @SerializedName("product")
    private String product;
    @SerializedName("price")
    private String price;
    @SerializedName("description")
    private String description;
    @SerializedName("variant")
    private String variant;

    public Product(long id, String product, String price, String description, String variant) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.description = description;
        this.variant = variant;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }
}
