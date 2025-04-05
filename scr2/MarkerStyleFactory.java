class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();
    public static int createdStyles = 0;

    public static MarkerStyle getStyle(String icon, String color, String labelStyle) {
        String key = icon + ":" + color + ":" + labelStyle;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color, labelStyle));
            createdStyles++;
        }
        return styles.get(key);
    }
}