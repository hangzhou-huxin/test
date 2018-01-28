package org.huxin.study.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.huxin.study.springboot.domain.User;

@Mapper
public interface UserDao {
	
	@Select("SELECT * FROM USERS WHERE ID = #{id}")
    User findById(@Param("id") Long id);
	
	
	@Select("SELECT ID,NAME FROM USERS")
	List<User> findList() ;

}
