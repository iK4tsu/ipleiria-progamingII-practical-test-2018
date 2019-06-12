package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Automovel extends VeiculoTerrestre implements CargaVeiculo
{
    private CargaManager carga;


    public Automovel(String matricula, long nPassageiros, long maxPassageiros)
    {
        this(matricula, nPassageiros, maxPassageiros, 0);
    }

    public Automovel(String matricula, long nPassageiros, long maxPassageiros, long carga)
    {
        super(matricula, nPassageiros, maxPassageiros);
        this.carga = new CargaManager(carga);
    }


    public long getCarga()
    {
        return this.carga.getCarga();
    }


    @Override
    public void addCarga(long toneladas)
    {
        this.carga.add(toneladas);
    }


    @Override
    public void removeCarga(long toneladas)
    {
        this.carga.remove(toneladas);
    }


    @Override
    public String toString()
    {
        return "Automovel " + super.toString();
    }
}
