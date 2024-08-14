package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactData> contactData = new ArrayList<>();

    int[] contactDataImages = {R.drawable.user_avatar, R.drawable.user_avatar,
            R.drawable.user_avatar, R.drawable.user_avatar, R.drawable.user_avatar,
            R.drawable.user_avatar, R.drawable.user_avatar, R.drawable.user_avatar,
            R.drawable.user_avatar, R.drawable.user_avatar, R.drawable.user_avatar,
            R.drawable.user_avatar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        setUpContactData();

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, contactData);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpContactData() {
        String[] contactDataNames = getResources().getStringArray(R.array.contact_names);
        String[] contactDataPhones = getResources().getStringArray(R.array.contact_phones);

        for (int i = 0; i < contactDataNames.length; i++) {
            contactData.add(new ContactData(
                    contactDataNames[i], contactDataPhones[i], contactDataImages[i]));
        }
    }
}