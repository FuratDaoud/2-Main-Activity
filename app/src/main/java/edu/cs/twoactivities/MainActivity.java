package edu.cs.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edttext;
    private Button bton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edttext=findViewById(R.id.txtmsg);
        bton=findViewById(R.id.btn);

    }

    public void btnonclick(View view) {
        String msg = edttext.getText().toString();

        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("data" , msg);
        startActivity(intent);
    }
}