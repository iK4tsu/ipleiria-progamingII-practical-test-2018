package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class Reboque<T extends Veiculo> extends VeiculoTerrestre
{
    private T veiculo;


    public Reboque(String matricula, long nPassageiros)
    {
        this(matricula, nPassageiros, null);
    }

    public Reboque(String matricula, long nPassageiros, T veiculo)
    {
        super(matricula, nPassageiros, 2);
        this.veiculo = veiculo;
    }


    public T getVeiculo()
    {
        return this.veiculo;
    }


    public void associar(T veiculo)
    {
        if (veiculo == null || veiculo == this.veiculo)
        {
            return;
        }
        this.veiculo = veiculo;
    }


    public void desassociar()
    {
        if (this.veiculo == null)
        {
            return;
        }
        this.veiculo = null;
    }


    @Override
    public String toString()
    {
        String ret;

        if (this.veiculo == null)
        {
            ret = "Sem veiculo rebocado";
        }
        else
        {
            ret = "A rebocar: " + this.veiculo.toString();
        }
        return "Reboque " + super.toString() + "\n" + ret;
    }
}
