package com.tts.SubscriberList.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

//entity is what creates the subscriber table
@Entity
public class Subscriber {

	
		//Lets Spring know that this is our ID and is associated with this object. 
		@Id
		//GeneratedValue tells Spring that there will be a automated shift to the ID
		//GenerationType.AUTO specifies that our ID will be automatically generated
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		
		
		private String firstName;
		private String lastName;
		private String userName;
		@Column
		//CreationTimestamp automatically generates a date when the sign up is activated. 
		@CreationTimestamp
		private Date signedUp;
		
		
		public Subscriber(String firstName, String lastName, String userName, Date signedUp) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.userName = userName;
			this.signedUp = signedUp;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public Date getSignedUp() {
			return signedUp;
		}


		public void setSignedUp(Date signedUp) {
			this.signedUp = signedUp;
		}


		@Override
		public String toString() {
			return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
					+ userName + ", signedUp=" + signedUp + "]";
		}
		
		
}
