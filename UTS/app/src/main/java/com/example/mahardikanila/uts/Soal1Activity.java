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

public class Soal1Activity extends AppCompatActivity {

    private EditText mNama, mJumlah;
    private Button mButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);

        mNama = (EditText)findViewById(R.id.nama);
        mJumlah = (EditText)findViewById(R.id.jumlah);
        mButton = (Button)findViewById(R.id.next);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soal1intent = new Intent (Soal1Activity.this, Hasil1Activity.class);

                String namanya = mNama.getText().toString();
                String jumlahnya = mJumlah.getText().toString();

                int angka = Integer.parseInt(jumlahnya);
                int hasilnya = angka*5000;
                String hasiljumlah = String.valueOf(hasilnya);

                soal1intent.putExtra("nama", namanya);
                soal1intent.putExtra("jumlah", hasiljumlah);

                startActivity(soal1intent);
            }
        });

    }
}
