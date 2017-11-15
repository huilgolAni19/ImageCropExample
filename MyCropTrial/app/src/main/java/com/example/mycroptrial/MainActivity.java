package com.example.mycroptrial;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button selectImage;
    static ImageView myImage;
    Data data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectImage = (Button) findViewById(R.id.btnSelect);
        myImage = (ImageView) findViewById(R.id.ImageView_image);
        selectImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent ii = new Intent(MainActivity.this,ImageCropActivity.class);
               startActivity(ii);
           }
       });
    }
    public static void setImage(Bitmap bitmap){
        myImage.setImageBitmap(bitmap);
    }

}
