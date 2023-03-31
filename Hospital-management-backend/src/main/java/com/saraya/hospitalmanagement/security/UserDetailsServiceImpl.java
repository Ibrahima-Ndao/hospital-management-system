//package com.saraya.hospitalmanagement.security;
//
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.saraya.hospitalmanagement.model.User;
//import com.saraya.hospitalmanagement.repository.UserRepo;
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//	private UserRepo repo;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		User user = repo.getUserByUsername(username);
//		if (user == null) {
//			throw new UsernameNotFoundException("Could not find user");
//		}
//		return new MyUserDetails(user);
//	}
//
//}
