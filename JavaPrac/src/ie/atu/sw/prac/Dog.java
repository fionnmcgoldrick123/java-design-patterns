package ie.atu.sw.prac;

public class Dog implements Humanoid{
	
	
	public void poop() {
		System.out.println("dog pooped");
	}

	@Override
	public void breathe() {
		
		System.out.println("dog is breathing");
	}
}
