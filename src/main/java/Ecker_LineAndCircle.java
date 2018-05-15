import processing.core.PApplet;

public class Ecker_LineAndCircle extends PApplet{

    public static void main(String[] args) {
        PApplet.main("Ecker_LineAndCircle");
    }

    public void settings() {
        size(500,500);
    }

    public  void setup() {
        background(255,255,255,255);
        frameRate(60);
    }

    public void draw() {
        background(255,255,255,255);
        liney();
        circle();
    }

    private void circle() {
        ellipse(mouseX/2, 250, mouseX, mouseX );
    }

    private void liney() {
        line(mouseX, 0, mouseX, 500);
    }
}
