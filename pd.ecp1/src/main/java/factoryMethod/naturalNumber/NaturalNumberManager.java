package factoryMethod.naturalNumber;

public class NaturalNumberManager {

	private NaturalNumberCreator naturalNumberCreator;
	private NaturalNumber naturalNumber;
	
	public void createNaturalNumber(int value) {
		if (this.naturalNumberCreator != null) {
			this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(value);
		}
	}
	
	public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
		this.naturalNumberCreator = naturalNumberCreator;
	}

	public NaturalNumber getNaturalNumber() {
		return naturalNumber;
	}
	
	
}


