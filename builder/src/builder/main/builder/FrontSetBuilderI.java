package builder.main.builder;

import builder.main.bicycle.Bicycle;

public interface FrontSetBuilderI {

	public FrontSetBuilderI buildHandlebarGrip();
	public FrontSetBuilderI buildHeadTube();
	public FrontSetBuilderI buildShockAbsorber();
	public FrontSetBuilderI buildFrontBrakes();
	public FrontSetBuilderI buildFork();
	public Bicycle buildFrontSet();
}
