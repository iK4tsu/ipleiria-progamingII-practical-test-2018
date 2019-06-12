package pt.ipleiria.estg.dei.ei.p2.testepratico.modelo;

public class VeiculoTerrestre extends Veiculo
{
    private String matricula;

    public VeiculoTerrestre(String matricula, long nPassageiros, long maxPassageiros)
    {
        super(nPassageiros, maxPassageiros);
        this.matricula = matricula;
    }

    public String getMatricula()
    {
        return this.matricula;
    }


    @Override
    public String toString()
    {
        return this.matricula + super.toString();
    }
}
