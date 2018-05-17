package com.example.lenovo.myapplication.Remote;

import com.example.lenovo.myapplication.Samples.Catdetail;
import com.example.lenovo.myapplication.Samples.List;
import com.example.lenovo.myapplication.Samples.MyPOJO;
import com.example.lenovo.myapplication.Samples.Productdetail;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIService {

    //Call<POST> savePost(@Field("success") Integer success);

    @GET("/Kopswebservices/catfetch.php")
    //@FormUrlEncoded
    Call<MyPOJO> savePost();
}