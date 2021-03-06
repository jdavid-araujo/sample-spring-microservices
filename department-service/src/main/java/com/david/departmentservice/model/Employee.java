package com.david.departmentservice.model;

public class Employee {
	
	private Long id;
	
	private String name;
	
	private String phone;
	
	private Integer age;
	
	private Long departmentId;

	public Employee() {}

	public Employee(Long id, String name, String phone, Integer age, Long departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.departmentId = departmentId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
}
