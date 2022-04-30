
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){ }

    public static void deletarUsuario() {
        listaUsuario.clear();
    }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }

}
