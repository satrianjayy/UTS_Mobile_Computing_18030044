package com.example.uts_18030044;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Halaman_1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* ini adalah method untuk menjalankan fungsi dari send data  */
    public void send_data(View view) {
        RadioGroup inputkan_kelas = findViewById(R.id.inputkan_kelas);
            EditText inputkan_nama = findViewById(R.id.inputkan_nama);
                EditText inputkan_nim = findViewById(R.id.inputkan_nim);

        /* intent ini berfungsi untuk memasuki ke halaman berikutnya  */
            String nim = inputkan_nim.getText().toString();
            String nama = inputkan_nama.getText().toString();
            int kelas = inputkan_kelas.getCheckedRadioButtonId();
            RadioButton ruang = findViewById(kelas);
            String kelass = String.valueOf(ruang.getText().toString());

            /* intent ini berfungsi untuk memasuki kehalaman berikutnya  */
            Intent intent = new Intent(this, Halaman_2.class);
            intent.putExtra("Kelas", kelass);
             intent.putExtra("Nama", nama);
              intent.putExtra("Nim", nim);

            startActivity(intent);

    }
}