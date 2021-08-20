package jp.com.bapsoftware.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	@JsonProperty("name")
	private String name;
	
	@Column(name = "description")
	@JsonProperty("description")
	private String description;
	
	@Column(name = "price")
	@JsonProperty("price")
	private BigDecimal price;
	
	@Column(name = "category_id")
	@JsonProperty("category_id")
	private Integer categoryId;
	
}
