package com.project.pecunia.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	
		@Id
		private int id; 
		private String firstname; 
		private String lastname;
		private int age;
		/*
		 * private String ifsc; private double ano; private String pan; private
		 * LocalDate DOB; private String email; private String address; private String
		 * city; private String state; private String zip; private String country;
		 */
		
		public User() {}
		public User(int id, String firstname, String lastname, int age) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		



		
		
		
}
