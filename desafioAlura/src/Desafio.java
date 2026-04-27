import java.util.Scanner;

public class Desafio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Nolan";
        String tipoConta = "Corrente";
        double saldo = 10000.50;
        String escolha;
        do {
            System.out.println("######################");
            System.out.println("\nNome do cliente: " + nome);
            System.out.println("Tipo da conta: " + tipoConta);
            System.out.println("Saldo atual: " + saldo);
            System.out.println("\n######################");
            System.out.println("\n Operações");
            System.out.println("\n1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("\nDigite a opção desejada: ");
            escolha = scanner.nextLine();
            switch (escolha) {
                case "1":
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case "2":
                    System.out.println("Informe o valor a receber:");
                    double recebido = Double.parseDouble(scanner.nextLine());
                    saldo = saldo + recebido;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;
                case "3":
                    System.out.println("Informe o valor da transferencia:");
                    double enviado = Double.parseDouble(scanner.nextLine());
                    if (enviado <= saldo){
                        saldo = saldo - enviado;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    } else {
                    System.out.println("Saldo insuficiente para realizar a transferencia:");
                }

                    break;
                case "4":
                    System.out.println("Seção encerrada");
                    break;
            }
        } while (!escolha.equals("4"));
        scanner.close();
    }
}
