package builder.main.builder;

import builder.main.bicycle.Bicycle;

public interface MiddleSetBuilderI {

	public MiddleSetBuilderI buildFrontDerailleur();
	public MiddleSetBuilderI buildChain();
	public MiddleSetBuilderI buildChainRings();
	public MiddleSetBuilderI buildPedal();
	public MiddleSetBuilderI buildCrankArm();
	public Bicycle buildMiddleSet();
}
