public class ShoeApp {
    public static void main(String[] args) {
        Shoe nerdShoe=new Shoe();
        Shoe coolShoe=new Shoe("sandals","brown",8.5);
        nerdShoe.setColor("tan");
        nerdShoe.setStyle("walking");
        nerdShoe.setSize(9.5);
        System.out.println("nerd shoe size: " + nerdShoe.getSize());
        coolShoe.setColor("purple");
        System.out.println("cool shoe style: " + coolShoe.getStyle());
        System.out.println("this is cool shoe info: ");
        //coolShoe.displayShoeInfo();
        System.out.println(coolShoe.toString());
    }
}
