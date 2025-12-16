public class SuperMarket {
    int price;
    int quantity;
    String itemName;    
    public static void main(String[] args) {
        SuperMarket item1 = new SuperMarket();
        item1.itemName = "Apple";
        item1.price = 10;
        item1.quantity = 5;

        SuperMarket item2 = new SuperMarket();
        item2.itemName = "Banana";
        item2.price = 5;
        item2.quantity = 10;

        int totalBill = (item1.price * item1.quantity) + (item2.price * item2.quantity);
        System.out.println("Total Bill: " + totalBill);
    }
}
