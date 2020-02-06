package dev.sofie.sidiaadmin.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permintaan implements Parcelable
{

    @SerializedName("id_permintaan")
    @Expose
    private String idPermintaan;
    @SerializedName("id_unit")
    @Expose
    private String idUnit;
    @SerializedName("id_supir")
    @Expose
    private String idSupir;
    @SerializedName("id_kendaraan")
    @Expose
    private String idKendaraan;
    @SerializedName("tgl_kmawal")
    @Expose
    private String tglKmawal;
    @SerializedName("kmawal")
    @Expose
    private String kmawal;
    @SerializedName("tgl_kmakhir")
    @Expose
    private String tglKmakhir;
    @SerializedName("kmakhir")
    @Expose
    private String kmakhir;
    @SerializedName("waktu")
    @Expose
    private String waktu;
    @SerializedName("jarak")
    @Expose
    private String jarak;
    @SerializedName("invoice")
    @Expose
    private String invoice;
    @SerializedName("bahan_bakar")
    @Expose
    private String bahanBakar;
    @SerializedName("pelumas")
    @Expose
    private String pelumas;
    @SerializedName("ban")
    @Expose
    private String ban;
    @SerializedName("spare")
    @Expose
    private String spare;
    @SerializedName("servis_berkala")
    @Expose
    private String servisBerkala;
    @SerializedName("servis_ringan")
    @Expose
    private String servisRingan;
    @SerializedName("servis_berat")
    @Expose
    private String servisBerat;
    @SerializedName("biaya_uji")
    @Expose
    private String biayaUji;
    @SerializedName("stnk")
    @Expose
    private String stnk;
    @SerializedName("lain")
    @Expose
    private String lain;
    @SerializedName("keterangan_lain")
    @Expose
    private String keteranganLain;
    @SerializedName("foto_kmakhir")
    @Expose
    private String fotoKmakhir;
    @SerializedName("jumlah")
    @Expose
    private String jumlah;
    @SerializedName("penjual")
    @Expose
    private String penjual;
    @SerializedName("alamat")
    @Expose
    private String alamat;
    @SerializedName("telepon")
    @Expose
    private String telepon;
    @SerializedName("bank")
    @Expose
    private String bank;
    @SerializedName("no_rek")
    @Expose
    private String noRek;
    @SerializedName("atas_nama")
    @Expose
    private String atasNama;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("status_pbk")
    @Expose
    private String statusPbk;
    @SerializedName("approve_by")
    @Expose
    private Object approveBy;
    @SerializedName("approve_date")
    @Expose
    private Object approveDate;
    @SerializedName("updated_by")
    @Expose
    private Object updatedBy;
    @SerializedName("updated_date")
    @Expose
    private String updatedDate;
    @SerializedName("deleted_by")
    @Expose
    private Object deletedBy;
    @SerializedName("deleted_date")
    @Expose
    private Object deletedDate;
    public final static Parcelable.Creator<Permintaan> CREATOR = new Creator<Permintaan>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Permintaan createFromParcel(Parcel in) {
            return new Permintaan(in);
        }

        public Permintaan[] newArray(int size) {
            return (new Permintaan[size]);
        }

    }
            ;

    protected Permintaan(Parcel in) {
        this.idPermintaan = ((String) in.readValue((String.class.getClassLoader())));
        this.idUnit = ((String) in.readValue((String.class.getClassLoader())));
        this.idSupir = ((String) in.readValue((String.class.getClassLoader())));
        this.idKendaraan = ((String) in.readValue((String.class.getClassLoader())));
        this.tglKmawal = ((String) in.readValue((String.class.getClassLoader())));
        this.kmawal = ((String) in.readValue((String.class.getClassLoader())));
        this.tglKmakhir = ((String) in.readValue((String.class.getClassLoader())));
        this.kmakhir = ((String) in.readValue((String.class.getClassLoader())));
        this.waktu = ((String) in.readValue((String.class.getClassLoader())));
        this.jarak = ((String) in.readValue((String.class.getClassLoader())));
        this.invoice = ((String) in.readValue((String.class.getClassLoader())));
        this.bahanBakar = ((String) in.readValue((String.class.getClassLoader())));
        this.pelumas = ((String) in.readValue((String.class.getClassLoader())));
        this.ban = ((String) in.readValue((String.class.getClassLoader())));
        this.spare = ((String) in.readValue((String.class.getClassLoader())));
        this.servisBerkala = ((String) in.readValue((String.class.getClassLoader())));
        this.servisRingan = ((String) in.readValue((String.class.getClassLoader())));
        this.servisBerat = ((String) in.readValue((String.class.getClassLoader())));
        this.biayaUji = ((String) in.readValue((String.class.getClassLoader())));
        this.stnk = ((String) in.readValue((String.class.getClassLoader())));
        this.lain = ((String) in.readValue((String.class.getClassLoader())));
        this.keteranganLain = ((String) in.readValue((String.class.getClassLoader())));
        this.fotoKmakhir = ((String) in.readValue((String.class.getClassLoader())));
        this.jumlah = ((String) in.readValue((String.class.getClassLoader())));
        this.penjual = ((String) in.readValue((String.class.getClassLoader())));
        this.alamat = ((String) in.readValue((String.class.getClassLoader())));
        this.telepon = ((String) in.readValue((String.class.getClassLoader())));
        this.bank = ((String) in.readValue((String.class.getClassLoader())));
        this.noRek = ((String) in.readValue((String.class.getClassLoader())));
        this.atasNama = ((String) in.readValue((String.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.statusPbk = ((String) in.readValue((String.class.getClassLoader())));
        this.approveBy = ((Object) in.readValue((Object.class.getClassLoader())));
        this.approveDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.updatedBy = ((Object) in.readValue((Object.class.getClassLoader())));
        this.updatedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.deletedBy = ((Object) in.readValue((Object.class.getClassLoader())));
        this.deletedDate = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Permintaan() {
    }

    public String getIdPermintaan() {
        return idPermintaan;
    }

    public void setIdPermintaan(String idPermintaan) {
        this.idPermintaan = idPermintaan;
    }

    public String getIdUnit() {
        return idUnit;
    }

    public void setIdUnit(String idUnit) {
        this.idUnit = idUnit;
    }

    public String getIdSupir() {
        return idSupir;
    }

    public void setIdSupir(String idSupir) {
        this.idSupir = idSupir;
    }

    public String getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getTglKmawal() {
        return tglKmawal;
    }

    public void setTglKmawal(String tglKmawal) {
        this.tglKmawal = tglKmawal;
    }

    public String getKmawal() {
        return kmawal;
    }

    public void setKmawal(String kmawal) {
        this.kmawal = kmawal;
    }

    public String getTglKmakhir() {
        return tglKmakhir;
    }

    public void setTglKmakhir(String tglKmakhir) {
        this.tglKmakhir = tglKmakhir;
    }

    public String getKmakhir() {
        return kmakhir;
    }

    public void setKmakhir(String kmakhir) {
        this.kmakhir = kmakhir;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getPelumas() {
        return pelumas;
    }

    public void setPelumas(String pelumas) {
        this.pelumas = pelumas;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public String getSpare() {
        return spare;
    }

    public void setSpare(String spare) {
        this.spare = spare;
    }

    public String getServisBerkala() {
        return servisBerkala;
    }

    public void setServisBerkala(String servisBerkala) {
        this.servisBerkala = servisBerkala;
    }

    public String getServisRingan() {
        return servisRingan;
    }

    public void setServisRingan(String servisRingan) {
        this.servisRingan = servisRingan;
    }

    public String getServisBerat() {
        return servisBerat;
    }

    public void setServisBerat(String servisBerat) {
        this.servisBerat = servisBerat;
    }

    public String getBiayaUji() {
        return biayaUji;
    }

    public void setBiayaUji(String biayaUji) {
        this.biayaUji = biayaUji;
    }

    public String getStnk() {
        return stnk;
    }

    public void setStnk(String stnk) {
        this.stnk = stnk;
    }

    public String getLain() {
        return lain;
    }

    public void setLain(String lain) {
        this.lain = lain;
    }

    public String getKeteranganLain() {
        return keteranganLain;
    }

    public void setKeteranganLain(String keteranganLain) {
        this.keteranganLain = keteranganLain;
    }

    public String getFotoKmakhir() {
        return fotoKmakhir;
    }

    public void setFotoKmakhir(String fotoKmakhir) {
        this.fotoKmakhir = fotoKmakhir;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getPenjual() {
        return penjual;
    }

    public void setPenjual(String penjual) {
        this.penjual = penjual;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNoRek() {
        return noRek;
    }

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public String getAtasNama() {
        return atasNama;
    }

    public void setAtasNama(String atasNama) {
        this.atasNama = atasNama;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusPbk() {
        return statusPbk;
    }

    public void setStatusPbk(String statusPbk) {
        this.statusPbk = statusPbk;
    }

    public Object getApproveBy() {
        return approveBy;
    }

    public void setApproveBy(Object approveBy) {
        this.approveBy = approveBy;
    }

    public Object getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Object approveDate) {
        this.approveDate = approveDate;
    }

    public Object getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Object getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(Object deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Object getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Object deletedDate) {
        this.deletedDate = deletedDate;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(idPermintaan);
        dest.writeValue(idUnit);
        dest.writeValue(idSupir);
        dest.writeValue(idKendaraan);
        dest.writeValue(tglKmawal);
        dest.writeValue(kmawal);
        dest.writeValue(tglKmakhir);
        dest.writeValue(kmakhir);
        dest.writeValue(waktu);
        dest.writeValue(jarak);
        dest.writeValue(invoice);
        dest.writeValue(bahanBakar);
        dest.writeValue(pelumas);
        dest.writeValue(ban);
        dest.writeValue(spare);
        dest.writeValue(servisBerkala);
        dest.writeValue(servisRingan);
        dest.writeValue(servisBerat);
        dest.writeValue(biayaUji);
        dest.writeValue(stnk);
        dest.writeValue(lain);
        dest.writeValue(keteranganLain);
        dest.writeValue(fotoKmakhir);
        dest.writeValue(jumlah);
        dest.writeValue(penjual);
        dest.writeValue(alamat);
        dest.writeValue(telepon);
        dest.writeValue(bank);
        dest.writeValue(noRek);
        dest.writeValue(atasNama);
        dest.writeValue(createdAt);
        dest.writeValue(status);
        dest.writeValue(statusPbk);
        dest.writeValue(approveBy);
        dest.writeValue(approveDate);
        dest.writeValue(updatedBy);
        dest.writeValue(updatedDate);
        dest.writeValue(deletedBy);
        dest.writeValue(deletedDate);
    }

    public int describeContents() {
        return 0;
    }

}
