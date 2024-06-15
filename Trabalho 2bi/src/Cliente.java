public class Cliente extends Pessoa {
    private int id;
    private String cpf;

    public Cliente() {}

    public Cliente(int id, String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.id = id;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getDadosPessoais() {
        return "\nCliente: " + getNome() + "\nTelefone: " + getTelefone() + "\nCPF: " + cpf;
    }
}
