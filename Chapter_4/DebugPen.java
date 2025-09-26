public class DebugPen {
    private String color;
    private String point;

    
    public DebugPen() {
        color = "black";
        point = "fine";
    }

    
    public DebugPen(String color, String point) {
        this.color = color;   // fixed color = color since this just reassigns the parameter to itself
        this.point = point;   // same fix i just added this
    }

    
    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }
}
