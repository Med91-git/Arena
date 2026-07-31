package fighters;

public class Mage extends Fighter {

    public Mage(String name, int hp, int strength, int speed, int specificAttribute){
        super(name, hp, strength, speed, specificAttribute);

        if (hp < 88 || hp > 98) {
            throw new IllegalArgumentException();
        }

        if (strength < 14 || strength > 18) {
            throw new IllegalArgumentException();
        }

        if (speed < 18 || speed > 22) {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public void getInformation() {

        super.getInformation();

    }
}
