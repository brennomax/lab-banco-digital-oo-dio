
public class Main {
    public static void main(String[] args) {
        Cliente breno = new Cliente();
        breno.setNome("Breno Max");
        breno.setIdade(31);

        Conta cc = new ContaCorrente(breno);
        Conta poupanca = new ContaPoupanca(breno);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}