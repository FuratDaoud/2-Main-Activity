package edu.cs.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtv=findViewById(R.id.sactivity);
        Intent intent=getIntent();

        String msg=intent.getStringExtra("data");
        txtv.setText(msg);

    }
}