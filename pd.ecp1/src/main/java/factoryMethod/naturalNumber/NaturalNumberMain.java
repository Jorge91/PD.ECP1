package factoryMethod.naturalNumber;

public class NaturalNumberMain {
	
	public static void main(String[] args) {
        NaturalNumberManager manager = new NaturalNumberManager();
        
        manager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        manager.createNaturalNumber(4);
        System.out.println(manager.getNaturalNumber().getTextValue());
        
        manager.setNaturalNumberCreator(new NaturalNumberEnCreator());
        manager.createNaturalNumber(4);
        System.out.println(manager.getNaturalNumber().getTextValue());
        
        manager.setNaturalNumberCreator(new NaturalNumberFrCreator());
        manager.createNaturalNumber(4);
        System.out.println(manager.getNaturalNumber().getTextValue());
        
        
    }
	
}
