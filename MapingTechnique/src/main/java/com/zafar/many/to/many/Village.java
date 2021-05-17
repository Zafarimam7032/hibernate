package com.zafar.many.to.many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "VillageZ")
public class Village {
	@Id
	@Column(name = "Village_id", length = 10)
	private int vno;
	@Column(name = "Village_name", length = 20)
	private String villname;
	@ManyToMany()
	private List<City> cities;

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public int getVno() {
		return vno;
	}

	public void setVno(int vno) {
		this.vno = vno;
	}

	public String getVillname() {
		return villname;
	}

	public void setVillname(String villname) {
		this.villname = villname;
	}

}
