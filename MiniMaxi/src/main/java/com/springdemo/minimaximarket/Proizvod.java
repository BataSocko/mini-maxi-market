package com.springdemo.minimaximarket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proizvod {
	private Long id;
	private String naziv;
	private String proizvodjac;
	private Long barkod;
	private float cena;
	private Long stanje;
	private String dobavljac;

	protected Proizvod() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public Long getBarkod() {
		return barkod;
	}

	public void setBarkod(Long barkod) {
		this.barkod = barkod;
	}

	public String getDobavljac() {
		return dobavljac;
	}

	public void setDobavljac(String dobavljac) {
		this.dobavljac = dobavljac;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}

	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}

	public float getCena() {
		return cena;
	}

	public void setCena(float cena) {
		this.cena = cena;
	}

	public Long getStanje() {
		return stanje;
	}

	public void setStanje(Long stanje) {
		this.stanje = stanje;
	}

}
