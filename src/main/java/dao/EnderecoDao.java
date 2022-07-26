package dao;

import java.util.List;

import javax.persistence.EntityManager;

import entidade.Endereco;

public class EnderecoDao {

	private EntityManager em;
	
	public EnderecoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastrar(Endereco endereco) {
		this.em.persist(endereco);
	}
	
	public Endereco buscarPorId(Integer id) {
		return this.em.find(Endereco.class, id);
	}
	
	public List<Endereco> buscarTodos() {
		return em.createQuery("SELECT e FROM Endereco e", Endereco.class).getResultList();
	}
	
	public void atualizar(Endereco endereco) {
		this.em.merge(endereco);
	}
	
	public void deletar(Endereco endereco) {
		endereco = this.em.merge(endereco);
		this.em.remove(endereco);
	}
}
