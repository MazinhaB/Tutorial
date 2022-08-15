import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Zumbi z = new Zumbi();
        Scanner in = new Scanner(System.in);
        int op; //opcao de acao

        System.out.println("Qual seu nome?");
        z.nome = in.nextLine();
        System.out.println("Quantas pessoas devorou?");
        z.pessoas_devoradas = in.nextInt();
        System.out.println("Quantas pessoas transformou?");
        z.pessoas_transformadas = in.nextInt();

        op = in.nextInt();
        while(op != 4) {
            switch (op) {
                case 1:
                    z.transformar();
                    break;
                case 2:
                    z.devorar();
                    break;
                case 3:
                    z.falar();
                    break;
            }
            if(z.fome)
                z.devorar();

            op = in.nextInt();
        }
        in.close();
    }
}
