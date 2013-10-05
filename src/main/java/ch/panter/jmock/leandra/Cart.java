package ch.panter.jmock.leandra;

import java.util.ArrayList;
import java.util.Collection;

public class Cart implements ICart {
	
	private Collection<ICartItem>cartItems;
	
	public Cart(){
		this.cartItems = new ArrayList<ICartItem>();
	}

	@Override
	public void add(ICartItem cartItem) {
		cartItems.add(cartItem);
	}

	@Override
	public int calculateTotalPrice(int currencyCode) {
		int totalPrice = 0;
		for(ICartItem item : cartItems){
			totalPrice += item.getPriceByCurrency(currencyCode);
		}
		return totalPrice;
	}

}
