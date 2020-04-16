package com.quotesfloetik;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;

public class Home extends AppCompatActivity {
private  ShapeableImageView imj1;
private ShapeableImageView grand;
private Button bt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imj1= (ShapeableImageView) findViewById(R.id.img1);
        grand= (ShapeableImageView) findViewById(R.id.imageView);
        bt1=(Button) findViewById(R.id.choose);

        imj1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
            grand.setImageDrawable(imj1.getDrawable());
            }
        });


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent,2);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==2  && resultCode==RESULT_OK){

          Toast.makeText(Home.this,data.toString(),Toast.LENGTH_LONG).show();
        }
    }
}
