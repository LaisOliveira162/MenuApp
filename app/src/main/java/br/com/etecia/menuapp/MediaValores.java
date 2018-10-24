package br.com.etecia.menuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MediaValores extends AppCompatActivity {
private EditText numero1,numero2,numero3;
private TextView id_resultado;
private Button btn_media,btn_limpar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_valores_layout);

        numero1 = (EditText)findViewById(R.id.numero1);
        numero2 = (EditText)findViewById(R.id.numero2);
        numero3 = (EditText)findViewById(R.id.numero3);

        id_resultado = (TextView)findViewById(R.id.id_resultado);

        btn_media = (Button)findViewById(R.id.btn_media);
        btn_limpar = (Button)findViewById(R.id.btn_limpar);
    }
}
