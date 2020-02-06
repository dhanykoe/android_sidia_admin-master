package dev.sofie.sidiaadmin.service;

import java.util.List;

import dev.sofie.sidiaadmin.model.ApiResponse;
import dev.sofie.sidiaadmin.model.Permintaan;
import dev.sofie.sidiaadmin.model.User;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Api {
    //test
    @GET("permintaan/status/{status}")
    Call<ApiResponse<List<Permintaan>>> getListPBK(@Path("status") String status);

    @FormUrlEncoded
    @POST("login/admin")
    Call<ApiResponse<List<User>>> login(@Field("pengguna") String str, @Field("sandi") String str2);

    @FormUrlEncoded
    @POST("permintaan/update")
    Call<ApiResponse> updateStatusPermintaan(@Field("id_permintaan") String permintaan, @Field("status") String status);

    @FormUrlEncoded
    @POST("admin/ubahpassword")
    Call<ApiResponse> ubahPassword(@Field("id_pengguna") String str, @Field("password") String str2, @Field("password_baru") String str3);
}
