package com.cognizant;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTestCase {

    @Test
    void startShoppingCartTestCase(){

        ShoppingCart sc =  new ShoppingCart();
        int expectedCartItems = 0;
        int actualCartItems = sc.getCartItems();
        assertEquals(expectedCartItems,actualCartItems);
        System.out.println("Cart size now is "+actualCartItems);
    }

}
