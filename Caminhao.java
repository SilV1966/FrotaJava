package frota;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String modelo, int ano,
                    int quilometragem, double capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void realizarAtividade() {
        System.out.println(
                "O caminhão está sendo usado para transportar cargas.");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " kg");
    }
}
