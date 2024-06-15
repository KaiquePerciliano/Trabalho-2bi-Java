public class Atendente extends Funcionario {

    public Atendente() {}

    public Atendente(int id, String nome, String telefone, double salario) {
        super(id, nome, telefone, salario);
    }


    @Override
    public double calcularSalario() {
        return getSalario() + 500;
    }
}