package com.example.mahardikanila.uts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mahardika on 12-Mar-17.
 */

public class Hasil2Activity extends AppCompatActivity {

    private TextView mNama, mPenumpang, mHarga;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_2);

        mNama = (TextView)findViewById(R.id.nama);
        mPenumpang = (TextView) findViewById(R.id.penumpang);
        mHarga = (TextView)findViewById(R.id.harga);

        String nama = getIntent().getExtras().getString("nama");
        String penumpang = getIntent().getExtras().getString("banyak");
        String harga = getIntent().getExtras().getString("harga");

        mNama.setText(nama);
        mPenumpang.setText(penumpang);
        mHarga.setText(harga);

        Toast.makeText(Hasil2Activity.this, "Jangan Lupa Bayar Sebelum Tgl 30 Februari", Toast.LENGTH_LONG).show();

    }
}
