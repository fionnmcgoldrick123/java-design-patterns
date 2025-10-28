package ie.atu.sw.Game;

public class DesertBiomeFactory implements BiomeFactory {

	@Override
	public Enemy createEnemy() {
		return new DesertEnemy();
	}

	@Override
	public Obstacle placeObstacle() {
		return new DesertObstacle();
	}

	@Override
	public Loot dropLoot() {
		return new DesertLoot();
	}

	@Override
	public Enemy spawnEnemy() {
		// TODO Auto-generated method stub
		return null;
	}

}
