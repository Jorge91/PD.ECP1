package visitor.figure;

import visitor.figure.Visitor;

public interface Figure {

	void accept(Visitor v);
    
    public abstract double area();
    public abstract double numberOfSides();

}
