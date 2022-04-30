
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){
        Usuario user = new Usuario("Usuario", "Senha do Usuario", "Nome do Usuario", 1985);
        listaUsuario.add(user);
        System.out.println("Usuário " + user.getUsuario() +  " criado");
    }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }

}
