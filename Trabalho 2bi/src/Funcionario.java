public class Funcionario extends Pessoa {
    private int id;
    private double salario;

    public Funcionario() {}

    public Funcionario(int id, String nome, String telefone, double salario) {
        super(nome, telefone);
        this.id = id;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getDadosPessoais() {
        return "ID: " + getId() + "\nFuncionario: " + getNome() + "\nTelefone: " + getTelefone() + "\nSalario: " + salario;
    }

    public double calcularSalario() {
        return salario;
    }
}
