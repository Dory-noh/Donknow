package com.inch.donknow.ui.announce;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AnnounceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AnnounceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("AnnounceFragment Placeholder");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
