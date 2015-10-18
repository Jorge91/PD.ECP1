package visitor.figure;

public class TotalAreaVisitor extends Visitor {

	private double totalArea = 0;
	
	@Override
	public void visitCircle(Circle circle) {
		this.setTotalArea(this.getTotalArea() + circle.area());
	}

	@Override
	public void visitSquare(Square square) {
		this.setTotalArea(this.getTotalArea() + square.area());
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		this.setTotalArea(this.getTotalArea() + triangle.area());
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}

}
