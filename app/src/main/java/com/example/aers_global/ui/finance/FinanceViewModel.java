package com.example.aers_global.ui.finance;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FinanceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FinanceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Finance fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}