package il.ac.hit.coupons.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Class holds list of user's favorite coupons
 * @author Niran
 *
 */
public class FavoritesList {
	private List<Integer> favoriteCoupons = new ArrayList<>();

	/**
	 * method to receive favorites list of coupons
	 * @return favorite coupons list
	 */
	public List<Integer> getFavorites() {
		return favoriteCoupons;
	}

	/**
	 * method to add favorite coupon by id
	 * @param id
	 */
	public void addFavoriteCouponId(int id) {
		if (!favoriteCoupons.contains(id))
		{
			favoriteCoupons.add(id);
		}
	}
	
	/**
	 * method prints list of favorite coupons
	 */
	public void printMyFavoriteCouponListPerUnregistredUser()
	{
		for (Integer favoriteCoupons : favoriteCoupons)
		{
			System.out.println(favoriteCoupons);
		}
	}
	
	/**
	 * method to remove favorite coupon from list by id
	 * @param id
	 */
	public void removeFavoriteCoupon(Coupon coupon) {
		favoriteCoupons.remove(coupon);
	}
}
