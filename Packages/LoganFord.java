import com.automobile.fourWheeler.Logan;
import com.automobile.fourWheeler.Ford;

public class LoganFord {

	public static void main(String[] args) {
		Logan logan = new Logan();
		logan.LoganS("Logan pro", "LOGAN455", "SUBODH", 280, 1);
		System.out.println(logan.getModelName());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.speed());
		System.out.println("Has gps " + logan.gps());

		System.out.println();
		Ford ford = new Ford();

		ford.FordS("Ford Neo", "FORD4556654", "Subodh", 330, 1);
		System.out.println(ford.getModelName());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.speed())
		;
		System.out.println("Has Air Conditionar " + ford.tempControl());

	}

}