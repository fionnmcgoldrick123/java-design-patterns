package ie.atu.sw;

public class ClipperReverserAdapter implements Stringable{
	private final ClipperReverser clipper;
	
	public ClipperReverserAdapter(ClipperReverser clipper) {
		this.clipper = clipper;
	}
	
	@Override
	public String process(String s) {
		return s;
	}
	
	
}
