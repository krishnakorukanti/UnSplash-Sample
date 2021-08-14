package com.masai.imagesplash.Api;

import com.masai.imagesplash.Data.ResultsItem;
import com.masai.imagesplash.Data.UnSplashResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/photos")
    Call<List<ResultsItem>> getListofPhotos(@Header("Authorization") String key, @Query("page") int pageNo);

    @GET("/search/photos")
    Call<UnSplashResponse> getQueryPhotos(@Header("Authorization") String key, @Query("query") String query, @Query("page") int pageNo);
}
