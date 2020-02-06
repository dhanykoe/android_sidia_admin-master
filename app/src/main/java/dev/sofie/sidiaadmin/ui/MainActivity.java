package dev.sofie.sidiaadmin.ui;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import dev.sofie.admin.R;
import dev.sofie.sidiaadmin.helper.SharedPreferecesHelper;
import dev.sofie.sidiaadmin.model.User;
import dev.sofie.sidiaadmin.ui.PBK.PBKFragment;


public class MainActivity extends AppCompatActivity {
    public static String Approve = "approve";
    public static String Pending = "pending";
    public static String Proses = "proses";
    User user;
    BottomNavigationView navigation;
    BottomNavigationView.OnNavigationItemSelectedListener selectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        public boolean onNavigationItemSelected(MenuItem menuItem) {
//            MainActivity mainActivity = MainActivity.this;
//            mainActivity.loadFragment(PBKFragment.newInstance(Approve));
            int itemId = menuItem.getItemId();
            if (itemId == R.id.bottomApprove) {
                loadFragment(PBKFragment.newInstance(Approve));
                return true;
            } else if (itemId == R.id.bottomPending) {
                loadFragment(PBKFragment.newInstance(Pending));
                return true;
            } else if (itemId == R.id.bottomProses) {
                loadFragment(PBKFragment.newInstance(Proses));
                return true;
            }
            else if (itemId == R.id.profile) {
                loadFragment(ProfileFragment.newInstance());
                return true;
            } else{
                return  false;
            }
        }
    };

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.user = SharedPreferecesHelper.newInstance(this).getUser();
        loadFragment(PBKFragment.newInstance(Approve));
        this.navigation = findViewById(R.id.navigation);
        SharedPreferecesHelper helper = SharedPreferecesHelper.newInstance(this);
        User user = helper.getUser();
         if(user.getRoleLevel().equals("admin")){
             navigation.getMenu().removeItem(R.id.bottomApprove);
         }

        this.navigation.setSelectedItemId(0);
        this.navigation.setOnNavigationItemSelectedListener(this.selectedListener);
    }

    public void loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container_layout, fragment).commit();
        }
    }
}
