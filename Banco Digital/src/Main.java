
public class Main {

    public static void main(String[] args) {
        Cliente douglas = new Cliente();
        douglas.setNome("Douglas");

        Conta cc = new ContaCorrente(douglas);
        Conta poupanca = new ContaPoupanca(douglas);

        cc.depositar(500);
        try {
            cc.transferir(600, poupanca);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // cliente 2

        Cliente josiane = new Cliente();
        josiane.setNome("Josiane");

        Conta cCorrente = new ContaCorrente(josiane);
        Conta cPoupanca = new ContaPoupanca(josiane);

        cCorrente.depositar(900);
        try {
            cCorrente.transferir(250, cPoupanca);

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        cCorrente.imprimirExtrato();
        cPoupanca.imprimirExtrato();

    }

}

// Exceção personalizada para saldo insuficiente

