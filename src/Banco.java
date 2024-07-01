import java.util.ArrayList;
import java.util.List;


public class Banco {

    private String nome;
    private List<Cliente> clientes;


    public Banco(String nomes) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(String cpf){
            clientes.add(new Cliente(cpf));
        }

    public void removerCliente(String cpf){
        List<Cliente> clientesParaRemover = new ArrayList<>();
        for (Cliente c : clientes){
            if (c.getCpf().equalsIgnoreCase(cpf)) {
                clientesParaRemover.add(c);
            }
        }

        clientes.removeAll(clientesParaRemover);
    }

    public int obterNumeroTotalClientes(){
        return clientes.size();
    }

    public void obterListaClientes(){
        System.out.println(clientes);
    }
    
}
