package frota;

public class Viagem {
    private Motorista motorista;
    private Veiculo veiculo;
    private String origem;
    private String destino;
    private int quilometrosPercorridos;

    public Viagem(Motorista motorista, Veiculo veiculo,
                  String origem, String destino, int quilometrosPercorridos) {
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.origem = origem;
        this.destino = destino;
        this.quilometrosPercorridos = quilometrosPercorridos;

        veiculo.adicionarQuilometragem(quilometrosPercorridos);
    }

    public void exibirDados() {
        System.out.println("Motorista: " + motorista.getNome());
        System.out.println("Veículo: " + veiculo.getModelo());
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Distância: " + quilometrosPercorridos + " km");
    }
}
