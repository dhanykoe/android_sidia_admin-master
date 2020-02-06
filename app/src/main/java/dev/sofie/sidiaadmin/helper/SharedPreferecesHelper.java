package dev.sofie.sidiaadmin.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import dev.sofie.sidiaadmin.model.User;

public class SharedPreferecesHelper {
    public static String SupirPreferences = "User";
    public Context mContext;

    public SharedPreferecesHelper(Context context) {
        this.mContext = context;
    }

    public static SharedPreferecesHelper newInstance(Context context) {
        return new SharedPreferecesHelper(context);
    }

    public void setUser(User User) {
        Editor editor = this.mContext.getSharedPreferences(SupirPreferences, 0).edit();
        editor.putString("id", User.getIdPengguna().toString());
        editor.putString("nama", User.getPengguna());
        editor.putString("role", User.getRoleLevel());
        editor.apply();
    }

    public User getUser() {
        User User = new User();
        SharedPreferences perf = this.mContext.getSharedPreferences(SupirPreferences, 0);
        String str = "";
        User.setIdPengguna(perf.getString("id", str));
        User.setPengguna(perf.getString("nama", str));
        User.setRoleLevel(perf.getString("role", str));
        return User;
    }

    public void clearUser() {
        Editor editor = this.mContext.getSharedPreferences(SupirPreferences, 0).edit();
        editor.clear();
        editor.commit();
    }
}
