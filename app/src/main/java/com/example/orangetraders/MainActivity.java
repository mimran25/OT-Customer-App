package com.example.orangetraders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.core.Amplify;
import com.example.orangetraders.databinding.FragmentMoreBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AuthUser currentUser= Amplify.Auth.getCurrentUser();
        Intent intent;
        if(currentUser==null){
            //go to login screen
            intent=new Intent(getApplicationContext(), loginActivity.class);
        }
        else{
            //go to dash board
            intent=new Intent(getApplicationContext(), dashBoard.class);
        }

        //start Activity
        startActivity(intent);
        finish();
    }
}