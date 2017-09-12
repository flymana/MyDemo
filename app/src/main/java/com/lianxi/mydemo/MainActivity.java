package com.lianxi.mydemo;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TCG","创建");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TCG","启动");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TCG","运行");
     }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TCG","停止");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TCG","暂停");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TCG","重启");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TCG","销毁");
    }

    public void show(){
        Log.e("Tcg", "---------");
    }

}
