package builder.main.bicycle.saddleArea;

public class SaddleArea {
	private Saddle saddle;
	private SeatPost seatPost;
	
	public SaddleArea() {
		
	}
	
	public SaddleArea(Saddle saddle, SeatPost seatPost) {
		this.saddle = saddle;
		this.seatPost = seatPost;
	}

	public Saddle getSaddle() {
		return saddle;
	}

	public void setSaddle(Saddle saddle) {
		this.saddle = saddle;
	}

	public SeatPost getSeatPost() {
		return seatPost;
	}

	public void setSeatPost(SeatPost seatPost) {
		this.seatPost = seatPost;
	}

	@Override
	public String toString() {
		return "SaddleArea [saddle=" + saddle + ", seatPost=" + seatPost + "]";
	}
	
	
	
}
