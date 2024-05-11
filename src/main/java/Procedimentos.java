public class Procedimentos {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();
        Conta terceiraConta = new Conta();

        primeiraConta.depositar(1000);
        segundaConta.depositar(1000);
        terceiraConta.depositar(1000);

        System.out.println("Saldo das contas:\n" +
         "Primeira conta: " +primeiraConta.saldo+" R$\n"+
         "Segunda conta: " +segundaConta.saldo+" R$\n" +
         "Terceira conta: " +terceiraConta.saldo+" R$\n");


        primeiraConta.transferir(1000,segundaConta);
        System.out.println("Transferencia realizada...\n" + "Novo saldo Primeira conta: "+primeiraConta.saldo);
        System.out.println("Novo saldo Segunda conta: "+segundaConta.saldo);

        boolean saqueTrue = terceiraConta.sacar(200);
        if (saqueTrue){
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu novo saldo na terceira conta é de: " + terceiraConta.saldo+"R$");
        }else {
            System.out.println("Não foi possivel realizar o saque...");
            System.out.println("Seu saldo na terceira conta continua sendo: " +terceiraConta.saldo+"R$");
        }

    }
}
