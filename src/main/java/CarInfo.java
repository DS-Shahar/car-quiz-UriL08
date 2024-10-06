
public class CarInfo {
	private String id;
	private boolean privateCar;
	private int speed;
	
	public boolean illegal(int maxSpeed) {
		if (this.privateCar == true) {
			return true;
		}
		
		if (this.speed > maxSpeed) {
			return true;
		}
		return false;
	}
}
