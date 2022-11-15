package com.test.bai_kt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<CaSi> arrayList;
    Adapter adapter;
    ImageView img_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new Adapter(this, R.layout.casi_layout, arrayList);
        listView.setAdapter(adapter);

        img_back = (ImageView) findViewById(R.id.img_back);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(myIntent);
            }
        });
    }
    private void AnhXa(){
        listView = findViewById(R.id.list_view);
        arrayList = new ArrayList<>();
        arrayList.add(new CaSi(R.drawable.casi1, "Lê Trung Thành", "Erik",R.drawable.co1, "4.8"));
        arrayList.add(new CaSi(R.drawable.casi2, "Bùi Anh Tuấn", "Bùi Anh Tuấn",R.drawable.co1, "4.85"));
        arrayList.add(new CaSi(R.drawable.casi3, "Lee Ji Eun", "IU",R.drawable.co2, "4.78"));
        arrayList.add(new CaSi(R.drawable.casi4, "Lộc Hàm", "Luhan",R.drawable.co3, "4.65"));
        arrayList.add(new CaSi(R.drawable.casi5, "Robyn Rihanna Fenty", "Rihanna",R.drawable.co4, "4.87"));
    }
}