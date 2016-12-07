package com.avinsharma.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button movies_launcher;
    Button stock_launcher;
    Button bigger_launcher;
    Button material_launcher;
    Button ubiquitous_launcher;
    Button capstone_launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movies_launcher = (Button) findViewById(R.id.popular_movies_app_launcher);
        stock_launcher = (Button) findViewById(R.id.stock_hawk_app_launcher);
        bigger_launcher = (Button) findViewById(R.id.build_it_bigger_app_launcher);
        material_launcher = (Button) findViewById(R.id.material_app_launcher);
        ubiquitous_launcher = (Button) findViewById(R.id.go_ubiquitous_app_launcher);
        capstone_launcher = (Button) findViewById(R.id.capstone_app_launcher);

        movies_launcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Popular Movies App", Toast.LENGTH_SHORT).show();
            }
        });
        stock_launcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Stock Hawk App", Toast.LENGTH_SHORT).show();
            }
        });
        bigger_launcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Build It Bigger App", Toast.LENGTH_SHORT).show();
            }
        });
        material_launcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Material App", Toast.LENGTH_SHORT).show();
            }
        });
        ubiquitous_launcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Go Ubiquitous App", Toast.LENGTH_SHORT).show();
            }
        });
        capstone_launcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch Capstone: My Own App", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
