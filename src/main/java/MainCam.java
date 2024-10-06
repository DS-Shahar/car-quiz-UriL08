
public class MainCam {

	public static int legalCities(CameraInfo[] cameras) {
		int count = 0;
		
		for (int i=0 ; i<cameras.length ; i++) {
			if (cameras[i].allGood() == true) {
				for (int j=0 ; j<i ; j++) {
					if (cameras[i].getCity() != cameras[j].getCity()) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
