package week9;

public class planetDemo {

	public static void main(String[] args) {
		Planet myPlanet = Planet.EARTH;
		System.out
				.println(myPlanet + " " + myPlanet.getDesc() + 
						" It has surface gravity " + 
						myPlanet.surfaceGravity());

	}

}
