package com.zafar.Emplyee;

import javax.persistence.Column;

public class Emplyee {
	@Column(name = "Employee_name", length = 30)
	private String eName;
	@Column(name="Department",length = 30)
	private String dep;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	

}
