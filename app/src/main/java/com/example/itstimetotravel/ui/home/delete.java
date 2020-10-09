package com.example.itstimetotravel.ui.home;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.itstimetotravel.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

import java.util.HashMap;

public class delete extends AppCompatActivity {
    ImageView imageView;
    EditText editText1,editText2,editText3,editText4;
    Button button;


    private FirebaseAuth mAuth;
    private String currentuserid;
    private DatabaseReference Rootref;
    private StorageReference Userprofileimages;
   // private ProgressBar progressBar1;
   private ProgressDialog lodingbar;
    private Uri mimageuri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        imageView = findViewById(R.id.chooseimg);
        editText1 = findViewById(R.id.ediname);
        editText2 = findViewById(R.id.ediphone);
        editText3 = findViewById(R.id.ediemail);
        editText4 = findViewById(R.id.ediaddress);
        button = findViewById(R.id.registerappbuttn);
        lodingbar = new ProgressDialog(this);



        mAuth = FirebaseAuth.getInstance();
        currentuserid = mAuth.getCurrentUser().getUid();
        Rootref = FirebaseDatabase.getInstance().getReference();
        Userprofileimages = FirebaseStorage.getInstance().getReference().child("Profile Images");



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageupload();
            }
        });




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(delete.this, "hello you are in my way", Toast.LENGTH_LONG).show();
                registerfortour();
            }
        });

        Retrivedata();
    }


    public void imageupload()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1 && resultCode == RESULT_OK && data !=null && data.getData()!= null)
        {
            mimageuri = data.getData();

            lodingbar.setTitle("upload image");
            lodingbar.setMessage("Please wait....");
            lodingbar.setCanceledOnTouchOutside(true);
            lodingbar.show();
             imageView.setImageURI(mimageuri);

            StorageReference filepath = Userprofileimages.child(currentuserid).child("Profile Image");
            filepath.putFile(mimageuri)
                   .addOnCompleteListener(new OnCompleteListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<UploadTask.TaskSnapshot> task) {
                            if(task.isSuccessful())
                            {
                                 Toast.makeText(delete.this,"task is successful", Toast.LENGTH_LONG).show();
                                 lodingbar.dismiss();
                                  final String downloadurl = task.getResult().getStorage().getDownloadUrl().toString();
                                Rootref.child("Users").child(currentuserid).child("Profile Details").child("image").setValue(downloadurl);

                            }

                        }
                    });

        }
    }

    public void registerfortour()
        {
            String username = editText1.getText().toString();
            String userphone = editText2.getText().toString();
            String useremail = editText3.getText().toString();
            String useraddress = editText4.getText().toString();

            if(TextUtils.isEmpty(username) || TextUtils.isEmpty(useraddress) || TextUtils.isEmpty(useremail) || TextUtils.isEmpty(userphone))
            {
                Toast.makeText(this,"FILL ALL THE FIELDS..",Toast.LENGTH_LONG).show();

            }
            else if(userphone.length()<10)
            {
                Toast.makeText(this,"YOUR MOBILE NUMBER MUST CONTAIN 10 DIGITS",Toast.LENGTH_LONG).show();
            }
            else
            {
                HashMap<String,String> regisre = new HashMap<>();
                regisre.put("NAME",username);
                regisre.put("MOBILE NO",userphone);
                regisre.put("EMAIL",useremail);
                regisre.put("ADDRESS",useraddress);
                Rootref.child("Users").child(currentuserid).child("Profile Details").setValue(regisre)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful())
                                {
                                    Toast.makeText(delete.this,"TOUR REGISTRATION FOR THE EVENT WAS SUCCESSFUL",Toast.LENGTH_LONG).show();
                                }
                                else
                                {
                                    String message = task.getException().toString();
                                    Toast.makeText(delete.this,"Error" + message,Toast.LENGTH_LONG).show();
                                }

                            }
                        });
            }


        }
     public void Retrivedata()
     {
         Rootref.child("Users").child(currentuserid).child("Profile Details")
                 .addValueEventListener(new ValueEventListener() {
                     @Override
                     public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                         if(dataSnapshot.exists() && dataSnapshot.hasChild("image") && dataSnapshot.hasChild("NAME")
                                 && dataSnapshot.hasChild("MOBILE NO") && dataSnapshot.hasChild("EMAIL") &&
                                 dataSnapshot.hasChild("ADDRESS"))
                         {
                             String retrivename = dataSnapshot.child("NAME").getValue().toString();
                             String retriveimage = dataSnapshot.child("image").getValue().toString();
                             String retrivephone = dataSnapshot.child("MOBILE NO").getValue().toString();
                             String retriveaddress = dataSnapshot.child("ADDRESS").getValue().toString();
                             String retriveemail = dataSnapshot.child("EMAIL").getValue().toString();

                             editText1.setText(retrivename);
                             editText2.setText(retrivephone);
                             editText3.setText(retriveemail);
                             editText4.setText(retriveaddress);
                             Picasso.get().load(retriveimage).into(imageView);

                         }
                     }

                     @Override
                     public void onCancelled(@NonNull DatabaseError databaseError) {

                     }
                 });

     }

    }

