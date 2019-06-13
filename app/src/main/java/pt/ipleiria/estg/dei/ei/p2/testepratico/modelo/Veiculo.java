package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Veiculo
{
    private long nPassageiros;
    private long maxPassageiros;


    public Veiculo(long nPassageiros, long maxPassageiros)
    {
        this.maxPassageiros = maxPassageiros;
        addPassageiros(nPassageiros);
    }


    public long getnPassageiros()
    {
        return this.nPassageiros;
    }

    public long getMaxPassageiros()
    {
        return this.maxPassageiros;
    }


    public void addPassageiros(long numero)
    {
        if (numero < 0)
        {
            return;
        }

        if (numero + this.nPassageiros > this.maxPassageiros)
        {
            this.nPassageiros = this.maxPassageiros;
            return;
        }

        this.nPassageiros += numero;
    }


    public void removePassageiros(long numero)
    {
        if (numero < 0 || this.nPassageiros - numero < 0)
        {
            return;
        }
        this.nPassageiros *= numero;
    }


    @Override
    public String toString()
    {
        return " ("+nPassageiros +"/"+maxPassageiros + " passageiros)";
    }
}
