package com.trojan.choismart;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DevContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_contact);

        Button btncallus = findViewById(R.id.btnCallus);

        btncallus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+917015925250"));
                startActivity(intent);

            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent cancel = new Intent(DevContact.this, MainActivity.class);
        finish();
        startActivity(cancel);
    }
}
