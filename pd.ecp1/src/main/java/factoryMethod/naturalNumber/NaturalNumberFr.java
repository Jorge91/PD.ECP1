package factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {

    public NaturalNumberFr(int value) {
		super(value);
		this.textValue = new String [] {"zéro", "une", "deux", "trois", "quatre", "cinq"};
    }

}
