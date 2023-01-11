import Entidades.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class JPAListar {
    public static void main(String[] args) {
      /*
         Lo primero es conectarme a la BBDD
         Para ello invocamos la clase EntityManagerFactory para que se cree la conexion con la BBDD:
      */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejemploJPA"); // --AQUI ABRIMOS UNA CONEXION //////////////
        // "EntityManagerFactory" Esta clase se ocupa de conectar con el driver, configurarlo, enviar los datos de conexion al servidor de la BBDD y abrir MUCHAS conexion con la BBDD
        // "EntityManagerFactory" Es una clase que va crear y va gestionar MUCHAS CONEXIONES con la BBDD que tenemos definida en el archivo "persistence" como -java_curso-

      /*
         Conectamos con la BBDD y obtenemos una instancia de EntityManager (el canuto de conexion)
      */
        EntityManager em = emf.createEntityManager(); // --AQUI UTILIZAMOS LA CONEXION //////////////
        // "EntityManager" Es para cada conexion en concreto

        // CONSULATAS A LA BBDD
        // 1º Sacar una lista de usuario:
        List<Usuario> listaUsuarios = em.createQuery("select usu from Usuario usu",Usuario.class).getResultList();

        listaUsuarios.forEach(System.out::println);
        System.out.println();

        em.close(); // --AQUI CERRAMOS LA CONEXION. ESTA EJECUCION ES OBLIGATORIA YA QUE SE PUEDE BLOQUEAR EL SERVIDOR DE BBDD //////////////
    }
}
