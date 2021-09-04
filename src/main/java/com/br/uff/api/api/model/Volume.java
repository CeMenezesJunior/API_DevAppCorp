package com.br.uff.api.api.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Volume{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment",strategy="increment")
    private Long id;
    @Column(length=32)
    private String sigla;
    private int NumEvento;
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(length=2048)
    private String DescricaoPT;
    @Column(length=2048)
    private String DescricaoEN;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getNumEvento() {
		return NumEvento;
	}
	public void setNumEvento(int numEvento) {
		NumEvento = numEvento;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDescricaoPT() {
		return DescricaoPT;
	}
	public void setDescricaoPT(String descricaoPT) {
		DescricaoPT = descricaoPT;
	}
	public String getDescricaoEN() {
		return DescricaoEN;
	}
	public void setDescricaoEN(String descricaoEN) {
		DescricaoEN = descricaoEN;
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
		Volume other = (Volume) obj;
		return Objects.equals(id, other.id);
	}
    
    
}