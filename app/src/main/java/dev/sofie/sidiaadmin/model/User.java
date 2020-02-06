package dev.sofie.sidiaadmin.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User implements Parcelable
{

    @SerializedName("id_pengguna")
    @Expose
    private String idPengguna;
    @SerializedName("pengguna")
    @Expose
    private String pengguna;
    @SerializedName("passx")
    @Expose
    private String passx;
    @SerializedName("nama_lengkap")
    @Expose
    private String namaLengkap;
    @SerializedName("role_level")
    @Expose
    private String roleLevel;
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
    private Object updatedDate;
    @SerializedName("deleted_by")
    @Expose
    private Object deletedBy;
    @SerializedName("deleted_date")
    @Expose
    private Object deletedDate;
    public final static Parcelable.Creator<User> CREATOR = new Creator<User>() {


        @SuppressWarnings({
                "unchecked"
        })
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        public User[] newArray(int size) {
            return (new User[size]);
        }

    }
            ;

    protected User(Parcel in) {
        this.idPengguna = ((String) in.readValue((String.class.getClassLoader())));
        this.pengguna = ((String) in.readValue((String.class.getClassLoader())));
        this.passx = ((String) in.readValue((String.class.getClassLoader())));
        this.namaLengkap = ((String) in.readValue((String.class.getClassLoader())));
        this.roleLevel = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.createdBy = ((String) in.readValue((String.class.getClassLoader())));
        this.createdDate = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedBy = ((Object) in.readValue((Object.class.getClassLoader())));
        this.updatedDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.deletedBy = ((Object) in.readValue((Object.class.getClassLoader())));
        this.deletedDate = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public User() {
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getPengguna() {
        return pengguna;
    }

    public void setPengguna(String pengguna) {
        this.pengguna = pengguna;
    }

    public String getPassx() {
        return passx;
    }

    public void setPassx(String passx) {
        this.passx = passx;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
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

    public Object getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Object updatedDate) {
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
        dest.writeValue(idPengguna);
        dest.writeValue(pengguna);
        dest.writeValue(passx);
        dest.writeValue(namaLengkap);
        dest.writeValue(roleLevel);
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
