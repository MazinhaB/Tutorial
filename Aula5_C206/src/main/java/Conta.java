public class Conta { //classe para conta de um banco
    //membros da classe, atributos

    double saldo;
    double limite;
    int num;
    String nomeDoDono;

    //método para depositar
    void depositar (double valor){
        saldo+=valor;
    }
    //método para sacar
    void sacar (double valor){
        if(valor > saldo)
            System.out.println("Nao ha saldo suficiente");
        else {
            saldo -= valor;
            System.out.println("Saque feito com sucesso");
        }
    }
    //método para transferir
    void transferir (Conta destino, double valor){
        if(valor > saldo)
            System.out.println("Nao ha saldo suficiente");
        else {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferencia feita com sucesso para "+destino.nomeDoDono);
        }
    }
    void verificarSaldo() {
        System.out.println("Saldo: "+saldo);
    }
}
