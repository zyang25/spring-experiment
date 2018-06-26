/**
 * 
 */
package com.zyang25.employeemanagement.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Zi
 *
 */
@Entity
@Table(name="employees")
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int emp_no;
	
	private Date birth_date;
	
	private String first_name;
	
	private String last_name;
	
	@Enumerated(EnumType.STRING)
	private GenderEnum gender;
	
	private Date hire_date;
	
	protected Employee() {}
	

	public Employee(String first_name, String last_name) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	
	
	public int getEmp_no() {
		return emp_no;
	}


	public Date getBirth_date() {
		return birth_date;
	}


	public String getFirst_name() {
		return first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public GenderEnum getGender() {
		return gender;
	}


	public Date getHire_date() {
		return hire_date;
	}


	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}


	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}


	@Override
	public String toString() {
		return "Employee [emp_no=" + emp_no + ", birth_date=" + birth_date + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", gender=" + gender + ", hire_date=" + hire_date + "]";
	}
}
