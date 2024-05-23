package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Employee {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String department;
	    private double salary;

	    
	    
	    @Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(Long id, String name, String department, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
		}

		// Getters and Setters
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

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	}

	
	

