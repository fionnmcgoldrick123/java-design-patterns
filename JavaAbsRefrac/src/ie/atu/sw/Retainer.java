package ie.atu.sw;

import java.time.DayOfWeek;

public class Retainer { // Ideally should only be one Retainer in the system
	
	Stringifier strg = new Stringifier();
	MaskerClipper mskc = new MaskerClipper(); 
	ClipperReverser crev = new ClipperReverser();
	Constrainer cnstr = new Constrainer();
	
	
	private Stringable s; 
	private Numerable n; 

	// Singleton Pattern
	private static Retainer instance;

	private Retainer() {
	}

	public static Retainer getInstance() {
		if (instance == null) {
			instance = new Retainer();
		}

		return instance;
	}

	//SRP
	public Object retain(Info info, String val) {
		switch (info) {
		case READY, ON_HOLD -> {
			readyHold(val);
		}

		case REMOVED, SUSPENDED -> {
			removeSuspended(val);
		}
		case DEPRECATED -> {
			crev.clip(val);
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + info);
		}

		return null;
	}
	
	public Object readyHold(String val) {
		if (strg != null) {
			return strg.doXOR(new StringBuffer(val));
		} else if (crev != null) {
			return crev.clip(val);
		} else if (cnstr != null) {
			return cnstr.constrain(val);
		}
		
		return null;
	}
	
	public Object removeSuspended(String val) {
		if (strg != null) {
			strg.day = DayOfWeek.MONDAY;
			return strg.process(val);
		} else if (crev != null) {
			crev.remove = 'b';
			return crev.clip(val);
		} else if (cnstr != null) {
			cnstr.constrain = "[a-zA-Z]";
			return cnstr.constrain(val);
		}
	
	return null;
	}
}