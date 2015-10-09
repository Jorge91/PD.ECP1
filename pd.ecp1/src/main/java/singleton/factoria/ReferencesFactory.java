package singleton.factoria;

import java.util.HashMap;
import java.util.Map;

public class ReferencesFactory {
	private static ReferencesFactory instance = new ReferencesFactory();
	
	private Map<String,Integer> references = null;
	private int reference;

	
	private ReferencesFactory() {
        this.references = new HashMap<String, Integer>();
        this.reference = 0;
    }
	

	public static ReferencesFactory getFactory() {
		return instance;
	}
	
	public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }
	
	
	
	
	
	
}
