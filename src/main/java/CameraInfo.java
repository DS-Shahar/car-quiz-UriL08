
public class CameraInfo {
	private int city;
	private int maxSpeed;
	private CarInfo[] cars;
	
	
	public int getCity() {
		return city;
	}
	
	public boolean allGood() {
		for (int i=0 ; i < cars.length ; i++) {
			if (cars[i].illegal(maxSpeed) == true) {
				return false;
			}
		}
		return true;
	}
}
