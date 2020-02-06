package dev.sofie.sidiaadmin.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;


import dev.sofie.admin.R;
import dev.sofie.sidiaadmin.service.Repository;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    static ConstraintLayout layout;
    static ProgressBar loading;
    private Repository apiRepository;
    private EditText nik;
    private EditText password;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        apiRepository = Repository.getInstance(this);
        nik =  findViewById(R.id.nik);
        password = findViewById(R.id.password);
        loading = findViewById(R.id.loading);
        layout = findViewById(R.id.constraintLayout);
        (findViewById(R.id.login)).setOnClickListener(this);
    }

    public static void setLoading(boolean isload) {
        if (isload) {
            loading.setVisibility(View.VISIBLE);
            layout.setVisibility(View.GONE);
            return;
        }
        loading.setVisibility(View.GONE);
        layout.setVisibility(View.VISIBLE);
    }


    public boolean checkValidation() {
        if (this.nik.getText().length() == 0) {
            this.nik.setError("Silahkan Masukkan Username");
            return false;
        } else if (this.password.getText().length() != 0) {
            return true;
        } else {
            this.password.setError("Silahkan Masukkan Password");
            return false;
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() ==  R.id.login){
            if (checkValidation()) {
                apiRepository.login(
                        nik.getText().toString().trim(),
                        password.getText().toString().trim());
            }
        }

    }
}
