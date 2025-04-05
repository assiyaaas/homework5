public class Main {
    public static void main(String[] args) {
        System.out.println("--- Proxy Pattern Demo ---");

        Image img1 = new ProxyImage("house1.jpg");
        img1.displayThumbnail();
        img1.displayFullImage();

        ProtectionProxyImage protectedImg = new ProtectionProxyImage("house2.jpg", false);
        protectedImg.uploadImage();
        protectedImg.replaceImage("house3.jpg");

        ProtectionProxyImage authenticatedImg = new ProtectionProxyImage("house4.jpg", true);
        authenticatedImg.uploadImage();
        authenticatedImg.replaceImage("house5.jpg");
    }
}
