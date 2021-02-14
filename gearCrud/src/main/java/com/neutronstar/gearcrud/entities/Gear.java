package com.neutronstar.gearcrud.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_gear")
public class Gear implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Getter
	@Setter
	private Integer quantity;
	@Getter
	@Setter
	private String type;
	@Getter
	@Setter
	private String material;
	@Getter
	@Setter
	private Double module;
	@Getter
	@Setter
	private Integer numberOfTeeth;
	@Getter
	@Setter
	private Double price;
	@Getter
	@Setter
	private String note;

	public Double getTotalPrice() {
		return quantity * price;
	}

}
