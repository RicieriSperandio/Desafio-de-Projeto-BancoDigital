public class Main {
    public static void main(String[] args) {
        Cliente ricieri = new Cliente();
        ricieri.setNome("Ricieri");


       Conta contaCorrente = new ContaCorrente(ricieri);
       Conta contaPoupanca = new ContaPoupanca(ricieri);

        contaCorrente.depositar(100);
        contaCorrente.transferir(contaPoupanca,50);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}