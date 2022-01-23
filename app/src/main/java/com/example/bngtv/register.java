package com.example.bngtv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.TagLostException;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {
    EditText nemail,npassword;
    Button nRegister;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nemail=findViewById(R.id.emailEdttext);
        npassword=findViewById(R.id.passwordEdttext);
        nRegister=findViewById(R.id.BtRegister);


        nRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fAuth=FirebaseAuth.getInstance();
                String email = nemail.getText().toString();
                String password = npassword.getText().toString();

                if (TextUtils.isEmpty(email)){
                    nemail.setError("Enter your email");
                    return;

                }
                if (TextUtils.isEmpty(password)){
                    npassword.setError("Enter password");
                    return;
                }
                if (password.length()<6){
                    npassword.setError("Password must have more 6 characters");
                    return;
                }
                fAuth.createUserWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(register.this, "User created", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(register.this, Login.class));
                        finish();

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(register.this, "Unsuccessful registration of User", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });

    }
}