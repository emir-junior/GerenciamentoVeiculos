import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados para o carro
        System.out.println("Digite os dados do carro:");
        System.out.print("Marca: ");
        String marcaCarro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloCarro = scanner.nextLine();
        System.out.print("Ano: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Número de Portas: ");
        int numeroPortas = scanner.nextInt();
        scanner.nextLine();

        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro, numeroPortas);

        // Entrada de dados para a moto
        System.out.println("Digite os dados da moto:");
        System.out.print("Marca: ");
        String marcaMoto = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloMoto = scanner.nextLine();
        System.out.print("Ano: ");
        int anoMoto = scanner.nextInt();
        System.out.print("Cilindrada: ");
        int cilindrada = scanner.nextInt();

        Moto moto = new Moto(marcaMoto, modeloMoto, anoMoto, cilindrada);

        // Exibir informações dos veículos
        System.out.println("\nInformações do Carro:");
        System.out.println(carro.informacoesVeiculo());

        System.out.println("\nInformações da Moto:");
        System.out.println(moto.informacoesVeiculo());
    }
}
