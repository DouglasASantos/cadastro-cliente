package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entidade.Cliente;

public class ClienteDao {

private EntityManager em;
	
	public ClienteDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}
	
	public Cliente buscarPorId(Integer id) {
		return this.em.find(Cliente.class, id);
	}
	
	public List<Cliente> buscarTodos() {
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
	
	public void atualizar(Cliente cliente) {
		this.em.merge(cliente);
	}
	
	public void deletar(Cliente cliente) {
		cliente = this.em.merge(cliente);
		this.em.remove(cliente);
	}
	
	
}
