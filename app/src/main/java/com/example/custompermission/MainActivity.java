
package com.example.custompermission;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        if (checkSelfPermission("com.example.custompermission.Test") != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{"com.example.custompermission.Test" }, 1);
        } else {
            Toast.makeText(getApplicationContext(),"Permission Granted",Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, MainActivity2.class);
            i.setAction("com.example.custompermission.Test");
            startActivity(i);
        }

    }
}