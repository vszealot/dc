package model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public class UserDao {
	@Autowired
	private SqlSessionFactory factory;

	public boolean insertUser(User user) {
		int n = factory.openSession().insert("usernamespace.insertLogInfo", user);
		if (n > 0) {
			int m = factory.openSession().insert("usernamespace.insertUserInfo", user);
			return m > 0 ? true : false;
		} else {
			return false;
		}

	}

	public List<User> listUser() {
		return factory.openSession().selectList("usernamespace.listUserInfo");
	}

}
