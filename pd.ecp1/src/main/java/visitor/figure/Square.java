package visitor.figure;

public class Square implements Figure {

    private double side;

    public Square(String description, double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double numberOfSides() {
        return 4;
    }

    @Override
    public String toString() {
        return super.toString();
    }

	@Override
	public void accept(Visitor v) {
	    v.visitSquare(this);
	    
		
	}

}
