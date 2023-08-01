package cat.itacademy.barcelonactiva.serrano.victor.s04.t02.n02.model.domain;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "fruta")
public class Fruta implements Serializable {
	
	private static final long serialVersionUID = 5474227552982677611L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "INT")
	private int id;

	@NotNull
	@NotBlank
	@Column(name = "nombre", columnDefinition = "VARCHAR(60)")
	private String nombre;

	@NotNull
	@DecimalMin(value = "0.00", message = "La cantidad debe ser mayor o igual a 0.00")
	@DecimalMax(value = "99999.99", message = "La cantidad debe ser menor o igual a 99999.99")
	@Column(name = "cantidadKilos", columnDefinition = "DECIMAL(5, 2)")
	private Float cantidadKilos;

	public Fruta() {
		// Constructor vacío requerido por JPA
	}

	public Fruta(int id, String nombre, Float cantidadKilos) {
		this.id = id;
		this.nombre = nombre;
		this.cantidadKilos = cantidadKilos;
	}


	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getCantidadKilos() {
		return cantidadKilos;
	}

	public void setCantidadKilos(Float cantidadKilos) {
		this.cantidadKilos = cantidadKilos;
	}

	@Override
	public String toString() {
		return "Fruta [id=" + id + ", nombre=" + nombre + ", cantidadKilos=" + cantidadKilos + "]";
	}
	

}

