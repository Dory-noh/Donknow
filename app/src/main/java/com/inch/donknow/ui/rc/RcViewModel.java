package com.inch.donknow.ui.rc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RcViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RcViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("RcFragment Placeholder");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
