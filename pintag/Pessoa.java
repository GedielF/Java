package pintag;


public class Pessoa {

    String nome;
    String email;
    long telefone;
    long senha;

    //Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    //Setters
    public void setTelefone(long telefone) {
        while (String.valueOf(telefone).length() > 11 || String.valueOf(telefone).length() < 11) {
            System.out.println("Numero invalido!");
            System.out.println("Numero deve conter (DD) e no total ter 11 digitos");
            break;
            
        } 
            this.telefone = telefone;
        }
    

    public Long getSenha() {
        return senha;
    }

    public void setSenha(long senha) {
    while (String.valueOf(senha).length() > 6 || String.valueOf(senha).length() < 30){
        System.out.println("Senha deve conter mais de 6 Caracteres");
        System.out.println("Digite novamente!");
        break;
    }
      
        this.senha = senha;
    }

    //Metodos
    public String imprimir() {
        return "Nome: " + nome +"\nEmail:"+email+ "\nSenha: " + senha + "\nTelefone: " + telefone;
    }
}