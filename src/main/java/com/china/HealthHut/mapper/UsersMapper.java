package com.china.HealthHut.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.china.HealthHut.pojo.Users;

public interface UsersMapper {
	
	// 分页查找
	List<Users> findUsersList(String issutdent,RowBounds rowBounds);

	// 查找全部
	List<Users> findUsersAll(String issutdent);

	// 根据账号查找
	Users findUsersById(int userId);

	// 创建账户
	int createUsers(Users users);

	// 删除账户
	int deleteUsers(int userId);

	// 更新账户信息
	int updateUsers(Users userid);
	
}
