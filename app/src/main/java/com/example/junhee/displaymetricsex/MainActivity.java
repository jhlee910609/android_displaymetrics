package com.example.junhee.displaymetricsex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        // 1. 사용자의 Device 스크린 정보를 가져올 수 있는 default 객체이다.
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        // 2. DisplayMetrics 내부 멤버베변수들을 TextView에 뿌려본다.
        tv.setText("density : " + displayMetrics.density + "\n"
                + "densitiyDpi : " + displayMetrics.densityDpi + "\n"
                + "widthPixels : " + displayMetrics.widthPixels + "\n"
                + "heightPixels : " + displayMetrics.heightPixels + "\n"
                + "scaledDensity : " + displayMetrics.scaledDensity + "\n");
    }
}
