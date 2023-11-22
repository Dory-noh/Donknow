package com.inch.donknow.ui.rc_place;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RcPlaceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RcPlaceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("RcPlaceFragment Placeholder");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
