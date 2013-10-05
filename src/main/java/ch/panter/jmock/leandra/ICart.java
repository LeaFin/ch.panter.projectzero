package ch.panter.jmock.leandra;

public interface ICart {
	public abstract void add(ICartItem cartItem);

    public abstract int calculateTotalPrice(int currencyCode);
}
