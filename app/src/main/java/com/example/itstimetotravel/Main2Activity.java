package com.example.itstimetotravel;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {

    EditText editText1,editText2;
    Button button;
    TextView textView1,textView2;
    private FirebaseAuth mAuth;
    private DatabaseReference mRoof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mAuth = FirebaseAuth.getInstance();
        mRoof = FirebaseDatabase.getInstance().getReference();

        editText1 = findViewById(R.id.emailtext);
        editText2 = findViewById(R.id.passwordtext);
        button = findViewById(R.id.registerbutton);
        textView1 = findViewById(R.id.ortext);
        textView2 = findViewById(R.id.alreadyhaveanacc);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendtoMainPage();
            }
        });


        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendToLoginpage();
            }
        });


    }

    void SendToLoginpage()
    {
        Intent Reginstant = new Intent(Main2Activity.this,Loginactivity.class);
        startActivity(Reginstant);
    }

    void sendtoMainPage()
    {
        String email = editText1.getText().toString();
        String passw = editText2.getText().toString();
        if(TextUtils.isEmpty(email))
        {
            editText1.setError("Enter the email");
            editText1.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(passw))
        {
            editText1.setError("Enter the password");
            editText1.requestFocus();
            return;
        }
        if(passw.length()<6)
        {
            editText1.setError("Password must contain atleast 6 characters");
            editText1.requestFocus();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email,passw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    String currentuserId = mAuth.getCurrentUser().getUid();
                    mRoof.child("Users").child(currentuserId).setValue(" ");
                    Toast.makeText(Main2Activity.this,"User account is created",Toast.LENGTH_SHORT).show();
                    sendthesuertoMainactivity();
                }
                else
                {
                    Toast.makeText(Main2Activity.this,task.getException().toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    void sendthesuertoMainactivity()
    {
        Intent Reginstanta = new Intent(Main2Activity.this,MainActivity.class);
        Reginstanta.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(Reginstanta);
        finish();
    }



}
