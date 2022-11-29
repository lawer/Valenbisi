package com.example.valenbisi.API;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ValenBisiAPI {
    @GET("valenbisi")
    Call<CitibikesResult> status();
}
