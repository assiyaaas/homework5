
public class MapMarker {
    private final double x;
    private final double y;
    private final MarkerStyle style;

    public MapMarker(double x, double y, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void render() {
        System.out.println("Marker at (" + x + ", " + y + ") with style: " + style);
    }
}