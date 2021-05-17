package com.zafar.many.to.many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "CityZ")
public class City {
	@Id
	@Column(name = "City_id",length = 10)
	private int cid;
	@Column(name = "City_Name",length = 30)
	private String name;
	@ManyToMany(mappedBy ="cities" )
	private List<Village> village;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Village> getVillage() {
		return village;
	}
	public void setVillage(List<Village> village) {
		this.village = village;
	}
	

}
