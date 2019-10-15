package webalk.test.user.businesslogic.entity;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "role")
public class role {
	
	
	@Id
	private String roleId;
	private String name;
	
	@ManyToMany(mappedBy="roles")
	private Set<UserEntity> user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserEntity> getUser() {
		return user;
	}

	public void setUser(Set<UserEntity> user) {
		this.user = user;
	}
	
	

}
