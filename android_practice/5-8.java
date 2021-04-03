package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
=======
import android.widget.LinearLayout;
>>>>>>> 36446bdd2aef3b7e31b715fa679440ef1f9b0ab7

public class MainActivity extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        setContentView(baseLayout,params);

<<<<<<< HEAD
//버튼까지 추가
        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(android.R.color.black);
        baseLayout.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "코드로 생성한 버튼입니다.", Toast.LENGTH_SHORT).show();

            }
        });
        
=======
>>>>>>> 36446bdd2aef3b7e31b715fa679440ef1f9b0ab7
    }
}