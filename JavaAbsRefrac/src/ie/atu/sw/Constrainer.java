package ie.atu.sw;

/*
 * Constrains an Object by removing unwanted characters 
 * from its string representation
 */
public class Constrainer implements Stringable{
	
	String constrain = "[^a-zA-Z]";
	
	public Object constrain(Object obj) {
		return obj.toString().trim().replaceAll(constrain, "");
	}

	@Override
	public String process(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}