package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Barco extends Veiculo implements CargaVeiculo
{
    private long anoConstrucao;
    private CargaManager carga;


    public Barco(long anoConstrucao, long nPassageiros, long maxPassageiros)
    {
        this(anoConstrucao, nPassageiros, maxPassageiros, 0);
    }

    public Barco(long anoConstrucao, long nPassageiros, long maxPassageiros, long carga)
    {
        super(nPassageiros, maxPassageiros);
        this.anoConstrucao = anoConstrucao;
        this.carga = new CargaManager(carga);
    }


    public long getAnoConstrucao()
    {
        return this.anoConstrucao;
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
        return "Barco " + anoConstrucao + super.toString();
    }
}