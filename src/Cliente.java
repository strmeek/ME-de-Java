public class Cliente {
    private String nome_Cliente;
    private String cpf_Cliente;
    private String telefone_Cliente;

    public Cliente() {
    }

    public Cliente(String nome_Cliente, String cpf_Cliente, String telefone_Cliente) {
        this.nome_Cliente = nome_Cliente;
        this.cpf_Cliente = cpf_Cliente;
        this.telefone_Cliente = telefone_Cliente;
    }

    public String getNome_Cliente() {
        return nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente) {
        this.nome_Cliente = nome_Cliente;
    }

    public String getCpf_Cliente() {
        return cpf_Cliente;
    }

    public void setCpf_Cliente(String cpf_Cliente) {
        this.cpf_Cliente = cpf_Cliente;
    }

    public String getTelefone_Cliente() {
        return telefone_Cliente;
    }

    public void setTelefone_Cliente(String telefone_Cliente) {
        this.telefone_Cliente = telefone_Cliente;
    }
}
