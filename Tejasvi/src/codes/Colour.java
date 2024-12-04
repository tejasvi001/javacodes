package codes;
class Color {
    void paint() {
        System.out.println("I'm Painting.");
    }
}
    
class RedPaint extends Color {
	//@override
    void paint() {
        System.out.println("I'm Painting with Red color.");
    }
}
    
class BluePaint extends Color {
	//@override
    void paint() {
        System.out.println("I'm Painting with Blue color.");
    }
}


public class Colour {

    public static void main(String[] args) {
        Color c;
        c = new RedPaint();
        c.paint();
        c = new BluePaint();
        c.paint();
        Color ab=new RedPaint();//upcasting
        ab.paint();
    }
}



