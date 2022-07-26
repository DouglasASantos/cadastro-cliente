package aplicacao;

import javax.persistence.EntityManager;

import dao.ClienteDao;
import dao.EnderecoDao;
import entidade.Cliente;
import entidade.Endereco;
import util.UtilJPA;
import util.ValidaCPF;

public class Programa {

	public static void main(String[] args) {
		
		   Cliente c1 = new Cliente("Davi de Souza", "06393986930");
	       Cliente c2 = new Cliente("Maria da Costa", "04598627829");
//	       Cliente c3 = new Cliente("Fernanda Regis", "06895439877");
//	       Cliente c4 = new Cliente("Gustavo Herrera", "05985478935");
	       
	       Endereco e1 = new Endereco("Rua Valmor Schroeder", 2517, "casa", "Bela Vista", "São José", "S", "8811012");
	       System.out.println(ValidaCPF.isCPF(c2.getCpf()));
	      
	       System.out.println( ValidaCPF.imprimeCPF(c2.getCpf()));
	       
	      EntityManager em = UtilJPA.getEntityManager();
	      
	      ClienteDao clienteDao = new ClienteDao(em);
	      EnderecoDao enderecoDao = new EnderecoDao(em);
	    		  
	      em.getTransaction().begin();
	      
	      enderecoDao.cadastrar(e1);
	      clienteDao.cadastrar(c1);
//	
	       em.getTransaction().commit();
	       System.out.println("feito");
	       
	       
	}

}