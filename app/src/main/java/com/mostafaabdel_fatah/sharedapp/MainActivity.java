package com.mostafaabdel_fatah.sharedapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        imageView = (ImageView) findViewById(R.id.imageView);
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();
        if(intent.ACTION_SEND.equals(action) && type != null){
            if("text/plain".equals(type)){
                String sharedText = intent.getStringExtra(intent.EXTRA_TEXT);
                if(sharedText != null)
                    textView.setText(sharedText);
            }else if(type.startsWith("image/")){
                Uri uri = (Uri) intent.getParcelableExtra(Intent.EXTRA_STREAM);
                if (uri != null)
                    imageView.setImageURI(uri);
            }
        }
    }
}
