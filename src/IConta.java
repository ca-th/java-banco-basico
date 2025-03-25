public interface IConta {
    //usando a interface para implementar, pois so essa classe nao cosnsegue colocar os ddados, entao vamos implementar da classe "conta'

    void sacar(double valor);

    void depositar(double valor);

    void imprimirExtrato();

    void transferir(double valor, Conta contaDestino);
}
