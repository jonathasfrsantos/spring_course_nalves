package com.jfrsantos.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;


@Entity
@Table(name= "tb_product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private Double price;
	private String imgURL;
	
	
	// Explicando o JoinTable : 1 º parâmetro é o nome da tabela associativa, "joinColumns" recebe o nome das chaves estrangeiras das duas entidades relacionadas
	

	@ManyToMany
	@JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id")) 
	private Set<Category> categories = new HashSet<>(); // não se coloca coleções em construtores, assim como eles não devem possuir o método set
														// a coleção já está sendo instanciada, não precisa passar no construtor
	public Product() {
		
	}

	public Product(Long id, String name, String description, Double price, String imgURL) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgURL = imgURL;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	
	public Set<Category> getCategories(){
		return categories;
	}

	// não usar lombok em classes que farão parte de tabelas associativas
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	

}
