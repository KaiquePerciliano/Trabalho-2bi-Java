public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    public Veiculo() {}

    public Veiculo(int id, String marca, String modelo, int ano, String placa) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDadosTecnicos() {
        return "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nPlaca: " + getPlaca();
    }
}