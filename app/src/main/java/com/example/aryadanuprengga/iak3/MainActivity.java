package com.example.aryadanuprengga.iak3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1,isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=(TextView)findViewById(R.id.textView);
        isi=(TextView)findViewById(R.id.isi);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i=new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,isi.getText().toString());
                i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
