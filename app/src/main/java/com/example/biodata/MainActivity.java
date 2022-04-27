package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    // Declare an adapter
    RecyclerView.Adapter ProgramAdapter;
    RecyclerView.LayoutManager layoutmanager;


    int[] image = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7};
    String arr[] = {"Mohan Singh", "Anushka Choudhary", "Ashima Gupta", "Danish Zafar", "Shivam Bhargava", "Danish Zafa", "Nitish Kumar Verma"};
    String subject[] = {"Chemistry", "Chemistry", "Chemistry", "English", "Maths", "Chemistry", "Chemistry"};
    String qulification[] = {"IIT Bombay", "Master(Chemisty)", "M.Sc Chemistry (Inorganic)", "Ph.D in English,M.Phil in English", "Ph.D in English,M.Phil in English", "BTECH NIT JALANDHAR", "B.Tech in Mechanical ,M.Tech in Material Science and Technology"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);

        layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);

        ProgramAdapter programAdapter = new ProgramAdapter(this, arr, subject, qulification, image);
        recyclerView.setAdapter(programAdapter);
    }

    public void activityEvent(View view) {
        Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, PersonInfo.class);

        startActivity(intent);
    }
}