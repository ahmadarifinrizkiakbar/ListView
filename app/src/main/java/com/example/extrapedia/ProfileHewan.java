package com.example.extrapedia;



import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.extrapedia.model.Hewan;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ProfileHewan extends AppCompatActivity {

    Hewan hewans;
    TextView txJenis,txAsal,txDeskripsi,txJudul;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        hewans = (Hewan) intent.getSerializableExtra(DaftarHewanActivity.HEWAN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(hewans);
    }

    private void inisialisasiView() {

        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txJudul = findViewById(R.id.txJudul);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarHewan);

    }


    private void tampilkanProfil(Hewan hewans) {
        Log.d("Lebah","Menampilkan Lebah "+hewans.getJenis());
        txJenis.setText(hewans.getRas());
        txJudul.setText("Jenis - Jenis " + hewans.getJenis());
        txAsal.setText(hewans.getLatin());
        txDeskripsi.setText(hewans.getDeskripsi());
        ivFotoHewan.setImageDrawable(this.getDrawable(hewans.getDrawableRes()));
    }

}
