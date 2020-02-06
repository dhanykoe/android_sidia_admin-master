package dev.sofie.sidiaadmin.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.lifecycle.MutableLiveData;

import java.util.List;


import dev.sofie.admin.BuildConfig;
import dev.sofie.sidiaadmin.helper.SharedPreferecesHelper;
import dev.sofie.sidiaadmin.model.ApiResponse;
import dev.sofie.sidiaadmin.model.Permintaan;
import dev.sofie.sidiaadmin.model.User;
import dev.sofie.sidiaadmin.ui.DetailPBKActivity;
import dev.sofie.sidiaadmin.ui.LoginActivity;
import dev.sofie.sidiaadmin.ui.MainActivity;
import dev.sofie.sidiaadmin.ui.PBK.PBKFragment;
import dev.sofie.sidiaadmin.ui.ProfileFragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

public class Repository {
    private static final String BASE_URL = BuildConfig.BASE_URL;
    private static Repository repository;
    private Api api;
    /* access modifiers changed from: private */
    public Context context;

    private Repository(Context context2, Api api2) {
        this.api = api2;
        this.context = context2;
    }

    public static Repository getInstance(Context context2) {
        if (repository == null) {
            repository = new Repository(context2,  new Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(Api.class));
        }
        return repository;
    }

    public void login(String nik, String password) {
        LoginActivity.setLoading(true);
        this.api.login(nik, password).enqueue(new Callback<ApiResponse<List<User>>>() {
            public void onResponse(Call<ApiResponse<List<User>>> call, Response<ApiResponse<List<User>>> response) {
                if (!response.isSuccessful()) {
                    LoginActivity.setLoading(false);
                    Toast.makeText(Repository.this.context, response.message(), Toast.LENGTH_SHORT).show();
                } else if (((ApiResponse) response.body()).getSuccess().booleanValue()) {
                    String role  = response.body().getData().get(0).getRoleLevel();
                    if( role.equals("admin")  || role.equals("pimpinan")){
                        SharedPreferecesHelper.newInstance(Repository.this.context).setUser((User) ((List) ((ApiResponse) response.body()).getData()).get(0));
                        ((Activity) Repository.this.context).finish();
                        Repository.this.context.startActivity(new Intent(Repository.this.context, MainActivity.class));
                    }else{
                        LoginActivity.setLoading(false);
                        Toast.makeText(Repository.this.context, "Maaf anda tidak berhak masuk !", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    LoginActivity.setLoading(false);
                    Toast.makeText(Repository.this.context, ((ApiResponse) response.body()).getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            public void onFailure(Call<ApiResponse<List<User>>> call, Throwable t) {
                LoginActivity.setLoading(false);
                Toast.makeText(Repository.this.context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public MutableLiveData<List<Permintaan>> getListPBK(String id) {
        PBKFragment.showLoading(true);
        final MutableLiveData<List<Permintaan>> result = new MutableLiveData<>();
        this.api.getListPBK(id).enqueue(new Callback<ApiResponse<List<Permintaan>>>() {
            public void onResponse(Call<ApiResponse<List<Permintaan>>> call, Response<ApiResponse<List<Permintaan>>> response) {
                PBKFragment.showLoading(false);
                if (response.isSuccessful()) {
                    result.postValue((List) ((ApiResponse) response.body()).getData());
                    return;
                }
                Toast.makeText(Repository.this.context, response.message(), Toast.LENGTH_SHORT).show();
            }

            public void onFailure(Call<ApiResponse<List<Permintaan>>> call, Throwable t) {
                Toast.makeText(Repository.this.context, t.getMessage(), Toast.LENGTH_SHORT).show();
                PBKFragment.showLoading(false);
            }
        });
        return result;
    }

    public void ubahPassword(String passLama, String passBaru) {
        ProfileFragment.showLoading(true);
        this.api.ubahPassword(SharedPreferecesHelper.newInstance(this.context).getUser().getIdPengguna(), passLama, passBaru).enqueue(new Callback<ApiResponse>() {
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                ProfileFragment.showLoading(false);
                if (!response.isSuccessful()) {
                    Toast.makeText(Repository.this.context, response.message(), Toast.LENGTH_SHORT).show();
                } else if (((ApiResponse) response.body()).getSuccess().booleanValue()) {
                    Toast.makeText(Repository.this.context, "Password Berhasil Diubah", Toast.LENGTH_SHORT).show();
                    SharedPreferecesHelper.newInstance(Repository.this.context).clearUser();
                    Repository.this.context.startActivity(new Intent(Repository.this.context, LoginActivity.class));
                    ((Activity) Repository.this.context).finish();
                } else {
                    Toast.makeText(Repository.this.context, ((ApiResponse) response.body()).getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            public void onFailure(Call<ApiResponse> call, Throwable t) {
                ProfileFragment.showLoading(false);
                Toast.makeText(Repository.this.context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void updatePermintaanStatus(String id,String status){
        DetailPBKActivity.showLoading(true);
        this.api.updateStatusPermintaan(id, status).enqueue(new Callback<ApiResponse>() {
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                if (!response.isSuccessful()) {
                    DetailPBKActivity.showLoading(false);
                    Toast.makeText(context, response.message(), Toast.LENGTH_SHORT).show();
                } else {
                    DetailPBKActivity.showLoading(false);
                    Toast.makeText(context, (response.body()).getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            public void onFailure(Call<ApiResponse> call, Throwable t) {
                DetailPBKActivity.showLoading(false);
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
