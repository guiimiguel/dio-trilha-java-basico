import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println(" ---  CADASTRO DE CONTA BANCARIA ---");
        System.out.println();
        System.out.println("Digite o numero da sua conta:(1020)");
        numeroConta = sc.nextInt();

        System.out.println("Digite numero da sua agencia:(123-5)");
        agencia = sc.next();

        System.out.println("Digite seu nome completo:");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Informe valor a ser depositado:");
        saldo = sc.nextDouble();
        
        System.out.println();
        System.out.printf("Olá %s, sua conta fo criada com sucesso, sua agencia é %s" + 
        "numero da sua conta %s e saldo no valor de %s.2f já esta disponivel para saque.", nomeCliente, agencia, numeroConta, saldo);

        sc.close();

    }
}