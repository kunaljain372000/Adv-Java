package com.tas.SpringCrud.entities;

import jakarta.persistence.*;

@Entity
public class Employee {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
	    private String name;
	    private String department;
	    private String address;
		public Employee(int id, String name, String department, String address) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.address = address;
		}
		public Employee() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", address=" + address
					+ "]";
		}

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

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		

}
