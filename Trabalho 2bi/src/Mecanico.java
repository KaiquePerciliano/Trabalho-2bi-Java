public class Mecanico extends Funcionario {

    public Mecanico() {}

    public Mecanico(int id, String nome, String telefone, double salario) {
        super(id, nome, telefone, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalario() * 1.10;
    }
}