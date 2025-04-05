public class Main {
    public static void main(String[] args) {
        System.out.println("--- Flyweight Pattern Demo ---");
        List<Marker> markers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            MarkerStyle gasStyle = MarkerStyleFactory.getStyle("Gas", "Red", "Bold");
            markers.add(new Marker(Math.random() * 90, Math.random() * 180, gasStyle));

            MarkerStyle hospitalStyle = MarkerStyleFactory.getStyle("Hospital", "Blue", "Italic");
            markers.add(new Marker(Math.random() * 90, Math.random() * 180, hospitalStyle));

            MarkerStyle restaurantStyle = MarkerStyleFactory.getStyle("Restaurant", "Green", "Regular");
            markers.add(new Marker(Math.random() * 90, Math.random() * 180, restaurantStyle));
        }

        for (int i = 0; i < 5; i++) {
            markers.get(i).draw();
        }

        System.out.println("Total markers created: " + markers.size());
        System.out.println("Unique marker styles used: " + MarkerStyleFactory.createdStyles);
    }
}