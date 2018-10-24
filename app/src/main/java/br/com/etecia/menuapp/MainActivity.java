package br.com.etecia.menuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_arquivo:
                Toast.makeText(getApplicationContext(), "Cliquei no arquivo", (Toast.LENGTH_LONG)).show();
            case R.id.id_salvar:
                Toast.makeText(getApplicationContext(), "Cliquei em salvar", (Toast.LENGTH_LONG)).show();
            case R.id.id_excluir:
                Toast.makeText(getApplicationContext(), "Cliquei em excluir", (Toast.LENGTH_LONG)).show();
            case R.id.id_sair:
                Toast.makeText(getApplicationContext(), "Cliquei em sair", (Toast.LENGTH_LONG)).show();

        }

        return true;
}
}

