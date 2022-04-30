
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<>();

    private SingletonBD() { }

    public static void adicionarUsuario(){ }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){
        for (Usuario u : listaUsuario) {
            System.out.println("Usuario: " + u.getUsuario());
            System.out.println("Nome: " + u.getNome());
        }
    }

}
