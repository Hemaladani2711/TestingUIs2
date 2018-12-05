package com.example.hemaladani.testinguis;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);

        //addPreferencesFromResource(R.layout.activity_main);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_sign_out:
                showDialog();
                break;
        }
        return true;
    }

    public void showDialog(){
        AlertDialog builder=new AlertDialog.Builder(this).create();
        builder.setTitle("Do you want to exit from the app?");
        builder.setButton(AlertDialog.BUTTON_POSITIVE,"Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setButton(AlertDialog.BUTTON_NEGATIVE,"OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //perform logout
            }
        });
        builder.show();
    }

    public static int getTotal(int a, int b){
        return a+b;

    }

}
