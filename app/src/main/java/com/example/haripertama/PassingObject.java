package com.example.haripertama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.haripertama.model.Orang;

public class PassingObject extends AppCompatActivity {

    public static final String EXTRA_OBJECT = "OBJECT";

    //TODO 3.1 DEKLARASI
    TextView TvDataReceivedObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_object);

        // TODO 3.2 inisialisasi/hubungkan dengan id nya masing masing
        TvDataReceivedObj = findViewById(R.id.tv_data_received_obj);

        // TODO 3.4 Get data object orang dengan parcelable
        Orang objectOrang = getIntent().getParcelableExtra(EXTRA_OBJECT);

        // TODO 3.5 tampung dalam variable
        String tampung = "Name : " + objectOrang.getName()
                + "\nAge : " + objectOrang.getAge()
                + "\nAge : " + objectOrang.getJob()
                + "\nAge : " + objectOrang.getAsal()
                + "\nAge : " + objectOrang.getTinggal();

        // TODO 3.6 show ke view
        TvDataReceivedObj.setText(tampung);
    }
}
