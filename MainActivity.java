package com.example.menu_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.setting:
               // Toast.makeText(getApplicationContext(),"setting is selected",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(this,Settings.class);
                startActivity(intent);
                break;
            case R.id.about:
                Intent intent1=new Intent(this,About.class);
                startActivity(intent1);                break;
            case R.id.contact_us:
                Intent intent2=new Intent(this,Contact_Us.class);
                startActivity(intent2);                break;


        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
