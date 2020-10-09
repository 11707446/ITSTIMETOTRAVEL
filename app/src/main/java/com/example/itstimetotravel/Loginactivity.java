package com.example.itstimetotravel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.itstimetotravel.ui.home.HomeFragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

public class Loginactivity extends AppCompatActivity {
    EditText editText,editText1;
    Button button1;
    TextView textView1;
    private FirebaseAuth mAuth;
    private DatabaseReference Rootref;
    private ProgressDialog lodingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        button1 =findViewById(R.id.loginbutton);
        editText = findViewById(R.id.login_emailtext);
        editText1 = findViewById(R.id.login_passwordtext);
        textView1 = findViewById(R.id.login_neednewaccount);
        lodingbar = new ProgressDialog(this);

        mAuth = FirebaseAuth.getInstance();



        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendusertoregisteractivity();

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Allowusertologin();
            }
        });
    }



    public void sendusertoregisteractivity()
    {
        Intent registerintent = new Intent(Loginactivity.this, Main2Activity.class);
        startActivity(registerintent);
    }



    public void Allowusertologin()
    {
        String txt_mail = editText.getText().toString().trim();
        String txt_pass = editText1.getText().toString().trim();

        if(TextUtils.isEmpty(txt_mail) || TextUtils.isEmpty(txt_pass))
        {
            Toast.makeText(Loginactivity.this,"EMPTY CREDENTIALS",Toast.LENGTH_LONG).show();
        }
        else if(txt_pass.length()<6)
        {
            Toast.makeText(Loginactivity.this,"Password is too short",Toast.LENGTH_LONG).show();
        }
        else
        {
            loginerac(txt_mail,txt_pass);
        }

    }




     public void  loginerac(String mail,String pass)
     {
         lodingbar.setTitle("Sign In");
         lodingbar.setMessage("Please wait....");
         lodingbar.setCanceledOnTouchOutside(true);
         lodingbar.show();
         mAuth.signInWithEmailAndPassword(mail, pass)
                 .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                     @Override
                     public void onComplete(@NonNull Task<AuthResult> task) {
                         if (task.isSuccessful()) {
                             sendusertoMainactivity();
                             Toast.makeText(Loginactivity.this,"Logged in successful",Toast.LENGTH_LONG).show();
                             lodingbar.dismiss();

                         } else {
                             String message = task.getException().toString();
                             Toast.makeText(Loginactivity.this, "Error :"+ message, Toast.LENGTH_SHORT).show();
                             lodingbar.dismiss();
                         }

                     }
                 });

     }




    public void sendusertoMainactivity()
    {
        Intent mainintent = new Intent(Loginactivity.this,MainActivity.class);
        mainintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(mainintent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if(firebaseAuth.getCurrentUser()!=null)
                {
                    Intent intent = new Intent(Loginactivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}

