/**
 *
 * @(#) UserServiceImpl.java
 * @Package com.cn.service.impl
 * 
 * Copyright © singlewindow Corporation. All rights reserved.
 *
 */

package com.cn.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.dao.IUserDao;
import com.cn.pojo.User;
import com.cn.service.IUserService;

/**
 *  Description : 
 * 
 *  @author:  set_free
 *
 *  History:  2019年12月30日 下午1:43:11   set_free   Created.
 *           
 */
@Service("userService")  
public class UserServiceImpl implements IUserService {
	@Resource  
	private IUserDao userDao;  
	  
	@Override
	public User getUserById(int userId) {
		User findAll = this.userDao.findAll();
		 System.out.println(findAll);
		 
		 List<HashMap> findAll2 = this.userDao.findAll2();
		 System.out.println(findAll2);
		 return findAll;
	}

}
