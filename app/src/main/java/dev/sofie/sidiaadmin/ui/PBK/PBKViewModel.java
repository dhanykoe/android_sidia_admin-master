package dev.sofie.sidiaadmin.ui.PBK;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import dev.sofie.sidiaadmin.model.Permintaan;
import dev.sofie.sidiaadmin.service.Repository;


public class PBKViewModel extends ViewModel {

    private Repository apiRepository;
    private MutableLiveData<List<Permintaan>> pbkList;

    public MutableLiveData<List<Permintaan>> listPBK(Context mcontext, String statusPBK) {
        if (pbkList == null) {
            pbkList = new MutableLiveData<>();
            apiRepository = Repository.getInstance(mcontext);
            pbkList = this.apiRepository.getListPBK(statusPBK);
        }
        return pbkList;
    }
}
