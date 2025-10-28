package ie.atu.sw.Game;

//abstract factory
public interface BiomeFactory {
	Enemy createEnemy();
	Enemy spawnEnemy();
	Obstacle placeObstacle();
	Loot dropLoot();
}
