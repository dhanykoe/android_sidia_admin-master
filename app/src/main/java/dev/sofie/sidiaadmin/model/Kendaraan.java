package dev.sofie.sidiaadmin.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kendaraan implements Parcelable
{

    @SerializedName("id_kendaraan")
    @Expose
    private String idKendaraan;
    @SerializedName("id_unit")
    @Expose
    private String idUnit;
    @SerializedName("merek")
    @Expose
    private String merek;
    @SerializedName("tnkb")
    @Expose
    private String tnkb;
    @SerializedName("pemilik_dlm_stnk")
    @Expose
    private String pemilikDlmStnk;
    @SerializedName("jenis")
    @Expose
    private String jenis;
    @SerializedName("tahun")
    @Expose
    private String tahun;
    @SerializedName("cc")
    @Expose
    private String cc;
    @SerializedName("warna")
    @Expose
    private String warna;
    @SerializedName("no_rangka")
    @Expose
    private String noRangka;
    @SerializedName("no_mesin")
    @Expose
    private String noMesin;
    @SerializedName("stnk_mulai")
    @Expose
    private String stnkMulai;
    @SerializedName("stnk_akhir")
    @Expose
    private String stnkAkhir;
    @SerializedName("kondisi")
    @Expose
    private String kondisi;
    @SerializedName("no_stm")
    @Expose
    private String noStm;
    @SerializedName("tgl_stm")
    @Expose
    private String tglStm;
    @SerializedName("berlaku_stm")
    @Expose
    private String berlakuStm;
    @SerializedName("pembiayaan")
    @Expose
    private String pembiayaan;
    @SerializedName("keterangan")
    @Expose
    private String keterangan;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("created_by")
    @Expose
    private String createdBy;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
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
    public final static Parcelable.Creator<Kendaraan> CREATOR = new Creator<Kendaraan>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Kendaraan createFromParcel(Parcel in) {
            return new Kendaraan(in);
        }

        public Kendaraan[] newArray(int size) {
            return (new Kendaraan[size]);
        }

    }
            ;

    protected Kendaraan(Parcel in) {
        this.idKendaraan = ((String) in.readValue((String.class.getClassLoader())));
        this.idUnit = ((String) in.readValue((String.class.getClassLoader())));
        this.merek = ((String) in.readValue((String.class.getClassLoader())));
        this.tnkb = ((String) in.readValue((String.class.getClassLoader())));
        this.pemilikDlmStnk = ((String) in.readValue((String.class.getClassLoader())));
        this.jenis = ((String) in.readValue((String.class.getClassLoader())));
        this.tahun = ((String) in.readValue((String.class.getClassLoader())));
        this.cc = ((String) in.readValue((String.class.getClassLoader())));
        this.warna = ((String) in.readValue((String.class.getClassLoader())));
        this.noRangka = ((String) in.readValue((String.class.getClassLoader())));
        this.noMesin = ((String) in.readValue((String.class.getClassLoader())));
        this.stnkMulai = ((String) in.readValue((String.class.getClassLoader())));
        this.stnkAkhir = ((String) in.readValue((String.class.getClassLoader())));
        this.kondisi = ((String) in.readValue((String.class.getClassLoader())));
        this.noStm = ((String) in.readValue((String.class.getClassLoader())));
        this.tglStm = ((String) in.readValue((String.class.getClassLoader())));
        this.berlakuStm = ((String) in.readValue((String.class.getClassLoader())));
        this.pembiayaan = ((String) in.readValue((String.class.getClassLoader())));
        this.keterangan = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.createdBy = ((String) in.readValue((String.class.getClassLoader())));
        this.createdDate = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedBy = ((Object) in.readValue((Object.class.getClassLoader())));
        this.updatedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.deletedBy = ((Object) in.readValue((Object.class.getClassLoader())));
        this.deletedDate = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Kendaraan() {
    }

    public String getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getIdUnit() {
        return idUnit;
    }

    public void setIdUnit(String idUnit) {
        this.idUnit = idUnit;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTnkb() {
        return tnkb;
    }

    public void setTnkb(String tnkb) {
        this.tnkb = tnkb;
    }

    public String getPemilikDlmStnk() {
        return pemilikDlmStnk;
    }

    public void setPemilikDlmStnk(String pemilikDlmStnk) {
        this.pemilikDlmStnk = pemilikDlmStnk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getNoRangka() {
        return noRangka;
    }

    public void setNoRangka(String noRangka) {
        this.noRangka = noRangka;
    }

    public String getNoMesin() {
        return noMesin;
    }

    public void setNoMesin(String noMesin) {
        this.noMesin = noMesin;
    }

    public String getStnkMulai() {
        return stnkMulai;
    }

    public void setStnkMulai(String stnkMulai) {
        this.stnkMulai = stnkMulai;
    }

    public String getStnkAkhir() {
        return stnkAkhir;
    }

    public void setStnkAkhir(String stnkAkhir) {
        this.stnkAkhir = stnkAkhir;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public String getNoStm() {
        return noStm;
    }

    public void setNoStm(String noStm) {
        this.noStm = noStm;
    }

    public String getTglStm() {
        return tglStm;
    }

    public void setTglStm(String tglStm) {
        this.tglStm = tglStm;
    }

    public String getBerlakuStm() {
        return berlakuStm;
    }

    public void setBerlakuStm(String berlakuStm) {
        this.berlakuStm = berlakuStm;
    }

    public String getPembiayaan() {
        return pembiayaan;
    }

    public void setPembiayaan(String pembiayaan) {
        this.pembiayaan = pembiayaan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
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
        dest.writeValue(idKendaraan);
        dest.writeValue(idUnit);
        dest.writeValue(merek);
        dest.writeValue(tnkb);
        dest.writeValue(pemilikDlmStnk);
        dest.writeValue(jenis);
        dest.writeValue(tahun);
        dest.writeValue(cc);
        dest.writeValue(warna);
        dest.writeValue(noRangka);
        dest.writeValue(noMesin);
        dest.writeValue(stnkMulai);
        dest.writeValue(stnkAkhir);
        dest.writeValue(kondisi);
        dest.writeValue(noStm);
        dest.writeValue(tglStm);
        dest.writeValue(berlakuStm);
        dest.writeValue(pembiayaan);
        dest.writeValue(keterangan);
        dest.writeValue(status);
        dest.writeValue(createdBy);
        dest.writeValue(createdDate);
        dest.writeValue(updatedBy);
        dest.writeValue(updatedDate);
        dest.writeValue(deletedBy);
        dest.writeValue(deletedDate);
    }

    public int describeContents() {
        return 0;
    }

}
