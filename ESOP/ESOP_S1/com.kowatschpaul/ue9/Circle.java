package com.kowatschpaul.ue9;

/**
 * Represents a circle by storing its center coordinates and its radius.
 */
public class Circle {

    protected int xPos;
    protected int yPos;
    protected int radius;

    /**
     * Create a new circle with given center coordinates and given radius
     *
     * @param xPos   X-coordinate of the center
     * @param yPos   Y-coordinate of the center
     * @param radius Radius of the circle
     */
    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * <p>
     * Formula: PI * (r*r)
     *
     * @return The circles area
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // TODO Define your methods here
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append("[circle] center=").append(xPos).append(",").append(yPos).append("; radius=").append(radius);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof Circle)){
            return false;
        }
        Circle circle = (Circle) o;
        return circle.xPos == this.xPos && circle.yPos == this.yPos && circle.radius == this.radius;
    }

    public int compareArea(Circle circle){
        return Integer.compare(this.radius, circle.radius);
    }

    // ---------- BEGIN GETTER AND SETTERS ----------

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
