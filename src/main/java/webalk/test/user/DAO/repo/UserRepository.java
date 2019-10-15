package webalk.test.user.DAO.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import webalk.test.user.businesslogic.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	

}
