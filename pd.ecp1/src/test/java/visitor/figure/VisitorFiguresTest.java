package visitor.figure;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;



public class VisitorFiguresTest {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    @Before
    public void ini() {
        coleccion.add(new Circle("Cc_2", 2));
        coleccion.add(new Square("Sq_5", 5));
        coleccion.add(new Triangle("Tr_4_5", 4, 5));
        coleccion.add(new Circle("Cc_4", 4));
        coleccion.add(new Square("Sq_1", 1));
    }

    @Test
    public void testVisitorAreas() {
        TotalAreaVisitor totalAreaVisitor = new TotalAreaVisitor();
        for (Figure element : coleccion) {
            element.accept(totalAreaVisitor);
        }
        assertEquals(98.0, totalAreaVisitor.getTotalArea(), 1.0);
    }

    @Test
    public void testVisitorSides() {
    	TotalNumberOfSidesVisitor totalSidesVisitor = new TotalNumberOfSidesVisitor();
        for (Figure element : coleccion) {
            element.accept(totalSidesVisitor);
        }
        assertEquals(Double.POSITIVE_INFINITY, totalSidesVisitor.getTotalSides(), 0.0);
    }
    
    @Test
    public void testVisitorSidesWithoutCircles() {
    	TotalNumberOfSidesVisitor totalSidesVisitor = new TotalNumberOfSidesVisitor();
        
    	Collection<Figure> colection = new ArrayList<Figure>();
    	colection.add(new Square("Sq_5", 5));
    	colection.add(new Triangle("Tr_4_5", 4, 5));
    	colection.add(new Square("Sq_1", 1));
    	
    	for (Figure element : colection) {
            element.accept(totalSidesVisitor);
        }
        assertEquals(11.0, totalSidesVisitor.getTotalSides(), 0.0);
    }

}