package com.example.aloy.tugas_ukm;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class BiodataDiri extends AppCompatActivity {

    @OnClick(R.id.btn_contact)
    void button5() {
        Intent telp = new Intent(Intent.ACTION_DIAL);
        telp.setData(Uri.parse("tel:085711365421"));
        startActivity(telp);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata_diri);
        ButterKnife.bind(this);

    }
    public void procces (View view) {
        if(view.getId()==R.id.btn_email) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"hendika@studen.pradita.ac.id"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Sukses gan");
            intent.putExtra(Intent.EXTRA_TEXT  , "Jangan lupa gan ngoding sambil ngopi biar pikiran lancar");
            intent.setType("message/rfc882");
           Intent chooser = Intent.createChooser(intent, "send email");
           startActivity(chooser);
        }
    }
}
