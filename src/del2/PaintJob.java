package del2;

//Felt: name (String) — fx "Stue"
//Felt: surfaces (ArrayList<Shape>) — flader der skal males (vægge, loft)
//Felt: deductions (ArrayList<Shape>) — flader der ikke skal males (vinduer, døre)

//Metoder:
//
//void addSurface(Shape s)
//void addDeduction(Shape s)
//double getTotalSurface() — sum af areal i surfaces
//double getTotalDeductions() — sum af areal i deductions
//double getPaintableArea() — overflader minus fradrag
//void printSummary() — printer en oversigt (se eksempel nedenfor)

import java.awt.*;
import java.util.ArrayList;

public class PaintJob {

    private String name;
    private ArrayList<Shape> surfaces = new ArrayList<>();
    private ArrayList<Shape> deductions = new ArrayList<>();

    public PaintJob(String name) {
        this.name = name;
    }

    public void addSurface(Shape s) {
        surfaces.add(s);
    }

    public void addDeduction(Shape s) {
        deductions.add(s);
    }

    double getTotalSurface() {
        double total = 0;
        for (Shape surfaces : surfaces) {
            total += surfaces.getArea();
        }
        return total;
    }

    double getTotalDeductions() {
        double total = 0;
        for (Shape deductions : deductions) {
            total += deductions.getArea();
        }
        return total;

    }

    double getPaintableArea() {
        return getTotalSurface() - getTotalDeductions();
    }

    public void printSummary() {
        System.out.println("====== Malerberegner: " + name + " ======");
        System.out.println("Skal males: " + getPaintableArea()+ " m²");

        }


    }

