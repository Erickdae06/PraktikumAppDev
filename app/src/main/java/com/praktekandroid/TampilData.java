package com.praktekandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TampilData extends AppCompatActivity {
//    global variable
    TextView tKdmatkul, tNamamatkul;
    String kdmatkul,namamatkul;

    @Override
    protected void onStart() {
        super.onStart();

        Intent intent = getIntent();
//        menerima transfer data dari intent
        tKdmatkul = findViewById(R.id.tv_kdmatkul);
        tNamamatkul = findViewById(R.id.tv_namamatkul);

        kdmatkul = intent.getStringExtra("TransferKodeMatkul");
        namamatkul = intent.getStringExtra("TransferNamaMatkul");

        tKdmatkul.setText(kdmatkul);
        tNamamatkul.setText(namamatkul);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);

        tKdmatkul = findViewById(R.id.tv_kdmatkul);
        tNamamatkul = findViewById(R.id.tv_namamatkul);
    }
}
