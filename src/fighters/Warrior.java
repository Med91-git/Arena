package fighters;


public class Warrior extends Fighter {

    public Warrior(String name,int hp, int strength, int speed, int specificAttribute){
        super(name, hp, strength, speed, specificAttribute);

        if (hp < 96 || hp > 106) {
            throw new IllegalArgumentException();
        }

        if (strength < 20 || strength > 24) {
            throw new IllegalArgumentException();
        }

        if (speed < 8 || speed > 12) {
            throw new IllegalArgumentException();
        }

    }
    @Override
    public void getInformation() {

        super.getInformation();

    }


}
