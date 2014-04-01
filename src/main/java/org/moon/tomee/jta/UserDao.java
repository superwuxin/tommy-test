package org.moon.tomee.jta;

import org.moon.tomee.jpa.persistence.User;

public interface UserDao {
	
	public void saveUser(User user);
	public void deleteUser(User user);
	public long count();
	public void saveWithOtherDao(User user1, User user2);
	
}
