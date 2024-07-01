public class Main {

    public static void main(String[] args) {
        
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        Banco banco = new Banco("Santander");

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        
        banco.adicionarCliente("12345678909");
        banco.adicionarCliente("17256438002");
        banco.adicionarCliente("30683741060");
        banco.removerCliente("30683741060");
        
        System.out.println("O número total de clientes na lista é: " + banco.obterNumeroTotalClientes());
        
        banco.obterListaClientes();

    }
    
}
