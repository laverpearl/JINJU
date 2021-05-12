package com.example.project9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageButton ibZoomin, ibZoomout, ibRotate, ibBright, ibDark, ibGray;
    MyGraphicView graphicView;

    static float scaleX = 1, scaleY =1;
    static float angle = 0;
    static float color = 1;
    static float satur = 1;

    private void clickIcons(){
        ibZoomin = (ImageButton) findViewById(R.id.ibZoomin);
        ibZoomin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                scaleX = scaleX + 0.2f;
                scaleY = scaleY + 0.2f;
                graphicView.invalidate();
            }
        });

        ibRotate = (ImageButton) findViewById(R.id.ibRotate);
        ibRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angle = angle +20;
                graphicView.invalidate();
            }
        });

        ibBright = (ImageButton) findViewById(R.id.ibBright);
        ibBright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                color = color + 0.2f;
                graphicView.invalidate();

            }
        });

        ibGray = (ImageButton) findViewById(R.id.ibGray);
        ibGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (satur == 0) satur = 1;
                else satur = 0;
                graphicView.invalidate();
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("201639298 김진주");
        clickIcons();

        LinearLayout pictureLayout = (LinearLayout) findViewById(R.id.pictureLayout);
        graphicView = (MyGraphicView) new MyGraphicView(this);
        pictureLayout.addView(graphicView);

    }

    private static class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super(context);
        }
    }



    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.rotate(angle, cenX, cenY);
        //canvas.scale();

        Bitmap picture = BitmapFactory.decodeResource(getResources(),
                R.drawable.jelly);

        int picX = (this.getWidth() - picture.getWidth()) /2;
        int picY = (this.getWidth() - picture.getWidth()) /2;
        int cenX = this.getWidth() /2;
        int cenY = this.getWidth() /2;

        Paint paint = new Paint();
        float[] array = { 2, 0, 0, 0, -25,
                          0, 2, 0, 0, -25,
                          0, 0, 2, 0, -25,
                          0, 0, 0, 1, 0, };

        if (satur == 0) cm.setSaturation(satur);

        ColorMatrix cm = new ColorMatrix(array);
        paint.setColorFilter(new ColorMatrixColorFilter(cm));

        canvas.drawBitmap(picture, picX, picY, paint);
        canvas.scale(scaleX, scaleY, cenX, cenY);

        picture.recycle();
    }

}