package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

import java.util.LinkedList;

public enum GestorVeiculos
{
    INSTANCIA;

    private LinkedList<Reboque> reboques;
    private LinkedList<Automovel> automoveis;
    private LinkedList<Barco> barcos;

    GestorVeiculos()
    {
        reboques = new LinkedList<>();
        automoveis = new LinkedList<>();
        barcos = new LinkedList<>();

        // TODO: Adicionar veículos
        Reboque<Barco> girassol = new Reboque<>("SD-34-55", 1);
        Reboque<VeiculoTerrestre> golpe = new Reboque<>("FJ-76-99", 1);
        Barco trindade = new Barco(1925, 258, 854);
        Automovel bruto = new Automovel("GT-29-00", 3, 2);

        girassol.associar(trindade);
        golpe.associar(bruto);

        automoveis.add(new Automovel("AA-05-14", 1, 5));
        automoveis.add(new Automovel("FC-47-89", 2, 5, 15));

        barcos.add(new Barco(1874, 49, 531));
        barcos.add(new Barco(1923, 127, 620, 214));

        reboques.add(new Reboque<Barco>("FV-23-09", 1));
        reboques.add(new Reboque<VeiculoTerrestre>("LK-87-81", 1));

        automoveis.add(bruto);
        barcos.add(trindade);
        reboques.add(girassol);
        reboques.add(golpe);
    }

    public LinkedList<Reboque> getReboques()
    {
        return new LinkedList<>(reboques);
    }

    public LinkedList<Automovel> getAutomoveis()
    {
        return new LinkedList<>(automoveis);
    }

    public LinkedList<Barco> getBarcos()
    {
        return new LinkedList<>(barcos);
    }
}
