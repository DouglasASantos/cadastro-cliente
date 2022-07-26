package entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String lougradouro;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	public Endereco(String lougradouro, Integer numero, String complemento, String bairro, String cidade, String uf, String cep) {
		this.lougradouro = lougradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	
	public Endereco(Integer id, String lougradouro, Integer numero, String complemento, String bairro, String cidade, String uf, String cep) {
		this.id = id;
		this.lougradouro = lougradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLougradouro() {
		return lougradouro;
	}
	public void setLougradouro(String lougradouro) {
		this.lougradouro = lougradouro;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	@Override
	public String toString() {
		return "Endereço [id=" + id + ", lougradouro=" + lougradouro + ", numero=" + numero + "]";
	}
	
	
}
