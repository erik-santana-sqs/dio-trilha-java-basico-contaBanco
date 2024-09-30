import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        int continuar = 1;
        int retornar = 2;
        double saldo=237.48;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("seja bem vindo, por favor, digite seu nome:");
            String nome = scanner.nextLine();
            System.out.println("Olá,"+nome+", por favor, digite o número da sua agência:");
            String agencia = scanner.nextLine();

            System.out.println("você confirma que sua agência é " + agencia + "?");
            System.out.println("para sim, digite 1");
            System.out.println("para não, digite 2");
            int confirmacao = scanner.nextInt();

            if (confirmacao == continuar) {
                System.out.println("por favor,digite o número da sua conta:");
                int conta = scanner.nextInt();
                System.out.println("você confirma que sua conta é "+conta+ "?");
                System.out.println("para sim, digite 1");
                System.out.println("para não, digite 2");
                int confirmacaoConta = scanner.nextInt();

                if (confirmacaoConta==continuar){
                    System.out.println("ola "+nome+" obrigado por criar uma conta em nosso banco. sua agencia é "
                            + agencia + ",conta:" + conta + " e seu saldo é " + saldo+" $");
                    break;
                }
            } else if (confirmacao == retornar) {
                System.out.println("voltando ao inicio...");
                System.out.println("deseja reiniciar o processo?");
                System.out.println("para sim, digite 1");
                System.out.println("para não, digite 2");
                continuar = scanner.nextInt();
            } else {
                System.out.println("opçao invalida");

                System.out.println("deseja reiniciar o processo?");
                System.out.println("para sim, digite 1");
                System.out.println("para não, digite 2");
                continuar = scanner.nextInt();
            }
        }while(continuar==1);


    }

}
