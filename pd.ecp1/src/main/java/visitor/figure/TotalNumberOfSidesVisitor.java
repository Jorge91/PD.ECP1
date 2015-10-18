package visitor.figure;

public class TotalNumberOfSidesVisitor extends Visitor {

	private double totalSides = 0;
	
	@Override
	public void visitCircle(Circle circle) {
		this.setTotalSides(this.getTotalSides() + circle.numberOfSides());
	}

	@Override
	public void visitSquare(Square square) {
		this.setTotalSides(this.getTotalSides() + square.numberOfSides());
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.setTotalSides(this.getTotalSides() + triangle.numberOfSides());
	}

	public double getTotalSides() {
		return totalSides;
	}

	public void setTotalSides(double totalSides) {
		this.totalSides = totalSides;
	}

}
