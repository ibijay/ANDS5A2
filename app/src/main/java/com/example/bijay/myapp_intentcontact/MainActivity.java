package com.example.bijay.myapp_intentcontact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Contacts(View v){
        Intent contintent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
        startActivity(contintent);
    }
}

