public class Inventory {
    //Attributes
    private int itemNum;
    private double originalPrice;

    //Getters and Setters
    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    //Default constructor
    public Inventory() {
        this(0,0);
    }
    //Overloaded constructor
    public Inventory(int itemNum,double originalPrice){
        this.itemNum=itemNum;
        this.originalPrice=originalPrice;
    }
}
