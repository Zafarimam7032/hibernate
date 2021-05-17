package com.zafar.employee.company;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.zafar.employee.pojo.EmplVO;

@Entity
@Table(name = "CompanyZa")
public class Company {
	@Id
	@Column(name = "Company_id", length = 10)
	private int comid;
	@Column(name = "Company_Name" ,length = 40)
	private String companyName;
	@Column(name = "Emp_Salry", length = 20)
	private String salary;
	@OneToOne(mappedBy = "companyName",fetch = FetchType.EAGER)
	//@OneToOne(mappedBy = "companyName",fetch = FetchType.LAZY)
	private EmplVO emplVO;
	

	public EmplVO getEmplVO() {
		return emplVO;
	}

	public void setEmplVO(EmplVO emplVO) {
		this.emplVO = emplVO;
	}

	public int getComid() {
		return comid;
	}

	public void setComid(int comid) {
		this.comid = comid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
