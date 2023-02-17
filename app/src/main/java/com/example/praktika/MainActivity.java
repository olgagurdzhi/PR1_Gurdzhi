package com.example.praktika;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"C возвращением!",Toast.LENGTH_SHORT).show();
        Log.w(TAG,"Открыто");


    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(),"Хорошего дня!",Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Вышел");
        if (isFinishing()){
            finish();
        }
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(),"До свидания!",Toast.LENGTH_SHORT).show();
        Log.v(TAG,"Off programm");
        super.onDestroy();
        finish();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf(TAG, "What happened");
        Log.d(TAG, "Debug msg");
        Toast.makeText(getApplicationContext(),"On Pause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.wtf(TAG,"Hmmm...");
        Toast.makeText(getApplicationContext(),"Метро Люблино работаем",Toast.LENGTH_SHORT).show();
    }
}