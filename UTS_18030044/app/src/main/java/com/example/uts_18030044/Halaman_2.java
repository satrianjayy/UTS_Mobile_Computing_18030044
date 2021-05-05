package com.example.uts_18030044;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Halaman_2 extends AppCompatActivity {
    private SimpleDateFormat format_tanggal;
    private DatePickerDialog datePickerDialog;
    private TextView Tanggalnya;
    private Button Pick_Date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_2);

        format_tanggal = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        /* ini berfungsi untuk memanggil nama nim dan kelasnya  */
        TextView kelas = findViewById(R.id.kelasnya);
         TextView nama = findViewById(R.id.namanya);
          TextView nim = findViewById(R.id.nimnya);

        /* untuk memanggil data dari halaman sebelumnya  */
        String kelas_mhs = getIntent().getStringExtra("Kelas");
         String nama_mhs = getIntent().getStringExtra("Nama");
          String nim_mhs = getIntent().getStringExtra("Nim");



        kelas.setText(kelas_mhs);
         nama.setText(nama_mhs);
          nim.setText(nim_mhs);

        /* ini berfungsi untuk memanggil tanggalnya yang sudah dipilih  */
        Tanggalnya = (TextView) findViewById(R.id.tanggalnya);
        Pick_Date = (Button) findViewById(R.id.inputkan_tanggal);
        Pick_Date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog();

            }
        });
        }
        private void showDateDialog () {
            Calendar newCalendar = Calendar.getInstance();
            datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    Calendar newDate = Calendar.getInstance();
                    newDate.set(year, monthOfYear, dayOfMonth);
                    Tanggalnya.setText(format_tanggal.format(newDate.getTime()));
                }
            }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
            datePickerDialog.show();
        }

    /* ini adalah method untuk menjalankan fungsi dari reset  */
        public void reset(View view) {
            EditText inputkan_jurusan = findViewById(R.id.inputkan_jurusan);
             EditText inputkan_matkul = findViewById(R.id.inputkan_matkul);
              EditText inputkan_dosen = findViewById(R.id.inputkan_dosen);
               EditText inputkan_sifat = findViewById(R.id.inputkan_sifat);
                EditText inputkan_sks = findViewById(R.id.inputkan_sks);
                 TextView tanggalnya = findViewById(R.id.tanggalnya);


            inputkan_jurusan.setText("");
             inputkan_matkul.setText("");
              inputkan_dosen.setText("");
               inputkan_sifat.setText("");
                inputkan_sks.setText("");
                 tanggalnya.setText("");
        }

    /* ini adalah method untuk menjalankan fungsi dari submit  */
    public void submit(View view) {
        TextView kelas = findViewById(R.id.kelasnya);
         TextView nama = findViewById(R.id.namanya);
          TextView nim = findViewById(R.id.nimnya);

        EditText inputkan_jurusan = findViewById(R.id.inputkan_jurusan);
         EditText inputkan_matkul = findViewById(R.id.inputkan_matkul);
          EditText inputkan_dosen = findViewById(R.id.inputkan_dosen);
           EditText inputkan_sifat = findViewById(R.id.inputkan_sifat);
            EditText inputkan_sks = findViewById(R.id.inputkan_sks);
             TextView tanggalnya = findViewById(R.id.tanggalnya);


        String jurusan_ujian = inputkan_jurusan.getText().toString();
         String matkul_ujian = inputkan_matkul.getText().toString();
          String dosen_ujian = inputkan_dosen.getText().toString();
           String sifat_ujian = inputkan_sifat.getText().toString();
            String tanggal_ujian = tanggalnya.getText().toString();
             String sks_ujian = inputkan_sks.getText().toString();
              String kelas_mhs = kelas.getText().toString();
               String nama_mhs = nama.getText().toString();
                String nim_mhs = nim.getText().toString();


        /* intent ini berfungsi untuk memasuki kehalaman berikutnya  */
        Intent intent = new Intent(this, Halaman_3.class);
        intent.putExtra("Jurusan", jurusan_ujian);
         intent.putExtra("Tanggal", tanggal_ujian);
          intent.putExtra("Matkul", matkul_ujian);
           intent.putExtra("Dosen", dosen_ujian);
            intent.putExtra("Sifat", sifat_ujian);
             intent.putExtra("Kelas", kelas_mhs);
              intent.putExtra("Nama", nama_mhs);
               intent.putExtra("Sks", sks_ujian);
                intent.putExtra("Nim", nim_mhs);

        startActivity(intent);
    }
}
