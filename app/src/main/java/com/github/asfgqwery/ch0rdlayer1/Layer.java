package com.github.asfgqwery.ch0rdlayer1;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;

public class Layer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView3 = findViewById(R.id.image_view_3);
        ImageView imageView4 = findViewById(R.id.image_view_4);
        AssetManager assets = getResources().getAssets();

        try (InputStream istream1 = assets.open("tesss.png")){
            Bitmap bitmap = BitmapFactory.decodeStream(istream1);
            imageView3.setImageBitmap(bitmap);
        } catch (Exception e){
            e.printStackTrace();
        }


        try (InputStream istream2 = assets.open("cat1.jpg")){
            Bitmap bitmap = BitmapFactory.decodeStream(istream2);
            imageView4.setImageBitmap(bitmap);
        } catch (Exception e){
            e.printStackTrace();
        }





    }
