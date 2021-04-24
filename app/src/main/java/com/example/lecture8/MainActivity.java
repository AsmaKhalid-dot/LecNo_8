package com.example.lecture8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> friendListArray;
    EditText editText;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.myListview);
        Button button=findViewById(R.id.button);
        editText=findViewById(R.id.editTextTextPersonName);
        friendListArray=new ArrayList<String>();
        friendListArray.add("Jawad");
        friendListArray.add("Khan");
        friendListArray.add("Ali");
        friendListArray.add("Abdullah");
        friendListArray.add("Hamza");
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendListArray);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Log.d("you Clicked",friendListArray.get(i));
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Friend Name",friendListArray.get(i));
                startActivity(intent);
            }
        });
    }
    public void AddFriend(View view) {
        friendListArray.add(editText.getText().toString());
        arrayAdapter.notifyDataSetChanged();
        Collections.sort(friendListArray);
    }
}