public class Shoe {

    // Field declaration
    private String style;
    private String color;
    private double size;

    // Constructor Default
    public Shoe() {
        style = "unset";
        color = "unset";
        size = 0;
    }

    //Constructor
    public Shoe(String style, String color, double size) {
        this.style = style;
        this.color = color;
        this.size = size;
    }

    // Setter
    public void setStyle(String style) {
        this.style = style;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //Getter
    public String getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    //Display all data about the shoes
    public void displayShoeInfo() {
        this.toString();
    }

    @Override
    public String toString() {
        String s = "";
        s = "Style: " + this.style;
        s+= " Color: " + this.color;
        s+= " Size: " + this.size;
        return s;
    }
}





