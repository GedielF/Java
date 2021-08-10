package pintag;


public class Cliente extends Pessoa{

    
    public Cliente(String nome,String email, long telefone, long senha) {
        this.nome = nome;
        this.email = email;
        setTelefone(telefone);
        setSenha(senha);
    }

    Cliente(String nome, long email, long telefone, long senha) {
      
    }
}
