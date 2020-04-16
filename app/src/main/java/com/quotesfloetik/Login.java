package com.quotesfloetik;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    private Button btnLogin;
    private TextView register;

    private EditText pseudo,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin=(Button)findViewById(R.id.btn_connexion);
        register=(TextView)findViewById(R.id.registerClick);
        pseudo=(EditText) findViewById(R.id.pseudo);
        password=(EditText) findViewById(R.id.password);



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Login.this,Home.class);
                startActivity(k);
                Login.this.onPause();
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left_out);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Login.this,Register.class);
                startActivity(k);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left_out);
            }
        });




    }
}
