package frota;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Carlos Silva", "CNH123");
        Motorista motorista2 = new Motorista("Ana Souza", "CNH456");

        Carro carro = new Carro(
                "ABC-1234", "Corolla", 2020, 50000, 4);

        Caminhao caminhao = new Caminhao(
                "DEF-5678", "Accelo", 2019, 120000, 8000);

        Viagem viagem1 = new Viagem(
                motorista1, carro, "Contagem", "Belo Horizonte", 35);

        Viagem viagem2 = new Viagem(
                motorista2, caminhao, "Belo Horizonte", "Betim", 45);

        System.out.println("=== DADOS DOS MOTORISTAS ===");
        motorista1.exibirDados();
        System.out.println();
        motorista2.exibirDados();

        System.out.println("\n=== VIAGENS ===");
        viagem1.exibirDados();
        System.out.println();
        viagem2.exibirDados();

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro);
        veiculos.add(caminhao);

        System.out.println("\n=== VEÍCULOS ===");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
            System.out.println();
        }

        System.out.println("=== ATIVIDADE DOS VEÍCULOS ===");
        for (Veiculo veiculo : veiculos) {
            veiculo.realizarAtividade();
        }
    }
}
