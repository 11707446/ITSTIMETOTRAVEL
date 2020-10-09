package com.example.itstimetotravel.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("It is a touristic app designed and developed by:\n" +
                "KONDEPUDI SAI GANESH SWAMY");
    }

    public LiveData<String> getText() {
        return mText;
    }
}