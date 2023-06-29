package com.generation.lojadegames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")

public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Obrigatorio nome do produto")
    @Size(min = 3, max = 100 , message = "Nome do produto tem que ter no minimo 3 e no maximo 100 caracteres. ")
    private String nome;

	@NotBlank(message="Obrigatorio descrição do produto")
    @Size(min = 10, max = 1000 , message = "A Descrição do produto tem que ter no minimo 10 e no maximo 1000 caracteres. ")
    private String descricao;
	
	@NotBlank(message="Obrigatorio quantidade do produto")
    @Size(min = 1, max = 100 , message = "A Quantidade do produto tem que ter no minimo 1 e no maximo 100 caracteres. ")
    private int quantidade;

	@NotNull(message = "Preço é obrigatório!")
    @Positive(message = "O preço deve ser maior do que zero!")
    private BigDecimal preco;

	@NotBlank(message="Obrigatorio faixa etárea do produto")
    @Size(min = 1, max = 100 , message = "A Faixa Etárea do produto tem que ter no minimo 1 e no maximo 100 caracteres. ")
    private int faixaEtaria;
	
	@ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public int getFaixaetaria() {
		return faixaEtaria;
	}

	public void setFaixaetaria(int faixaetaria) {
		this.faixaEtaria = faixaetaria;
	}

	
	
	
}
