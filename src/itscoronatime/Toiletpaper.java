package itscoronatime;

public class Toiletpaper extends Entity {
    private String image = "image/Pellet.png";
    private boolean isCollected = false;
    private int pointVal = 10;

    public Toiletpaper(){
        setLocation(0,0);
        setVisibility(true);
        setWidth(10);
        setHeight(10);
    }


    public void collect(){
        setVisibility(false);
        isCollected = true;

    }

    public String getImageName() {
        return image;
    }

    public boolean hasBeenCollected()
    {
        return isCollected;
    }
}
