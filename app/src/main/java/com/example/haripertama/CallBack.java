package com.example.haripertama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallBack extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_DATA = "DATA";

    // TODO 4.1 deklarasi
    Button btnCallBackDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_back);

        // TODO 4.2 inisisalisasi/hub dengan id nya masing masing
        btnCallBackDetail = findViewById(R.id.btn_call_back_detail);

        // TODO 4.3 event click listener/button something to do
        btnCallBackDetail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //TODO 4.4 kirim data callback nya
        Intent callBack = new Intent();
        callBack.putExtra(EXTRA_DATA,"ini data CallBack");
        setResult(RESULT_OK, callBack);

        // TODO 4.5 close activity saat ini
        finish();
    }
}
