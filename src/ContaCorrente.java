public class ContaCorrente extends Conta {


    //usamos interface criando uma superclasse 'conta' e herdamos de la os dados para conta corrente e poupança
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Corrente");
        super.imprimirInfosComuns();

   }
}
