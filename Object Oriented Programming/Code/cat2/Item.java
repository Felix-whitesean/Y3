public class Item {
    int itemId, remaining, price;
    String category, itemName;

    // void addToCart(int itemId, int price){
    //     Cart = 
    // }
     Item(int itId, int rem, int itemPrice, String cat, String name){
        itemId = itId;
        remaining = rem;
        price = itemPrice;
        category = cat;
        itemName = name;
    }
}
