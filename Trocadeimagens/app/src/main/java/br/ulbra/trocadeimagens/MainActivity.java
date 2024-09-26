package br.ulbra.trocadeimagens;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView imgFoto;
    Button btFoto1, btFoto2;
    TextView txtinformacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imgFoto = (ImageView) findViewById(R.id.imgFoto);

        btFoto1 = (Button) findViewById(R.id.btFoto1);
        btFoto2 = (Button) findViewById(R.id.btFoto2);
        txtinformacao = (TextView) findViewById(R.id.txtinformacao);
        btFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgFoto.setImageResource(R.drawable.corki);
                txtinformacao.setText("Foto 1");
            }
        });
        btFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgFoto.setImageResource(R.drawable.ziggs);
                txtinformacao.setText("Foto 2");
            }
        });

    }
}