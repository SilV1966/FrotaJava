package frota;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String placa, String modelo, int ano,
                 int quilometragem, int quantidadePortas) {
        super(placa, modelo, ano, quilometragem);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void realizarAtividade() {
        System.out.println(
                "O carro está sendo usado em deslocamentos administrativos.");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Quantidade de portas: " + quantidadePortas);
    }
}
