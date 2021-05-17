package com.zafar.pojo;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "StudentCachedZ")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class StudentVOCached {
	@Id
	@Column(name = "Student_id", length = 10)
	private int id;
	@Column(name = "Student_name", length = 20)
	private String name;
	@Column(name = "City", length = 20)
	private String city;
	@Column(name = "Student_MobileNumber", length = 14)
	private String mobileNumber;
	@Column(name = "Salry", length = 30)
	private String salry;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getSalry() {
		return salry;
	}

	public void setSalry(String salry) {
		this.salry = salry;
	}

	@Override
	public String toString() {
		return "StudentVOCached [id=" + id + ", name=" + name + ", city=" + city + ", mobileNumber=" + mobileNumber
				+ ", salry=" + salry + "]";
	}
	

}
