package builder.main;

import builder.main.bicycle.Bicycle;
import builder.main.builder.BackSetBuilderI;
import builder.main.builder.FrameBuilderI;
import builder.main.builder.FrontSetBuilderI;
import builder.main.builder.MiddleSetBuilderI;
import builder.main.builder.SaddleAreaBuilderI;
import builder.main.builder.WheelBuilderI;

public class Test {

	public static void main(String[] args) {
		
		FrameBuilderI frameBuilder = Bicycle.getFrameBuilder("My Bicycle");
		Bicycle bicycle = frameBuilder.buildSeatStay().buildFrame();
		System.out.println(bicycle);
		
	}

}
