package com.smile.mohamed.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPersonActivity extends AppCompatActivity {

    Button add;
    EditText txt;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);

        add=(Button)findViewById(R.id.btn_add_person);
        txt=(EditText)findViewById(R.id.txt_add);

        preferences=this.getSharedPreferences("Permission Prefrences", Context.MODE_PRIVATE);
        editor=preferences.edit();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putString("user",txt.getText().toString());
                editor.commit();
                Toast.makeText(getBaseContext(),"The User Added Successfully",Toast.LENGTH_LONG).show();

            }
        });
    }
}
