package app.dto;

import app.enumerate.Country;

public class CountryDTO {
	private Country country;
	private String name;
	private String nombre;
	
	public Country getCountry() {
		return country;
	}
	public void setGenre(Country country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}