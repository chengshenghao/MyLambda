package com.tcsl.mylambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String string = "hello Lambda";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这类能用Lambda表达式替代的匿名内部类有两个条件：必须是接口类型，只有一个抽象方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("csh", "run: "+string);
            }
        }).start();
        new Thread(() -> Log.i("csh", "onCreate: "+string)).start();
    }
}
