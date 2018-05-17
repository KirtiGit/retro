package com.example.lenovo.myapplication.Remote;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://www.dad-era.com";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
