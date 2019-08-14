package com.example.pwpb6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t = (TextView) findViewById(R.id.viewdata);
        Bundle bundle = getIntent().getExtras();
        String s = bundle.getString("name");
        t.setText(s);
    }
}
