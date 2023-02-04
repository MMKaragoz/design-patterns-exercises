package builder.main.builder;

import builder.main.bicycle.Bicycle;

public interface WheelBuilderI {

	public WheelBuilderI buildSpokes();
	public WheelBuilderI buildHub();
	public WheelBuilderI buildRim();
	public WheelBuilderI buildTire();
	public WheelBuilderI buildValve();
	public Bicycle build();
}
