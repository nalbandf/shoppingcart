package com.cognizant;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTestCase {

    ShoppingCart shoppingCart =  new ShoppingCart();

    @Test
    void getEmptyCart(){

        int expectedCartItems = 0;
        int actualCartItems = shoppingCart.getCartItems();
        assertEquals(expectedCartItems,actualCartItems);
        System.out.println("Cart size now is "+actualCartItems);
    }

    @Test
    void addItemToCartTestCase(){
        shoppingCart.addCartItem(new Item("ITEM01", "Pen", 6.5));
        double total = shoppingCart.calculateSubTotal();
        System.out.println(total);
        assertEquals(6.5 , total);
    }


    @Test
    void addMoreItemToCartTestCase(){
        shoppingCart.addCartItem(new Item("ITEM01", "Pen", 6.5));
        shoppingCart.addCartItem(new Item("ITEM02", "Pencil", 2));
        double cartTotal = shoppingCart.calculateSubTotal();
        assertEquals(8.5 , cartTotal);
    }

    @Test
    void getQuantityOfSameItemTestCase(){
        shoppingCart.addCartItem(new Item("ITEM01", "Pen", 6.5));
        shoppingCart.addCartItem(new Item("ITEM03", "Box", 2.5));
        shoppingCart.addCartItem(new Item("ITEM02", "Pencil", 2));
        shoppingCart.addCartItem(new Item("ITEM02", "Pencil", 2));
        int cartItemSpecificQty = shoppingCart.getQuantityOfItem("ITEM02");
        assertEquals(2,cartItemSpecificQty);

    }

//    @Test
//    void getItemizedListofItemsTestCase(){
//        shoppingCart.addCartItem(new Item("ITEM01", "Pen", 6.5));
//        shoppingCart.addCartItem(new Item("ITEM03", "Box", 2.5));
//        shoppingCart.addCartItem(new Item("ITEM02", "Pencil", 2));
//        shoppingCart.addCartItem(new Item("ITEM02", "Pencil", 2));
//        Map returnCartView = shoppingCart.getMyCartView();
//        assertEquals(1,returnCartView.)
//
//
//    }


}
