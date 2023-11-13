package entities;


public class Cliente {
    private static int contadorClientes = 0;
    private String cpf;
    private String nome;
    private String dataNascimento;
    private TipoCliente tipo;
    private double valorEmprestimo;
    double valorAPagarNoFuturo;
    private int numeroCliente;

    // Construtor da classe Cliente
    public Cliente(String cpf, String nome, String dataNascimento, TipoCliente tipo, double valorEmprestimo) {
        this.numeroCliente = ++contadorClientes;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipo = tipo;
        this.valorEmprestimo = valorEmprestimo;
        this.valorAPagarNoFuturo = valorEmprestimo * 1.30; // Calcula o valor a pagar no futuro
    }

    // Getters da classe Cliente
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public double getValorAPagarNoFuturo() {
        return valorAPagarNoFuturo;
    }

    // Setters da classe Cliente
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
        this.valorAPagarNoFuturo = valorEmprestimo * 1.30; // Atualiza o valor a pagar no futuro
    }
    @Override
    public String toString() {
        return "Cliente Número = " + numeroCliente + ", cpf = " + cpf + ", nome = " + nome + ", dataNascimento = " + dataNascimento + ", tipo = " + tipo + ", valorEmprestimo = " + valorEmprestimo + ", valorAPagarNoFuturo = " + valorAPagarNoFuturo ;
    }
}

