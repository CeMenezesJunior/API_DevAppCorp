package com.br.uff.api.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Entity
public class Artigo {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int ordem;
    @Column(length = 2)
    private String idioma;
    @Column(length=256)
    private String tituloOr;
    @Column(length=256)
    private String tituloIn;
    @Column(length = 2048)
    private String resumo;
    @Column(length = 256)
    private String keyWordOr;
    @Column(length = 256)
    private String keyWordIn;
    private int NumPag;
    @ManyToOne
    private Volume volume;
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
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getTituloOr() {
		return tituloOr;
	}
	public void setTituloOr(String tituloOr) {
		this.tituloOr = tituloOr;
	}
	public String getTituloIn() {
		return tituloIn;
	}
	public void setTituloIn(String tituloIn) {
		this.tituloIn = tituloIn;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getKeyWordOr() {
		return keyWordOr;
	}
	public void setKeyWordOr(String keyWordOr) {
		this.keyWordOr = keyWordOr;
	}
	public String getKeyWordIn() {
		return keyWordIn;
	}
	public void setKeyWordIn(String keyWordIn) {
		this.keyWordIn = keyWordIn;
	}
	public int getNumPag() {
		return NumPag;
	}
	public void setNumPag(int numPag) {
		NumPag = numPag;
	}
	public Volume getVolume() {
		return volume;
	}
	public void setVolume(Volume volume) {
		this.volume = volume;
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
		Artigo other = (Artigo) obj;
		return Objects.equals(id, other.id);
	}
    
    
}
