package com.example.proyectofinal2020.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Somos una empresa de desarrollo de software con sede en la ciudad de Cochabamba. ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}