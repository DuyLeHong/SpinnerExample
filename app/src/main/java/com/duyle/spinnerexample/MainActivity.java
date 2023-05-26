package com.duyle.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spMonhoc = findViewById(R.id.spinner_monhoc);
        String [] arrDataMonhoc = new String [] {
                "Lập trình Java 1",
                "Lập trình Java 2",
                "Lập trình Android",
                "Lập trình React Native"
        };

        ArrayAdapter<String> adapterMonhoc = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                arrDataMonhoc
        );

        spMonhoc.setAdapter(adapterMonhoc);

        spMonhoc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String sMonHoc = arrDataMonhoc[i];
                Toast.makeText(MainActivity.this, sMonHoc, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spNhanvien = findViewById(R.id.spinner_nhanvien);

        ArrayList<NhanVienModel> arrNhanvien = new ArrayList<>();
        arrNhanvien.add(new NhanVienModel("Nguyễn Văn Long", "NV18711", "IT"));
        arrNhanvien.add(new NhanVienModel("Trần Tuấn Anh", "NV16810", "NS"));
        arrNhanvien.add(new NhanVienModel("Nguyễn Phương Thảo", "NV17809", "HR"));
        arrNhanvien.add(new NhanVienModel("Mai Văn Tuấn", "NV18765", "NS"));

        NhanVienAdapter nhanVienAdapter =  new NhanVienAdapter(this, arrNhanvien);
        spNhanvien.setAdapter(nhanVienAdapter);


    }
}