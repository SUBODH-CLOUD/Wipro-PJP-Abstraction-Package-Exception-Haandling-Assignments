package live;

import music.Playable;
import music.wind.Saxophone;
import music.string.Veena;

public class Test extends Veena {
    public static void main(String[] args) {
    Veena Vinstance = new Veena();
    Saxophone Sinstance = new Saxophone();
    Playable Pvariable;
    Pvariable =  Vinstance;
    Pvariable.play();
    Pvariable = Sinstance;
    Pvariable.play();
    
}
}
