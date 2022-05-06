
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<>();

    private SingletonBD() { }

    public static void adicionarUsuario(){
        Usuario user = new Usuario("Usuario", "Senha do Usuario", "Nome do Usuario", 1985);
        listaUsuario.add(user);
        System.out.println("Usuário " + user.getUsuario() +  " criado");
    }

    public static void deletarUsuario() {
        listaUsuario.clear();
    }

    public static void atualizarUsuario() {
        /// atualizar usuario
        if (listaUsuarioo.size()) {
            listaUsuario.get(0).setNome("Nome atualizado");
        }
    }

    public static void listarUsuarios(){
        for (Usuario u : listaUsuario) {
            System.out.println("Usuario: " + u.getUsuario());
            System.out.println("Nome: " + u.getNome());
        }
    }

}
