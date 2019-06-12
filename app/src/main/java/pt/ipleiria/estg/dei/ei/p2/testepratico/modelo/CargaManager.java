package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class CargaManager
{
    private long carga;


    public CargaManager()
    {
        this(0);
    }

    public CargaManager(long carga)
    {
        this.carga = carga;
    }


    public long getCarga()
    {
        return this.carga;
    }

    public void add(long toneladas)
    {
        if (toneladas < 0)
        {
            return;
        }
        this.carga += toneladas;
    }


    public void remove(long toneladas)
    {
        if (toneladas < 0 || toneladas > this.carga)
        {
            return;
        }
        this.carga -= toneladas;
    }
}
