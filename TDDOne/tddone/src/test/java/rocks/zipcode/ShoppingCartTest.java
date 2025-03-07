package rocks.zipcode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class

class ShoppingCartTest {
    // TODO: Write tests for the ShoppingCart class

    ShoppingCart.Item newItem = new ShoppingCart.Item ("apple", 5, 1);
    private ShoppingCart shoppingCart;


    // add a method to shopping cart to make it easier to test
    //

    @BeforeEach
    void setUp() {
        double taxRate = 0.5;
        this.shoppingCart = new ShoppingCart(taxRate);
    }

    @Test
    void testAddItem () {
        shoppingCart.addItem(newItem);
        assertEquals(1, shoppingCart.getItemCount());
    }

    @Test
    void testRemoveItem () {
        shoppingCart.removeItem(newItem);
        assertEquals(0, shoppingCart.getItemCount());
    }

    @Test
    void testGetItemCount () {
        shoppingCart.addItem(newItem);
        assertEquals(1, shoppingCart.getItemCount());
    }

    @Test
    void testGetSubTotal () {
        shoppingCart.addItem(newItem);
        assertEquals(5, shoppingCart.getSubtotal());
    }

    @Test
    void testGetTaxAmmount () {
        shoppingCart.addItem(newItem);
        assertEquals(2.50, shoppingCart.getTaxAmount());
    }

    @Test
    void testGetTotal () {
        shoppingCart.addItem(newItem);
        assertEquals(7.50, shoppingCart.getTotal());
    }

    @Test
    void testClearCart () {
        shoppingCart.addItem(newItem);
        shoppingCart.clearCart();
        assertEquals(0, shoppingCart.getItemCount());
    }


    // Make sure to test all functionality including:
    // - Adding and removing items
    // - Calculating subtotal, tax, and total
    // - Edge cases like an empty cart
    // - Invalid inputs (e.g., negative prices, zero quantity)
}
