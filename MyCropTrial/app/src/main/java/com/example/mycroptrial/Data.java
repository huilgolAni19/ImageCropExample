package com.example.mycroptrial;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by Anirudh on 09/06/16.
 */
public class Data implements Serializable {
    ImageView imageView;

    public Data() {

    }

    public Data(ImageView imageView) {
        this.imageView = imageView;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
