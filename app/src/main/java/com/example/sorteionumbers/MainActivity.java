package com.example.sorteionumbers;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edmin, edmax;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edmin = findViewById(R.id.edmin);
        edmax = findViewById(R.id.edmax);
        tvResultado = findViewById(R.id.tvResultado);
        Button b = findViewById(R.id.button);

        b.setOnClickListener(v -> {
            int min = Integer.parseInt(edmin.getText().toString());
            int max = Integer.parseInt(edmax.getText().toString());

            if (min > max) {
                tvResultado.setText("Erro: min > max");
                return;
            }

            Random random = new Random();
            int n = random.nextInt(max - min + 1) + min;

            tvResultado.setText(String.valueOf(n));
        });
    }
}
