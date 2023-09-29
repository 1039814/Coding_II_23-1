package Midterm;

import java.net.Socket;

public class Rectangle {
    private int width,height;
    private int perimiter;
    private int area;
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getPerimiter() {
        return perimiter;
    }
    public void setPerimiter(int perimiter) {
        this.perimiter = perimiter;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
        public Rectangle(int width, int height, int perimiter, int area) {
        this.width = width;
        this.height = height;
        this.perimiter = perimiter;
        this.area = area;
    }
    public void findarea(){
        area=width*height;
    }
        public void findperimiter(){
        perimiter= (2*width)*(2*height);
    }
}
