package com.example.training;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("sameer","on create");


        final Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                Intent activityChangeIntent = new Intent(MainActivity.this, recycleract.class);

                // currentContext.startActivity(activityChangeIntent);

                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        final Button button2 = (Button) findViewById(R.id.button_id2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.d("persist", "start tak chal gya");

                Intent activityChangeIntent = new Intent(MainActivity.this, database.class);

                // currentContext.startActivity(activityChangeIntent);

                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
        final Button button3 = (Button) findViewById(R.id.calc);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Log.d("persist", "start tak chal gya");

                Intent activityChangeIntent = new Intent(MainActivity.this, calc.class);

                // currentContext.startActivity(activityChangeIntent);

                MainActivity.this.startActivity(activityChangeIntent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_n,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       int id= item.getItemId();
       switch(id){
           case R.id.first:
               Intent intent = new Intent(this, media_player.class);
               this.startActivity(intent);
               break;
           case R.id.second:
               Toast.makeText(this, "second item clicked", Toast.LENGTH_SHORT).show();
       }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("sameer","on  resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("sameer","on pause");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("sameer","on  restart");
    }
}