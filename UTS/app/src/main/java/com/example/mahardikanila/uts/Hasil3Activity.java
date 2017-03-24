package com.example.mahardikanila.uts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by mahardika on 12-Mar-17.
 */

public class Hasil3Activity extends AppCompatActivity {

    private TextView mNama, mJumlah, mHarga;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_3);

        mNama = (TextView) findViewById(R.id.nama);
        mJumlah = (TextView) findViewById(R.id.jumlah);
        mHarga = (TextView) findViewById(R.id.harga);

        String nama = getIntent().getExtras().getString("nama");
        String jumlah = getIntent().getExtras().getString("jumlah");
        String harga = getIntent().getExtras().getString("harga");

        mNama.setText(nama);
        mJumlah.setText(jumlah);
        mHarga.setText(harga);
    }
}
