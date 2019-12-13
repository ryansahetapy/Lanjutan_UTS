package com.example.lanjutan_uts;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    EditText email, username, password;
    Button MASUK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.etxEmail);
        username = (EditText) findViewById(R.id.etxUsername);
        password = (EditText) findViewById(R.id.etxPassword);
        MASUK = (Button)findViewById(R.id.btnDaftar);

        MASUK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().length()==0){
                    //jika form Email belum di isi / masih kosong
                    email.setError("Email diperlukan!");
                }else if(username.getText().toString().length()==0){
                    //jika form Username belum di isi / masih kosong
                    username.setError("Username diperlukan!");
                }else if(password.getText().toString().length()==0){
                    //jika form Passwrod belum di isi / masih kosong
                    password.setError("Password diperlukan!");
                }else {
                    //jika form sudah terisi semua
                    Toast.makeText(getApplicationContext(), "Masuk Berhasil!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
}
