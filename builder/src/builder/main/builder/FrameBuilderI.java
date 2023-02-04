package builder.main.builder;

import builder.main.bicycle.Bicycle;

public interface FrameBuilderI {

	public FrameBuilderI buildTopTube();
	public FrameBuilderI buildDownTube();
	public FrameBuilderI buildSeatTube();
	public FrameBuilderI buildSeatStay();
	public FrameBuilderI buildChainStay();
	public Bicycle buildFrame();
}
