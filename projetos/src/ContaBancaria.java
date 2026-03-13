import java.util.Scanner;

public class ContaBancaria {
    static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nome = "Pedro Lucas P de Oliveira";
            String tipoConta = "Corrente";
            double saldo = 2500.00;
            double valor = 0;
            int opcao = 0;


            System.out.println("*********************\n");
            System.out.println("Nome do cliente: " + nome);
            System.out.println("Tipo de conta: " + tipoConta);
            System.out.println("Saldo atual: " + saldo);
            System.out.println("\n*********************");


            while (opcao != 4){
                System.out.println("     Menu   \n");
                System.out.println("Escolha uma opção:");
                System.out.println("1- Consultar saldos");
                System.out.println("2- Receber valor");
                System.out.println("3- Transferir valor");
                System.out.println("4- Sair\n");
                opcao = scanner.nextInt();

                if (opcao == 1){
                    System.out.println("Saldo na conta é " + saldo);
                }else if (opcao == 2){
                    System.out.println("Digite o valor: ");
                    valor = scanner.nextDouble();

                    if (valor > saldo){
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo -= valor;

                        System.out.println("Saldo atual: " + saldo + "\n");
                    }

                } else if (opcao == 3) {
                    System.out.println("Digite o valor: ");
                    valor = scanner.nextDouble();

                    saldo += valor;

                    System.out.println("Saldo atual: " + saldo + "\n");

                }else if (opcao == 4){
                    System.out.println("Obrigado! Volte sempre!");
                }

            }
        }

    }
}
