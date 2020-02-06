package dev.sofie.sidiaadmin.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import dev.sofie.admin.R;
import dev.sofie.sidiaadmin.helper.DateTimeConvert;
import dev.sofie.sidiaadmin.helper.MoneyConvert;
import dev.sofie.sidiaadmin.helper.SharedPreferecesHelper;
import dev.sofie.sidiaadmin.model.ApiResponse;
import dev.sofie.sidiaadmin.model.Permintaan;
import dev.sofie.sidiaadmin.model.User;
import dev.sofie.sidiaadmin.service.Repository;

import static dev.sofie.sidiaadmin.ui.MainActivity.Approve;
import static dev.sofie.sidiaadmin.ui.MainActivity.Proses;


public class DetailPBKActivity extends AppCompatActivity implements View.OnClickListener{
    public static String TAG = "detail_pbk";
    private TextView kendaraan,tglKmLalu,kmLalu,tglKmSekarang,
                     kmSekarang,bahanBakar,pelumas,ban,perkakas,
                     berkala,ringan,berat,uji,stnk,lain,ketlain,
                     dealer,alamat,telepon,bank,rekening,atasNama;
    public static TextView header;

    private Button proses,approve;
    private static CardView cardView2,cardView3,cardView4;

    private static ProgressBar loading;

    private Repository apiRepository;

    private  Permintaan permintaan;

    public static void showLoading(boolean status) {
        if (status) {
            loading.setVisibility(View.VISIBLE);
            cardView2.setVisibility(View.GONE);
            cardView3.setVisibility(View.GONE);
            cardView4.setVisibility(View.GONE);
            header.setVisibility(View.GONE);
            return;
        }
        loading.setVisibility(View.GONE);
        header.setVisibility(View.VISIBLE);
        cardView2.setVisibility(View.VISIBLE);
        cardView3.setVisibility(View.VISIBLE);
        cardView4.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pbk);
        Intent intent = getIntent();
        permintaan  = intent.getParcelableExtra(TAG);
        initUI();
        apiRepository = Repository.getInstance(this);

    }

    public void initUI(){
        loading = findViewById(R.id.loading);
        header = findViewById(R.id.textView5);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);
         proses = findViewById(R.id.proses);
         proses.setOnClickListener(this);
         approve = findViewById(R.id.approve);
         approve.setOnClickListener(this);
         kendaraan = findViewById(R.id.kendaraan);
         tglKmLalu = findViewById(R.id.tglLalu);
         kmLalu = findViewById(R.id.kmLalu);
         tglKmSekarang = findViewById(R.id.tglSekarang);
         kmSekarang = findViewById(R.id.kmSekarang);
         bahanBakar = findViewById(R.id.bahanBakar);
         pelumas = findViewById(R.id.pelumas);
         ban = findViewById(R.id.ban);
         perkakas = findViewById(R.id.perkakas);
         berkala = findViewById(R.id.berkala);
         ringan = findViewById(R.id.ringan);
         berat = findViewById(R.id.berat);
         stnk = findViewById(R.id.stnk);
         lain = findViewById(R.id.lain);
         ketlain = findViewById(R.id.ketlain);
         dealer = findViewById(R.id.dealer);
         alamat = findViewById(R.id.alamat);
         telepon = findViewById(R.id.telepon);
         bank = findViewById(R.id.bank);
         rekening = findViewById(R.id.rekening);
         atasNama = findViewById(R.id.an);



        if(permintaan.getStatusPbk().equals(Approve)){
                approve.setVisibility(View.GONE);
                proses.setVisibility(View.GONE);
         }else if(permintaan.getStatusPbk().equals(MainActivity.Proses)){
                proses.setVisibility(View.GONE);
         }else if(permintaan.getStatusPbk().equals(MainActivity.Pending)){
                approve.setVisibility(View.GONE);
        }

        SharedPreferecesHelper helper = SharedPreferecesHelper.newInstance(this);
        User user = helper.getUser();
        if(user.getRoleLevel().equals("admin")){
            approve.setVisibility(View.GONE);
        }

        tglKmLalu.setText( DateTimeConvert.dateOnly(permintaan.getTglKmawal()) );
        kmLalu.setText( permintaan.getKmawal());
        tglKmSekarang.setText(DateTimeConvert.dateOnly(permintaan.getTglKmakhir()) );
        kmSekarang.setText( permintaan.getKmakhir());
        bahanBakar.setText(MoneyConvert.keRupiah(Double.valueOf(permintaan.getBahanBakar())) );
        pelumas.setText( MoneyConvert.keRupiah(Double.valueOf(permintaan.getPelumas())));
        ban.setText(MoneyConvert.keRupiah(Double.valueOf(permintaan.getBan())));
        perkakas.setText(MoneyConvert.keRupiah(Double.valueOf(permintaan.getSpare())));
        berkala.setText(MoneyConvert.keRupiah(Double.valueOf(permintaan.getServisBerkala())));
        ringan.setText( MoneyConvert.keRupiah(Double.valueOf(permintaan.getServisRingan())));
        berat.setText( MoneyConvert.keRupiah(Double.valueOf(permintaan.getServisBerat())));
        stnk.setText(MoneyConvert.keRupiah(Double.valueOf(permintaan.getStnk())));
        lain.setText(MoneyConvert.keRupiah(Double.valueOf(permintaan.getLain())));
        ketlain.setText( permintaan.getKeteranganLain());
        dealer.setText(permintaan.getPenjual());
        alamat.setText(permintaan.getAlamat());
        telepon.setText(permintaan.getTelepon());
        bank.setText(permintaan.getBank());
        rekening.setText(permintaan.getNoRek());
        atasNama.setText(permintaan.getAtasNama());
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.approve:
                showALert(Approve);
                break;
            case R.id.proses:
                showALert(Proses);
                break;
        }
    }

    public void showALert(final String status){
        AlertDialog.Builder mAlert = new AlertDialog.Builder(this);
        mAlert.setMessage("Yakin ingin memproses data ?")
                .setNegativeButton(" Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        apiRepository.updatePermintaanStatus(permintaan.getIdPermintaan(),status);
                    }
                })
                .setPositiveButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        mAlert.show();


    }




}
