/**
 *
 * @(#) IUserDao.java
 * @Package com.cn.dao
 * 
 * Copyright © singlewindow Corporation. All rights reserved.
 *
 */

package com.cn.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.cn.pojo.User;

/**
 *  Description : 
 * 
 *  @author:  set_free
 *
 *  History:  2019年12月30日 下午1:45:11   set_free   Created.
 *           
 */
@Repository
public interface IUserDao {
	User selectByPrimaryKey(int id);
	User findAll();
  @Select("select * from user")
  List<HashMap> findAll2();
}
