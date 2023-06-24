
//JPA- Java Persistence API
//JPA entity class
//@Entity- It identifies a class as an entity class
//@Table- It specifies he table in the database
//@Id- define the mapping to the primary key
//@GeneratedValue-used to automatically generate the primary key value

package com.maven.model;
import javax.persistence.*;
@Entity  
@Table(name = "hotel")
public class Hotel 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Hotel_name")
    private String firstName;

    @Column(name = "guest_name")
    private String lastName;

    @Column(name = "guest_email")
    private String email;
    
    @Column(name = "guest_contact")
    private long contact;

  //default constructor
	public Hotel() 
	{
		
	}

	//parameterized constructor

public Hotel(String firstName, String lastName, String email, long contact) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.contact = contact;
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id =  id;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getContact() {
	return contact;
}

public void setContact(long contact) {
	this.contact = contact;
}

@Override
public String toString() {
	return "Hotel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", contact="
			+ contact + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
			+ getEmail() + ", getContact()=" + getContact() + "]";
}




 

}
	