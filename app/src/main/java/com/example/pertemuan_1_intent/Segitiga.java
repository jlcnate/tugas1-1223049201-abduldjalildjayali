package com.example.pertemuan_1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {
    EditText alas;
    EditText tinggi;
    Button hitung;
    TextView luas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas =
                (EditText)findViewById(R.id.input_alas);
        tinggi =
                (EditText)findViewById(R.id.input_tinggi);
        luas =
                (TextView)findViewById(R.id.output_luas);
        hitung =
                (Button)findViewById(R.id.btn_hitung_luas);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(alas.length()==0 && tinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (alas.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (tinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = alas.getText().toString();
                    String isitinggi = tinggi.getText().toString();
                    double alas = Double.parseDouble(isialas);
                    double tinggi = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(alas,tinggi);
                    String output = String.valueOf(hs);
                    luas.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double alas, double tinggi){
        return alas*tinggi/2;
    }
}