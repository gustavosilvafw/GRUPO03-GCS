
import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){ }

    public static void deletarUsuario() {
        listaUsuario.clear();
    }

    public static void atualizarUsuario(){
        /// atualizar usuario
        for (Usuario usuario : listaUsuario) {
            if (usuario.getUsuario().equals(user)) {
                found = true;
                name = "Nome atualizado";
            }
            else {
                System.out.println("Sem user");
            }
        }
    }


    public static void listarUsuarios(){ }

}
