package com.example.bngtv;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText nEmail,npassword;
    Button nlogin,nFacebooklogin;
    private FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nEmail=findViewById(R.id.emailEdttext);
        npassword=findViewById(R.id.passwordEdttext);
        nlogin=findViewById(R.id.Btlogin);
        nFacebooklogin=findViewById(R.id.BtloginFacebook);
        fAuth=FirebaseAuth.getInstance();

        nlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email= nEmail.getText().toString();
                String password= npassword.getText().toString();

                if (TextUtils.isEmpty(email)){
                    nEmail.setError("Input email");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    npassword.setError("Enter password please");
                    return;
                }
                if (password.length()<6){
                    npassword.setError("password must have more than 6 characters");
                    return;
                }

                fAuth=FirebaseAuth.getInstance();
                fAuth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(Login.this, "Successfully logged in", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Login.this, Mushie.class));
                        finish();

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Login.this, "Unsuccesful login", Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });




    }
}