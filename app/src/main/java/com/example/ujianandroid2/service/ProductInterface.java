package com.example.ujianandroid2.service;

import com.example.ujianandroid2.entity.Responses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductInterface {
    @GET("/variant/all")
    Call<Responses> getAllProduct();
}
