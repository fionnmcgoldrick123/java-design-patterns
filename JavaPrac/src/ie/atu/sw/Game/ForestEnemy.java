package ie.atu.sw.Game;

public class ForestEnemy implements Enemy{

	@Override
	public void spawn() {
		System.out.println("spawning enemy in forest");
		
	}

	@Override
	public void attack() {
		System.out.println("enemy attacks in forest");
		
	}

}
