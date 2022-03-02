package binod.suman.spring_security_demo_first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import binod.suman.spring_security_demo_first.dao.UserInfoDAO;
import binod.suman.spring_security_demo_first.entity.UserInfo;
import binod.suman.spring_security_demo_first.entity.UserInfoDetails;

@Service
public class UserInfoService implements UserDetailsService{

	@Autowired
	private UserInfoDAO dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserInfo user = dao.findUserByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("This user does not exist");
		}
		
		return new UserInfoDetails(user);
	}

}
