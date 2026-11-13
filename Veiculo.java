package frota;

public abstract class Veiculo implements Operavel {
    private String placa;
    private String modelo;
    private int ano;
    private int quilometragem;

    public Veiculo(String placa, String modelo, int ano, int quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void adicionarQuilometragem(int km) {
        if (km > 0) {
            quilometragem += km;
        } else {
            System.out.println("A quilometragem adicionada deve ser maior que zero.");
        }
    }

    public void exibirDados() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }
}
