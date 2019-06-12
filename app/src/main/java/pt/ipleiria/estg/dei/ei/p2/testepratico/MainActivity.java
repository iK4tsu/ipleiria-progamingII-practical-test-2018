package pt.ipleiria.estg.dei.ei.p2.testepratico;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAutomoveis = (Button) findViewById(R.id.buttonAutomoveis);
        Button buttonBarcos = (Button) findViewById(R.id.buttonBarcos);
        Button buttonReboques = (Button) findViewById(R.id.buttonReboques);

        buttonAutomoveis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(VeiculosActivity.createIntent(MainActivity.this, VeiculosActivity.Tipo.AUTOMOVEIS));
            }
        });

        buttonBarcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(VeiculosActivity.createIntent(MainActivity.this, VeiculosActivity.Tipo.BARCOS));
            }
        });

        buttonReboques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(VeiculosActivity.createIntent(MainActivity.this, VeiculosActivity.Tipo.REBOQUES));
            }
        });
    }
}
