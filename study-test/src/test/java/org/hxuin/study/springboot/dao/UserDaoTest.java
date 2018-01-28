package org.hxuin.study.springboot.dao;

import javax.sql.DataSource;

import org.huxin.study.springboot.Bootstrap;
import org.huxin.study.springboot.dao.UserDao;
import org.huxin.study.springboot.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=Bootstrap.class)
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private DataSource dataSource ;
	
	@Test
	public void findById() {
		Long id = 1l; 
		User user = userDao.findById(id) ;
		System.out.println( user.getName());
		System.out.println(dataSource);
	}
	
	

}
