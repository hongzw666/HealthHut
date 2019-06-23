package com.china.HealthHut;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.china.HealthHut.pojo.Users;
import com.china.HealthHut.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentsServiceImplTest {
	@Autowired
	private UserService UserService;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void test1() {
		fail("Not yet implemented");
	}

	@Test
	public void findUserList() {
		List<Users> findUserList = this.UserService.findUsersList("n", 0, 5);
		for (Users User : findUserList) {
			System.out.println(User.toString());
		}
	}
	
	//测根据id查询User
	@Test
	public void getUserById() {
		Users UserById = this.UserService.findUsersById(4);
		System.out.println(UserById);
	}

	//测试求总页数
	@Test
	public void findUserAll() {
		int findUserAll = this.UserService.findUsersAll("n");
		System.out.println("长度是" + findUserAll);
	}

}
