import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        double saldoAtual = 0;
        
        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    int depositar = scanner.nextInt();
                    saldoAtual += depositar;
                    System.out.println("Saldo Atual: " + saldoAtual);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    int sacar = scanner.nextInt();
                    if (sacar <= saldoAtual) {
                        saldoAtual -= sacar; // Subtrai o valor sacado do saldo atual
                        System.out.println("Saque aprovado. Saldo Atual: " + saldoAtual);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                      
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo Atual: " + saldo);
                    
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}