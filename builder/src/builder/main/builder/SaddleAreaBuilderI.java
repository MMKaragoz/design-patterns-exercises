package builder.main.builder;

import builder.main.bicycle.Bicycle;

public interface SaddleAreaBuilderI {
	
	public SaddleAreaBuilderI buildSaddle();
	public SaddleAreaBuilderI buildSeatPost();
	public Bicycle buildSaddleArea();
}
