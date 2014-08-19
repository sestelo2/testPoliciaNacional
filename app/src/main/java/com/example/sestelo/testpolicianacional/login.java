package com.example.sestelo.testpolicianacional;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.sestelo.testpolicianacional.R;

public class login extends Activity {

    private Button botonLogin;
    private Button botonRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        botonRegistrar = (Button) findViewById(R.id.botonRegistrarse);
        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                Intent myIntent = new Intent(v.getContext(), registro.class);
                startActivity(myIntent);

            }
        });

        botonLogin = (Button) findViewById(R.id.botonEntrar);
        botonLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {
                Intent myIntent = new Intent(v.getContext(), inicio.class);
                startActivity(myIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
