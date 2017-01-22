package com.varunkumar.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview= (TextView) findViewById(R.id.textview);
        registerForContextMenu(textview);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        if(v.getId()==R.id.textview) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.context_menu, menu);
            menu.setHeaderTitle("Select The Action");
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.action1:
                Toast.makeText(this, "Action 1 is selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action2:
                Toast.makeText(this, "Action 2 is selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action3:
                Toast.makeText(this, "Action 3 is selected", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onContextItemSelected(item);
    }
}