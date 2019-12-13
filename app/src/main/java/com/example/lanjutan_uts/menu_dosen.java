package com.example.lanjutan_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menu_dosen extends AppCompatActivity {
    Button btn_datadiri, btnKrs, btnKls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dosen);

        btn_datadiri = (Button) findViewById(R.id.btn_datadiri);
        btn_datadiri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol DATA DIRI", Toast.LENGTH_SHORT).show();

            }
        });

        btnKrs = (Button) findViewById(R.id.btnKrs);
        btnKrs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol LiKRS", Toast.LENGTH_SHORT).show();

            }
        });

        btnKls = (Button) findViewById(R.id.btnKls);
        btnKls.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol Lihat Kelas", Toast.LENGTH_SHORT).show();

            }
        });
    }


}
