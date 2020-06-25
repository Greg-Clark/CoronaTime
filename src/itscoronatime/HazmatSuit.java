package itscoronatime;

public class HazmatSuit extends Entity {
    private String image = "image/PowerPellet.png";
    private final int width = 30, height = 30;
    private final int pointVal = 50;
    private boolean isCollected;

    HazmatSuit(int x, int y) {
        setLocation(x, y);
        setWidth(width);
        setHeight(height);
        setVisibility(true);
        isCollected = false;
    }
    public void collect() {
        isCollected = true;
    }

    public boolean hasBeenCollected() { return isCollected; }
    public String getImageName() {
        return image;
    }
}
