package com.example.salman.linearlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.String;

public class TestLinearLayout extends AppCompatActivity implements View.OnClickListener{

    EditText Username;
    EditText Password;
    Button SignIn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test_linear_layout);
        Username = (EditText) this.findViewById(R.id.Username);
        Password = (EditText) this.findViewById(R.id.Password);
        SignIn = (Button) this.findViewById(R.id.SignIn);

        SignIn.setOnClickListener(TestLinearLayout.this);
    }
        @Override
    public void onClick(View view) {
        String Uname = Username.getText().toString();
        String Upass= Password.getText().toString();
        if (Uname.equals("")|| Upass.equals(""))

        {
            Toast.makeText(TestLinearLayout.this, "Enter Username and Password is Missing",Toast.LENGTH_SHORT).show();

        }
        else if (Uname.equals(Upass))
        {
            Toast.makeText(TestLinearLayout.this, "Correct Username and Password",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(TestLinearLayout.this, "InCorrect Username and Password",Toast.LENGTH_SHORT).show();

        }

    }
}
