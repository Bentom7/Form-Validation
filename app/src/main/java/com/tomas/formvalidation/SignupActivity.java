package com.tomas.formvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText etUsername, etPassword, etConfirmpassword, etFullname;
    String username, password, Confirmpaswword, Fullname;
    int formsuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etConfirmpassword = findViewById(R.id.etConfirmpassword);
        etFullname = findViewById(R.id.etFullname);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.save_cancel, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()){
            case R.id.btnSave:
                formsuccess = 4;

                username = etUsername.getText().toString();
                password = etPassword.getText().toString();
                Confirmpaswword = etConfirmpassword.getText().toString();
                Fullname = etFullname.getText().toString();

                if (username.equals("")){
                    etUsername.setError("This field is required");
                    formsuccess--;
                }

                if (password.equals("")){
                    etPassword.setError("This field is required");
                    formsuccess--;
                }

                if (Confirmpaswword.equals("")){
                    etConfirmpassword.setError("This field is required");
                    formsuccess--;
                }

                if (Fullname.equals("")){
                    etFullname.setError("This field is required");
                    formsuccess--;
                }


                break;
           case R.id.btnCancel:
               this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}

