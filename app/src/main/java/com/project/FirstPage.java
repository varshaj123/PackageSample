package com.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstPage extends AppCompatActivity {
    private Button brBtn;
    private TextView txtmessage;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
        brBtn = findViewById(R.id.brBtn);
        txtmessage = findViewById(R.id.txtmessage);
        Bundle bundle = getIntent().getExtras();

        //Extract the data…
        String venName = bundle.getString("reactData");
        txtmessage.setText(venName);
        brBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
