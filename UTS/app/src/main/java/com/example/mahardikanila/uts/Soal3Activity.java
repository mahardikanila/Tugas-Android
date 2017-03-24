package com.example.mahardikanila.uts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by mahardika on 12-Mar-17.
 */

public class Soal3Activity extends AppCompatActivity {

    private EditText mNama, mJumlah, mVoucher;
    private Button mButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);

        mNama = (EditText) findViewById(R.id.nama);
        mJumlah = (EditText) findViewById(R.id.jumlah);
        mVoucher = (EditText) findViewById(R.id.voucher);
        mButton = (Button) findViewById(R.id.button3);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soal3intent = new Intent(Soal3Activity.this, Hasil3Activity.class);

                String namaGorengan = mNama.getText().toString();
                String jumlahGor = mJumlah.getText().toString();
                String voucherGor = mVoucher.getText().toString();

                soal3intent.putExtra("nama", namaGorengan);
                soal3intent.putExtra("jumlah", jumlahGor);

                int jumlah = Integer.parseInt(jumlahGor);
                int harga = jumlah * 1000;
                String harganya = String.valueOf(harga);

                if (voucherGor.equals("tanggaltua")) {
                    double diskon = harga * 0.3;
                    String hargadiskon = String.valueOf(diskon);
                    soal3intent.putExtra("harga", hargadiskon);
					Toast.makeText(Soal3Activity.this, "SELAMAT ANDA MENDAPATKAN DISKON", Toast.LENGTH_LONG).show();
                } else {
                    soal3intent.putExtra("harga", harganya);

                }

                startActivity(soal3intent);
            }
        });

    }
}
