package webalk.test.user.businesslogic.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="user")
public class UserEntity {

	@Id
	@Column(name="userID")
	private String userID;
	private String firstName;
	private String lastName;
	private String email;
	
	
/*	
	@ManyToMany
	@JoinTable(name="User", joinColumns = @JoinColumn(name="userId"), inverseJoinColumns = @JoinColumn(name="roleId"))
	private Set<role> role;
*/	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
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
	@Override
	public String toString() {
		return "UserEntity [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ email + "]";
	}
	
}
