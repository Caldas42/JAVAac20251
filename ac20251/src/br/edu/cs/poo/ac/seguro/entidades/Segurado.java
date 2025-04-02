package br.edu.cs.poo.ac.seguro.entidades;
import java.time.LocalDate;
import java.time.Period;
import java.math.BigDecimal;



public class Segurado {
	private String nome;
	private Endereco endereco;
	private LocalDate dataCriacao;
	private BigDecimal bonus;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	protected LocalDate getdataCriacao() {
		return dataCriacao;
	}
	
	protected void setdataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public BigDecimal getbonus() {
		return bonus;
	}
	
	public Segurado(String nome, Endereco endereco, LocalDate dataCriacao, BigDecimal bonus) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataCriacao = dataCriacao;
		this.bonus = bonus;
	}
	
	public int getIdade() {
	    return Period.between(dataCriacao, LocalDate.now()).getYears();
	}
	
	public void creditarBonus(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0 && this.bonus.compareTo(valor) >= 0) {
        this.bonus = this.bonus.add(valor);
        }
	}
	
	public void debitarBonus(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0 && this.bonus.compareTo(valor) >= 0) {
        this.bonus = this.bonus.subtract(valor);
        }
	}
	

}
