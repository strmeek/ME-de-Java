import java.util.Date;
public class Pet {

    private int id_Pet;
    private String nome_Pet;
    private String apelido_Pet;
    private String sexo_Pet;
    private Date data_Entrada;
    private int idade_Pet;
    private String racao_Pet;
    private int racao_Quantd_Gramas;
    private int peso_Pet;

    public Pet(int id_Pet,
               String nome_Pet,
               String apelido_Pet,
               String sexo_Pet,
               Date data_Entrada,
               int idade_Pet,
               String racao_Pet,
               int racao_Quantd_Gramas,
               int peso_Pet) {
        this.id_Pet = id_Pet;
        this.nome_Pet = nome_Pet;
        this.apelido_Pet = apelido_Pet;
        this.sexo_Pet = sexo_Pet;
        this.data_Entrada = data_Entrada;
        this.idade_Pet = idade_Pet;
        this.racao_Pet = racao_Pet;
        this.racao_Quantd_Gramas = racao_Quantd_Gramas;
        this.peso_Pet = peso_Pet;
    }

    public int getId_Pet() {
        return id_Pet;
    }

    public void setId_Pet(int id_Pet) {
        this.id_Pet = id_Pet;
    }

    public String getNome_Pet() {
        return nome_Pet;
    }

    public void setNome_Pet(String nome_Pet) {
        this.nome_Pet = nome_Pet;
    }

    public String getApelido_Pet() {
        return apelido_Pet;
    }

    public void setApelido_Pet(String apelido_Pet) {
        this.apelido_Pet = apelido_Pet;
    }

    public String getSexo_Pet() {
        return sexo_Pet;
    }

    public void setSexo_Pet(String sexo_Pet) {
        this.sexo_Pet = sexo_Pet;
    }

    public Date getData_Entrada() {
        return data_Entrada;
    }

    public void setData_Entrada(Date data_Entrada) {
        this.data_Entrada = data_Entrada;
    }

    public int getIdade_Pet() {
        return idade_Pet;
    }

    public void setIdade_Pet(int idade_Pet) {
        this.idade_Pet = idade_Pet;
    }

    public String getRacao_Pet() {
        return racao_Pet;
    }

    public void setRacao_Pet(String racao_Pet) {
        this.racao_Pet = racao_Pet;
    }

    public int getRacao_Quantd_Gramas() {
        return racao_Quantd_Gramas;
    }

    public void setRacao_Quantd_Gramas(int racao_Quantd_Gramas) {
        this.racao_Quantd_Gramas = racao_Quantd_Gramas;
    }

    public int getPeso_Pet() {
        return peso_Pet;
    }

    public void setPeso_Pet(int peso_Pet) {
        this.peso_Pet = peso_Pet;
    }
}
