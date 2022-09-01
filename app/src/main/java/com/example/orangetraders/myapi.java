package com.example.orangetraders;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface myapi {
    @GET("prod/studentvisaorpermit?StudentId=1545")
    Call<Model> getmodel();

    @POST("prod/studentvisaorpermit?StudentId=1545")
    Call<Model> createPost(@Body Model model);

    @FormUrlEncoded
    @POST("prod/studentvisaorpermit?StudentId=1545")
    Call<Model> createPost(
            @Field("studentId") String studentId);

    @FormUrlEncoded
    @POST("prod/studentvisaorpermit?StudentId=1545")
    Call<Model> createPost(@FieldMap Map<String,String> fields);

    @Headers({"Content-Type: application/json"})
    @PUT("prod/studentvisaorpermit?StudentId=1545")
    Call<Model> updatePost(@Path("studentID") String studentID, @Body Model model);
}
