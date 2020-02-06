package dev.sofie.sidiaadmin.ui;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;


import dev.sofie.admin.R;
import dev.sofie.sidiaadmin.helper.SharedPreferecesHelper;
import dev.sofie.sidiaadmin.service.Repository;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment implements View.OnClickListener {
    EditText mPassword,mPasswordBaru,mRepeatPassword;
    private Repository apiRepository;
    private static ProgressBar mLoading;
    private static CardView mCard;
    private static CardView mLogoutCard;

    public ProfileFragment() {
        // Required empty public constructor
    }

    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        apiRepository = Repository.getInstance(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        Button mLogout = view.findViewById(R.id.logout);
        mLogout.setOnClickListener(this);
        Button mSubmit = view.findViewById(R.id.button);
        mSubmit.setOnClickListener(this);
        mPassword = view.findViewById(R.id.password);
        mPasswordBaru = view.findViewById(R.id.passbaru);
        mRepeatPassword = view.findViewById(R.id.confirmPassword);
        mLoading = view.findViewById(R.id.progressBar);
        mCard = view.findViewById(R.id.profileCard);
        mLogoutCard = view.findViewById(R.id.logoutCard);
        return view;
    }

    DialogInterface.OnClickListener mDialogInterface = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            switch (which){
                case DialogInterface.BUTTON_NEGATIVE:
                    SharedPreferecesHelper mShared =  SharedPreferecesHelper.newInstance(getContext());
                    mShared.clearUser();
                    getContext().startActivity(new Intent(getContext(),LoginActivity.class));
                    ((Activity)getContext()).finish();
                    break;

                case DialogInterface.BUTTON_POSITIVE:
                    //No button clicked
                    break;
            }
        }
    };

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.logout:
                AlertDialog.Builder mAlert = new AlertDialog.Builder(getContext());
                mAlert.setMessage("Apakah anda ingin keluar ?")
                        .setNegativeButton(" Ya",mDialogInterface)
                        .setPositiveButton("Tidak", mDialogInterface);

                mAlert.show();
                break;
            case R.id.button:
                if(checkValidation()){
                    apiRepository.ubahPassword(mPassword.getText().toString().trim(), mPasswordBaru.getText().toString().trim());
                };
            break;
        }

    }

    public boolean checkValidation() {
        if (mPassword.getText().length() == 0) {
            this.mPassword.setError("Silahkan Masukkan Password !");
            return false;
        } else if (mPasswordBaru.getText().length() == 0) {
            this.mPasswordBaru.setError("Silahkan Masukkan Password Baru !");
            return false;
        } else if (mRepeatPassword.getText().length() == 0) {
            this.mRepeatPassword.setError("Silahkan Masukkan Ulangi Password !");
            return false;
        }  else if (mPasswordBaru.getText().length() != mRepeatPassword.getText().length() ) {
            this.mPasswordBaru.setError("Password Baru dan Ulangin Password tidak sama !");
            this.mRepeatPassword.setError("Password Baru dan Ulangin Password tidak sama !");
            return false;
        }else if (mPasswordBaru.getText().length() == mRepeatPassword.getText().length() ) {
            return true;
        }else{
            return true;
        }
    }

    public static void showLoading(boolean status){
            if(status){
                mLoading.setVisibility(View.VISIBLE);
                mCard.setVisibility(View.GONE);
                mLogoutCard.setVisibility(View.GONE);
            }else{
                mLoading.setVisibility(View.GONE);
                mCard.setVisibility(View.VISIBLE);
                mLogoutCard.setVisibility(View.VISIBLE);
            }
    }
}
