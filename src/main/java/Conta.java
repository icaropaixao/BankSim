public class Conta {

    double saldo;
    void depositar(double valorDeposito){
        saldo += valorDeposito;
    }
    boolean sacar( double valorSaque){

        if (saldo >= valorSaque){
            saldo -= valorSaque;
            return true;
        }else {
            return false;
        }
    }
    void transferir(double valorTransferencia, Conta Contadestino){

        boolean conseguiuSacar = this.sacar(valorTransferencia);
        if (conseguiuSacar){
            Contadestino.depositar(valorTransferencia);
        }else {
            System.out.println("Transferencia não realizada pois o saldo é inferior ao valor requisitado");
        }

    }



}
