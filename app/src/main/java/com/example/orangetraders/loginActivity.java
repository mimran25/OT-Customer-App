package com.example.orangetraders;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ContentLoadingProgressBar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.core.Amplify;

public class loginActivity extends AppCompatActivity {
    Button btn;
    ProgressBar loadingPB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onPressLogin(View view){
        ProgressBar loadingPB=findViewById(R.id.idLoadingPB);
        EditText userNameET=findViewById(R.id.userNameET);
        EditText passwordET=findViewById(R.id.passwordET);
        loadingPB.setVisibility(View.VISIBLE);
        Amplify.Auth.signIn(
                userNameET.getText().toString(),
                passwordET.getText().toString(),
                this::onLoginSuccess,
                this::onLoginError
        );
    }

    private void onLoginError(AuthException e) {
        this.runOnUiThread(()->{
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
        });
    }

    private void onLoginSuccess(AuthSignInResult authSignInResult) {
        ProgressBar loadingPB=findViewById(R.id.idLoadingPB);
        Intent intent=new Intent(this, dashBoard.class);
        startActivity(intent);
//        loadingPB.setVisibility(View.GONE);
    }

    public void onSignUpPressed(View view) {
        Intent intent=new Intent(this,signupActivity.class);
        startActivity(intent);
    }
}