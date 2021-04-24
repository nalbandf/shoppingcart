package com.cognizant;
import java.util.*;

public class ShoppingCart {

    private int cartItemSize;
    private List<Item> mycart = new ArrayList<Item>();
    private double subTotal;
    private int itemQuantity;

    public int getCartItems() {
        return cartItemSize;
    }

    public double getSubTotal(){
        return subTotal;
    }

    public void addCartItem(Item item) {
        mycart.add(item);
        cartItemSize = cartItemSize+1;

    }

    public int getQuantityOfItem(String itemID){
        for(int i=0; i<cartItemSize; i++){
               String itemIDValue = mycart.get(i).getItemID();
               if(itemIDValue.equals(itemID)){
                   itemQuantity=itemQuantity+1;
               }
        }
        return itemQuantity;
    }

    public double calculateSubTotal() {
        for(int i=0; i<cartItemSize; i++){
           Item cartItem = mycart.get(i);
           subTotal= subTotal+ cartItem.getItemPrice();
        }
        return subTotal;
    }

    public Map<Item, Integer> getMyCartView(){
        Map cartview = new HashMap();
        for(int i=0; i<cartItemSize; i++){
            Item cartItem = mycart.get(i);
            int cartItemQuantity = this.getQuantityOfItem(cartItem.getItemID());
            cartview.put(cartItem, cartItemQuantity);

        }
        return cartview;
    }
}
