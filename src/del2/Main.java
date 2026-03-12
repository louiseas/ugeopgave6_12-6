package del2;

//Opret mindst ét PaintJob for et rum med:
//
//Mindst tre overflader (fx to vægge og et loft som Rectangle)
//Mindst to fradrag (fx en dør og et vindue — runde vinduer kan være Circle)
//Print en oversigt og det samlede antal kvadratmeter der skal males.

public class Main {
    public static void main(String [] args){

        PaintJob stue = new PaintJob("Stue");

        stue.addSurface(new Rectangle(5,4));
        stue.addSurface(new Rectangle(5, 6));
        stue.addSurface(new Rectangle(5, 7));

        stue.addDeduction(new Rectangle(1,4));
        stue.addDeduction(new Circle(0.5));

        stue.printSummary();




    }
}
