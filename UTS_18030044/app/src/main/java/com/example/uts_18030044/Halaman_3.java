package com.example.uts_18030044;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Halaman_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_3);

        /* ini berfungsi untuk memanggil data-data yang sudah diisi  */
        TextView jurusan = findViewById(R.id.hasil_jurusannya);
         TextView tanggal = findViewById(R.id.hasil_tanggalnya);
          TextView matkul = findViewById(R.id.hasil_matkulnya);
           TextView dosen = findViewById(R.id.hasil_dosennya);
            TextView kelas = findViewById(R.id.hasil_kelasnya);
             TextView nama = findViewById(R.id.hasil_namanya);
              TextView nim = findViewById(R.id.hasil_nimnya);
               TextView sks = findViewById(R.id.hasil_sksnya);

        /* untuk memanggil data dari halaman sebelumnya  */
               String nim_mhs = getIntent().getStringExtra("Nim");
              String nama_mhs = getIntent().getStringExtra("Nama");
             String kelas_mhs = getIntent().getStringExtra("Kelas");
            String dosen_ujian = getIntent().getStringExtra("Dosen");
           String matkul_ujian = getIntent().getStringExtra("Matkul");
          String jurusan_ujian = getIntent().getStringExtra("Jurusan");
         String tanggal_ujian = getIntent().getStringExtra("Tanggal");
        String sks_ujian = getIntent().getStringExtra("Sks");

               nim.setText(nim_mhs);
              sks.setText(sks_ujian);
             nama.setText(nama_mhs);
            kelas.setText(kelas_mhs);
           dosen.setText(dosen_ujian);
          matkul.setText(matkul_ujian);
         jurusan.setText(jurusan_ujian);
        tanggal.setText(tanggal_ujian);

    }
}