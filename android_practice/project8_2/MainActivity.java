package com.example.project8_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.view.DragAndDropPermissionsCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button btnPrev, btnNext;
    myPictureView myPicture;
    int curNum=1;
    File[] imageFiles;
    String imageFname;

    @SuppressLint("SdCardPath")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("201639298 김진주");

        ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE},
                MODE_PRIVATE);

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext= (Button) findViewById(R.id.btnNext);
        myPicture = (myPictureView) findViewById(R.id.myPrictureView1);

        imageFiles = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/sdcard/Pictures").listFiles();
        imageFname = imageFiles[1].toString();
        myPicture.imagePath = imageFname;



        //java코드 3부분
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                if (curNum <= 1) {
                    Toast.makeText(getApplicationContext(), "첫번째 그림입니다.", Toast.LENGTH_SHORT).show();
                } else {
                    curNum --;
                    imageFname = imageFiles[curNum].toString();
                    myPicture.imagePath=imageFname;
                    myPicture.invalidate();
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                if (curNum >= imageFiles.length-1) {
                    Toast.makeText(getApplicationContext(), "마지막 그림입니다.", Toast.LENGTH_SHORT).show();
                } else {
                    curNum ++;
                    imageFname = imageFiles[curNum].toString();
                    myPicture.imagePath=imageFname;
                    myPicture.invalidate();
                }
            }
        });





    }
}