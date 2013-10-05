package ch.panter.jmock.leandra;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.panter.jmock.leandra.ICart;
import ch.panter.jmock.leandra.Cart;
import ch.panter.jmock.leandra.ICartItem;

@RunWith(JMock.class)
public class CartTest {
	
	/** jmock context */
    Mockery context;
    /** instance under test */
    ICart instance;
    
    @Before
    public void setUp() {
        context = new JUnit4Mockery();
        instance = new Cart();
    }
    
    @Test
    public void gettingPriceFromCartItemWithCurrency() {
        // set up
        final ICartItem cartItem = context.mock(ICartItem.class);
        instance.add(cartItem);
        final int currencyCode = 1;
        
        // expectations
        // first bracet creates an anonymous inner class
        // second braced is the static initializer of the class
        context.checking(new Expectations() {{
            // one and all the other invocation count methods
            // return an instance of the same class as it's
            // argument
            one (cartItem).getPriceByCurrency(currencyCode);
        }});
        
        // execute
        instance.calculateTotalPrice(currencyCode);
    }

}
