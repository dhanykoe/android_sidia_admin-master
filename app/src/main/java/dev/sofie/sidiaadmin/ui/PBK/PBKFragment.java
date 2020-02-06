
package dev.sofie.sidiaadmin.ui.PBK;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.sofie.admin.R;
import dev.sofie.sidiaadmin.helper.SharedPreferecesHelper;
import dev.sofie.sidiaadmin.model.Permintaan;
import dev.sofie.sidiaadmin.model.User;

import static dev.sofie.sidiaadmin.ui.MainActivity.Pending;


/* renamed from: dev.sofie.sidia.ui.PBK.PBKFragment */
public class PBKFragment extends Fragment {
    static ProgressBar loading;

    /* renamed from: rv */
    static RecyclerView recyclerview;

    PBKAdapter mAdapter;
    PBKViewModel pbkViewModel;
    String status_pbk = Pending;

    public PBKFragment(String status_pbk) {
        this.status_pbk = status_pbk;
    }

    public static PBKFragment newInstance(String status_pbk) {
        return new PBKFragment(status_pbk);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pbk, container, false);
        loading = (ProgressBar) view.findViewById(R.id.progressBar);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview.addItemDecoration(new DividerItemDecoration(getContext(), 1));
        mAdapter = new PBKAdapter();
        recyclerview.setAdapter(this.mAdapter);

        pbkViewModel =  ViewModelProviders.of( this).get(PBKViewModel.class);
        pbkViewModel.listPBK(getContext(), status_pbk).observe(getViewLifecycleOwner(), new Observer<List<Permintaan>>() {
            public void onChanged(List<Permintaan> result) {
                mAdapter.addAll(result);
                mAdapter.notifyDataSetChanged();
            }
        });
        return view;
    }

    public static void showLoading(boolean status) {
        if (status) {
            loading.setVisibility(View.VISIBLE);
            recyclerview.setVisibility(View.GONE);
            return;
        }
        loading.setVisibility(View.GONE);
        recyclerview.setVisibility(View.VISIBLE);
    }
}
