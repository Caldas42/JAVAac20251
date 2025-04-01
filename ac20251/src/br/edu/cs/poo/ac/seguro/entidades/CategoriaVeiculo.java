package br.edu.cs.poo.ac.seguro.entidades;
import static br.edu.cs.poo.ac.seguro.entidades.PrecosAnosCategoria.*;
public enum CategoriaVeiculo {
	
	
	BASICO(1,"Ve�culo econ�mico", PA_BASICO),
	INTERMEDIARIO(2,"Ve�culo de categoria m�dia", PA_INTERMEDIARIO),
	LUXO(3, "Ve�culo de luxo", PA_LUXO),
	SUPER_LUXO(4, "Ve�culo exclusivo", PA_SUPER_LUXO),
	ESPORTIVO(5, "Ve�culo esportivo", PA_ESPORTIVO);
		
	private int codigo;
	private String nome;
	private PrecoAno[] precosAnos;
	private CategoriaVeiculo(int codigo, String nome, PrecoAno[] precosAnos) {
		this.codigo = codigo;
		this.nome = nome;
		this.precosAnos = precosAnos;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public PrecoAno[] getPrecosAnos() {
		return precosAnos;
	}
}