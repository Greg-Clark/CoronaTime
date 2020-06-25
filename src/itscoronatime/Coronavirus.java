package itscoronatime;

public class Coronavirus extends Entity {

    private String image = "image/Ghost.png";
    private boolean canDie = false;
    private boolean isInCage;

    public Coronavirus(int x, int y){
        setLocation(x,y);
        setWidth(50);
        setHeight(50);
        setVisibility(true);
        isInCage = true;
    }

    //when hazmat suit is collected, allow virus to be killed
    public void scare(){
        canDie = true;
    }

    public boolean isScared(){
        return canDie;
    }

    public String getImageName(){
        return image;
    }

    //hazmat suit is off, allow virus to kill person
    public void kill(){
        canDie = false;
    }

    public void setIsInCage(boolean isInCage) {
        this.isInCage = isInCage;
    }

    public boolean getIsInCage() {
        return isInCage;
    }
}
