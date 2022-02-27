package com.example.training;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class database extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        final Button button = findViewById(R.id.add_data);
        EditText editText = (EditText) findViewById(R.id.name);
        EditText editText1 = (EditText) findViewById(R.id.age);
        button.setOnClickListener(new View.OnClickListener() {
          public void onClick(View view) {
//              Log.d("persist", "start tak chal gya");

              Data data= new Data();
              data.setName( editText.getText().toString());
              data.setAge( Integer.parseInt(editText1.getText().toString()));
              DataHandler dta= new DataHandler(database.this);
              dta.persist(data);
          }
      });

    }
    public class Data{
        String name;
        int age;
        public Data(){
            Log.d("naya","sdads");
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}

