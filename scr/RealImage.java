class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading high-res image: " + filename);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Displaying thumbnail for: " + filename);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying full image: " + filename);
    }
}
