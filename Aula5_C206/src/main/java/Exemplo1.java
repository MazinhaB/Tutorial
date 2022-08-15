import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta destino = new Conta();
        Scanner in = new Scanner(System.in);
        int op;
        double valor;

        //entrada das informações e criação da instância

        System.out.print("Entre com o nome do dono da conta: ");
        c.nomeDoDono = in.nextLine();
        System.out.print("Entre com o numero da conta: ");
        c.num = in.nextInt();
        System.out.print("Digite seu saldo: ");
        c.saldo = in.nextDouble();
        System.out.print("Digite o limite da sua conta: ");
        c.limite = in.nextDouble();

        System.out.println("Nome: "+c.nomeDoDono);
        System.out.println("Numero da conta: "+c.num);
        System.out.println("Saldo: "+c.saldo);
        System.out.println("Limite disponivel: "+c.limite);

        System.out.print("Deseja sacar(1), depositar(2), transferir(3), verificar saldo(4) ou sair(5): ");
        op = in.nextInt();
        while(op != 5) {
            switch (op){
                case 1:
                    System.out.print("Entre com o valor que deseja sacar: ");
                    valor = in.nextDouble();
                    c.sacar(valor);
                    break;
                case 2:
                    System.out.print("Entre com o valor que deseja depositar: ");
                    valor = in.nextDouble();
                    c.depositar(valor);
                    break;
                case 3:
                    System.out.print("Entre com o valor que deseja transferir: ");
                    valor = in.nextDouble();
                    System.out.print("Entre com o nome do dono da conta de destino: ");
                    in.nextLine();
                    destino.nomeDoDono = in.nextLine();
                    System.out.print("Entre com o numero da conta de destino: ");
                    destino.num = in.nextInt();
                    c.transferir(destino, valor);
                    break;
                case 4:
                    c.verificarSaldo();
                    break;
                default:
                    System.out.println("Opcao invalida. Digite 5 para sair");
            }

            System.out.print("Deseja sacar(1), depositar(2), transferir(3), verificar saldo(4) ou sair(5): ");
            op = in.nextInt();
        }
        System.out.println("Programa encerrado");
        in.close();
    }
}
