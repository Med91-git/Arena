package fighters;

public class Archer extends Fighter{

    public Archer(String name, int hp, int strength, int speed, int specificAttribute){
        super(name,hp, strength, speed, specificAttribute);

        if (hp < 90 || hp > 100) {
            throw new IllegalArgumentException();
        }

        if (strength < 17 || strength > 21) {
            throw new IllegalArgumentException();
        }

        if (speed < 21 || speed > 25) {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public void getInformation() {

        super.getInformation();

    }
}
