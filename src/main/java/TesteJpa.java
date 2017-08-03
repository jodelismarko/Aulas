import br.com.mm.dao.ClienteDao;
import br.com.mm.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TesteJpa {

    public static void main (String [] args){

        Cliente cliente = new Cliente();
        cliente.setNome("jodelismarko");
        cliente.setIdade(23);
        cliente.setProfissao("funcionário publico");
        cliente.setSexo("M");

        ClienteDao c = new ClienteDao();


    }
}
