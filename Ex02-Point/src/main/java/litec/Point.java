package litec;

public class Point {
    private double xPos;
    private double yPos;


    public void movePoint(double xDist, double yDist){
        this.yPos += yDist;
        this.xPos += xDist;
    }




    public Point(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double getYPos() {
        return yPos;
    }

    public double getXPos() {
        return xPos;
    }
    public double disToOrigin(){
        return Math.sqrt(xPos * xPos + yPos * yPos);
    }
}

