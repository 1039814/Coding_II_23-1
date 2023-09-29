package Midterm;

public class InchToMeter {
    private double meter;
    private int inch;
    public InchToMeter(int inch) {
        this.inch = inch;
    }
        public int getInch() {
        return inch;
    }
    public void setInch(int inch) {
        this.inch = inch;
    }
    public double setmter(){
        meter=inch* 0.0254;
        return meter;
    }
}