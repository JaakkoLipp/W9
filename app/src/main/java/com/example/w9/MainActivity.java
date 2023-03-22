package com.example.w9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToList(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void addUser(View view) {
        String newUserDegree="<Degree>";
        EditText inputFirstName = (EditText) findViewById(R.id.inputFirstName);
        String ifn = inputFirstName.getText().toString();

        EditText inputLastName = (EditText) findViewById(R.id.inputLastName);
        String iln = inputLastName.getText().toString();

        EditText inputEmail = (EditText) findViewById(R.id.inputEmail);
        String iemail = inputEmail.getText().toString();

        RadioGroup radiogroup1 = findViewById(R.id.radiogroup1);

        switch (radiogroup1.getCheckedRadioButtonId()) {
            case R.id.Tite:
                newUserDegree = "Tietotekniikka";
                break;
            case R.id.tuta:
                newUserDegree = "Tuotantotalous";
                break;
            case R.id.late:
                newUserDegree = "Laskennallinen tekniikka";
                break;
            case R.id.sate:
                newUserDegree = "Sähkötekniikka";
                break;
        }
        UserStorage.getInstance().addUser(ifn,iln,iemail,newUserDegree);
    }
}
