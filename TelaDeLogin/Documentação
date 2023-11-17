/**
 * Uma classe simples para autenticação de usuário, simulando uma base de dados de usuário.
 */
package TelaDeLogin;
import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> userDatabase;
/**
 * Controi uma nova instância de Login e inicializa a base de dados de usuário.
 * Por propósito de exemplo, pré-carrega a base de dados com algumas amostras de usuários.
 */
    public static void main() {
        userDatabase = new HashMap<>();
    }

    /**
    * Tentativa de autenticar o usuário baseado em seu username(nome de usuário) e password(senha)
    * 
    * @param username O nome de usuário na tentativa de realizar o login.
    * @param password A senha utilizada pelo usuário.
    * @return {@code true} Se a autenticação for realizada com sucesso, {@code false} em outro caso.
    */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)){
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)){
                return true;
            }
        }
        return false;
    }

    /**
    * Adiciona um novo usuário a base de dados. Esse método não é recomendado em ambiente de produção, visto que não contém medidas de segurança próprias.
    *
    * @param username O nome de usuário do novo usuário.
    * @param password A senha do novo usuário.
    */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
