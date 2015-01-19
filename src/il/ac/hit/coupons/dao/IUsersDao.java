package il.ac.hit.coupons.dao;

import il.ac.hit.coupons.dto.User;

import java.util.List;

/**
 * interface declares the methods for coupons dao
 * @author Niran
 *
 */
public interface IUsersDao {
	public List<User>  getUsersArray();
	public boolean isUserExists(String userName, String password);
}
