package com.example.helloworlduwu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.helloworlduwu.MESSAGE";
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate", "onCreate log");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "onStart log");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "onDestroy log");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "onPause log");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "onResume log");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("onRestart", "onRestart log");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "onStop log");
    }
}