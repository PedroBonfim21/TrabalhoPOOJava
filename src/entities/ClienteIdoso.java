package entities;

// Arquivo: ClienteIdoso.java
public class ClienteIdoso extends Cliente {

    public ClienteIdoso(String cpf, String nome, String dataNascimento, double valorEmprestimo) {
        super(cpf, nome, dataNascimento, TipoCliente.IDOSO, valorEmprestimo);
    }

    public void setEmprestimo(double valorEmprestimo) {
        // Polimorfismo: cliente idoso paga apenas 25% a mais no valor futuro
        this.valorAPagarNoFuturo = valorEmprestimo * 1.25;
    }
}

