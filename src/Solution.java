/*
 * Click `Run` to execute the snippet below!

 const cartOne = {
  "id": 1,
  "lineItems": [
    {
      "productKey": "5493-01",
      "name": "Praline Pecans",
      "quantity": 2,
      "shippingDetails": [
          {
            "addressKey": 1,
            "quantity": 1
          },
          {
            "addressKey": 2,
            "quantity": 1
          }
        ]
    }
  ],
  "addresses": [
    {
      "key": 1,
      "streetName": "101 Irving Rd"
    },
    {
      "key": 2,
      "streetName": "201 Irving Rd"
    }
  ]
};
 */


//https://app.coderpad.io/7P4PW3DY

import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Solution {
    public static void main(String[] args) {

        System.out.println("Md");

    }

    public static Cart mergeCarts(Cart one, Cart two) {

        //TODO : Merge cart two into cart one

        Cart mergedCart = new Cart();

        mergedCart = one;

        List<LineItem> cartTwoItems = two.getLineItems();

        for(LineItem item: cartTwoItems){
            mergedCart.getLineItems().add(item);
        }

        HashMap<String, Integer> duplicateItems = new HashMap<>();
        //int count = 0; //Temp Counter for item duplicates.

        for (LineItem item: mergedCart.getLineItems()){
            if(!duplicateItems.containsKey(item.productKey)){
                duplicateItems.put(item.getProductKey(), 1); // Item insertion
            } else {
                Integer itemCount = duplicateItems.get(item.getProductKey());
                itemCount++;
                duplicateItems.put(item.getProductKey(), itemCount);
            }
        }


        return mergedCart;
    }


}

