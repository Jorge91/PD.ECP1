package visitor;

public class Visitor2 extends Visitor {
	
	private int countElementA = 0;
	private int countElementB = 0;

    @Override
    public void visitElementA(ElementA e) {
    	countElementA++;
    }

    @Override
    public void visitElementB(ElementB e) {
    	countElementB++;
    }
    
    public int getAs() {
    	return countElementA;
    }
    
    public int getBs() {
    	return countElementB;
    }

}
