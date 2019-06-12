package pt.ipleiria.estg.dei.ei.p2.testepratico;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import pt.ipleiria.estg.dei.ei.p2.testepratico.R;

import pt.ipleiria.estg.dei.ei.p2.testepratico.modelo.GestorVeiculos;
import pt.ipleiria.estg.dei.ei.p2.testepratico.modelo.Barco;
import pt.ipleiria.estg.dei.ei.p2.testepratico.modelo.Veiculo;
import pt.ipleiria.estg.dei.ei.p2.testepratico.modelo.Reboque;

public class VeiculosActivity extends AppCompatActivity
{
    private static final String VEICULO_SEL = "VEICULO_SEL";

    public enum Tipo
    {
        BARCOS,
        AUTOMOVEIS,
        REBOQUES
    }

    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_veiculos);

        ListView listViewVeiculos = (ListView) findViewById(R.id.listViewVeiculos);
        ListAdapter listAdapter = null;

        switch ((Tipo) getIntent().getSerializableExtra(VEICULO_SEL))
        {
            case BARCOS:
                listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, GestorVeiculos.INSTANCIA.getBarcos());
                break;
            case REBOQUES:
                listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, GestorVeiculos.INSTANCIA.getReboques());
                break;
            case AUTOMOVEIS:
                listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, GestorVeiculos.INSTANCIA.getAutomoveis());
                break;
        }

        listViewVeiculos.setAdapter(listAdapter);
    }

    public static Intent createIntent(Context context, Tipo tipo)
    {
        Intent intent = new Intent(context, VeiculosActivity.class);
        intent.putExtra(VEICULO_SEL, tipo);

        return intent;
    }
}
