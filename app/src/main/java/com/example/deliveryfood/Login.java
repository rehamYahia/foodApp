package com.example.deliveryfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    EditText lemail , lpassword;
    Button login;
    TextView Signup;
    FirebaseAuth fAuth;
    String mlemail , mlpassword;
    //com.reload.fooddelvery.EndUser.editActivity editActivity;


    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //initViews();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //AuthUser();
            }
        });

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(Login.this, Register.class));
            }
        });
    }


}
