package dev.sofie.sidiaadmin.ui.PBK;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dev.sofie.admin.R;
import dev.sofie.sidiaadmin.helper.DateTimeConvert;
import dev.sofie.sidiaadmin.helper.MoneyConvert;
import dev.sofie.sidiaadmin.model.Permintaan;
import dev.sofie.sidiaadmin.ui.DetailPBKActivity;



public class PBKAdapter extends RecyclerView.Adapter<PBKAdapter.PBKViewHolder> {
    List<Permintaan> permintaanList = new ArrayList<>();
    public Context mContext;
    @NonNull
    @Override
    public PBKViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        return new PBKViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pbk, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PBKViewHolder holder, int position) {
            holder.bind(permintaanList.get(position));
    }

    @Override
    public int getItemCount() {
        return permintaanList.size();
    }

    public void addAll(List<Permintaan> result) {
        permintaanList.addAll(result);
    }

    class PBKViewHolder extends RecyclerView.ViewHolder {
        private TextView mKeterangan,mStatus,mTanggal,mTotal;
        private ConstraintLayout pbkLayout;
         public PBKViewHolder(@NonNull View itemView) {
             super(itemView);
             mKeterangan = itemView.findViewById(R.id.keterangan);
             mStatus = itemView.findViewById(R.id.status);
             mTanggal = itemView.findViewById(R.id.tanggal);
             mTotal = itemView.findViewById(R.id.total);
             pbkLayout = itemView.findViewById(R.id.pbkLayouts);
         }

         public void bind(final Permintaan permintaan){
             mKeterangan.setText(permintaan.getAtasNama());
             mTanggal.setText(DateTimeConvert.dateOnly(permintaan.getCreatedAt()));
             mTotal.setText(MoneyConvert.keRupiah(Double.valueOf(permintaan.getJumlah())));
             mStatus.setText(permintaan.getStatusPbk());
             pbkLayout.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent = new Intent(mContext, DetailPBKActivity.class);
                     intent.putExtra(DetailPBKActivity.TAG,permintaan);
                     mContext.startActivity(intent);
                 }
             });
         }
     }
}
