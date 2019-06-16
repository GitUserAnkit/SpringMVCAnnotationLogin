package com.ankit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankit.bo.UserBO;
import com.ankit.dao.UserDAO;
import com.ankit.dto.UserDTO;

@Service("empService")
public class UserServiceImp implements UserService {
	@Autowired
    private UserDAO dao;
	@Override
	public String authenticate(UserDTO dto) {
		UserBO bo=null;
	    int count=0;
	    bo=new UserBO();
	    //convert dto to bo
	    BeanUtils.copyProperties(dto,bo);
	    count=dao.validate(bo);
	    if(count==0) {
	    	return "Invalid Credentials";
	    }
	    else {
	    	return "Valid Credentials";
	    }
	}

}
