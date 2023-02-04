package builder.main.builder;

import builder.main.bicycle.Bicycle;

public interface BackSetBuilderI {
	public BackSetBuilderI buildRearBrakes();
	public BackSetBuilderI buildCogset();
	public BackSetBuilderI buildRearDerailleur();
	public Bicycle buildBackSet();
}
