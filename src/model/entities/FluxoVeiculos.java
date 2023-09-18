package model.entities;

import java.util.Objects;

public class FluxoVeiculos {
	
	private Integer id;
	private String marca;
	private String cor;
	private String estado;
	
	public FluxoVeiculos(Integer id, String marca, String cor, String estado) {
		
		this.id = id;
		this.marca = marca;
		this.cor = cor;
		this.estado = estado;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, estado, id, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FluxoVeiculos other = (FluxoVeiculos) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(estado, other.estado) && Objects.equals(id, other.id)
				&& Objects.equals(marca, other.marca);
	}

	@Override
	public String toString() {
		return "FluxoVeiculos [id=" + id + ", marca=" + marca + ", cor=" + cor + ", estado=" + estado + "]";
	}
	
	
	
	
	
}
