package com.zafar.employee.pojo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.zafar.employee.company.Company;

@Entity
@Table(name = "EmployeeZa")
public class EmplVO {
	@Id
	@Column(name = "Emp_id", length = 10)
	private int empid;
	@Column(name = "Emp_Name", length = 20)
	private String empName;
	@Column(name = "Emp_Deprt", length = 20)
	private String deparment;
	//@OneToOne(fetch = FetchType.EAGER)//this is load both Emp and company table
	@OneToOne(fetch = FetchType.LAZY)// this will load when we need both table
	private Company companyName;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public Company getCompanyName() {
		return companyName;
	}

	public void setCompanyName(Company companyName) {
		this.companyName = companyName;
	}

}
