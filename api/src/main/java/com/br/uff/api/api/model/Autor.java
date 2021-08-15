package com.br.uff.api.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Entity
public class Autor {
  @Id@GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private int ordem;
  private String email;
  @Column(length=64)
  private String firstName;
  @Column(length=64)
  private String middleName;
  @Column(length=64)
  private String lastName;
  @Column(length=256)
  private String afiliacaoOr;
  @Column(length=256)
  private String afiliacaoIn;
  @Column(length=2)
  private String pais;
  private String orcIn;
  @ManyToOne
  private Artigo artigo;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getOrdem() {
	return ordem;
}
public void setOrdem(int ordem) {
	this.ordem = ordem;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAfiliacaoOr() {
	return afiliacaoOr;
}
public void setAfiliacaoOr(String afiliacaoOr) {
	this.afiliacaoOr = afiliacaoOr;
}
public String getAfiliacaoIn() {
	return afiliacaoIn;
}
public void setAfiliacaoIn(String afiliacaoIn) {
	this.afiliacaoIn = afiliacaoIn;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
public String getOrcIn() {
	return orcIn;
}
public void setOrcIn(String orcIn) {
	this.orcIn = orcIn;
}
public Artigo getArtigo() {
	return artigo;
}
public void setArtigo(Artigo artigo) {
	this.artigo = artigo;
}
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
	Autor other = (Autor) obj;
	return Objects.equals(id, other.id);
}
  
  
}