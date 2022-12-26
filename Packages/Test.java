
import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Test {

	public static void main(String[] args) {
        Hero hero = new Hero();
		hero.HeroS("Glamour 125", "WB16G1234", "Bob Biswas", 85);
		System.out.println( hero.getModelName());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getSpeed());
		hero.radio();
		
		System.out.println();
        Honda honda = new Honda();
		
		honda.HondaS("Honda City", "WB18G7777", "Prodosh Mitra", 110);
		System.out.println(honda.getModelName());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getSpeed());
		honda.cdplayer();

	}

}