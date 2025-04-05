class ProtectionProxyImage extends ProxyImage {
    private boolean isAuthenticated;

    public ProtectionProxyImage(String filename, boolean isAuthenticated) {
        super(filename);
        this.isAuthenticated = isAuthenticated;
    }

    public void uploadImage() {
        if (isAuthenticated) {
            System.out.println("Image uploaded successfully: " + filename);
        } else {
            System.out.println("Access denied. Only authenticated agents can upload images.");
        }
    }

    public void replaceImage(String newFilename) {
        if (isAuthenticated) {
            this.filename = newFilename;
            System.out.println("Image replaced successfully with: " + newFilename);
        } else {
            System.out.println("Access denied. Only authenticated agents can replace images.");
        }
    }
}
