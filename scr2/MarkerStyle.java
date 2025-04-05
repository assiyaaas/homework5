class MarkerStyle {
    private String icon;
    private String color;
    private String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    @Override
    public String toString() {
        return "Icon=" + icon + ", Color=" + color + ", LabelStyle=" + labelStyle;
    }
}