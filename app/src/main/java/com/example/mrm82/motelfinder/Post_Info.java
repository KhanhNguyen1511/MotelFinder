package com.example.mrm82.motelfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by mrm82 on 28/12/2017.
 */

public class Post_Info extends AppCompatActivity {
    TextView txtTitle,txtDate,txtContent,txtType,txtArea,txtAddress,txtPrice;
    ImageButton btnBack;
    DatabaseReference postRef;
    FirebaseDatabase database;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_info);
        Controls();
        database = FirebaseDatabase.getInstance();
        RetrievePostInfo();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Post_Info.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void Controls(){
        txtAddress=findViewById(R.id.txtPostAddress);
        txtTitle=findViewById(R.id.txtPostTitle);
        txtDate=findViewById(R.id.txtPostDate);
        txtContent=findViewById(R.id.txtPostContent);
        txtType=findViewById(R.id.txtpostType);
        txtArea=findViewById(R.id.txtPostArea);
        txtPrice=findViewById(R.id.txtPostPrice);
        btnBack = findViewById(R.id.imgBack);
    }

    private void RetrievePostInfo(){
        postRef = database.getReference("Posts");

    }
}
