package com.webfilm.anime.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.webfilm.anime.dao.UserDao;
import com.webfilm.anime.entity.Users;
@Service("userDetailsService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Autowired
    private BCryptPasswordEncoder passwordEncoder;
	@Override
	public List<Users> getUsersByGmail(String email) {
		// TODO Auto-generated method stub
		return userDao.getUsersByGmail(email);
	}
	@Override
	public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {
		List<Users> customers =userDao.getUsersByGmail(mail);
		if (customers.isEmpty()) 
			throw new UsernameNotFoundException("Not user ");
			
		Users customer=customers.get(0);
		Set<GrantedAuthority> authorities= new HashSet<>();
		authorities.add(new SimpleGrantedAuthority("ADMIN"));
		return new org.springframework.security.core.userdetails.User(customer.getEmail(),customer.getPassword(),authorities);
	}
	@Override
	public void addNewUser(Users users) {
		// TODO Auto-generated method stub
		String pass=users.getPassword();
		users.setPassword(passwordEncoder.encode(pass));
		userDao.save(users);
	}

}
