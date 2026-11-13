package frota;

public class Motorista {
    private String nome;
    private String cnh;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDados() {
        System.out.println("Motorista: " + nome);
        System.out.println("CNH: " + cnh);
    }
}
