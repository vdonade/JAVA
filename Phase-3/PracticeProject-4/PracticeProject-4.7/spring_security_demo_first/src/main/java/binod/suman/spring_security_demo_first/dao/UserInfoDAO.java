package binod.suman.spring_security_demo_first.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import binod.suman.spring_security_demo_first.entity.UserInfo;

public interface UserInfoDAO extends JpaRepository<UserInfo, Integer>{

	UserInfo findUserByUsername(String username);
}
