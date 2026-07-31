package fighters;

public class Mage extends Fighter {

    private int mana;

    public int getMana(){
        return this.mana;
    }

    public Mage(String name, int hp, int strength, int speed, int mana){
        super(name, hp, strength, speed);
        this.mana = mana;

        if (hp < 88 || hp > 98) {
            throw new IllegalArgumentException();
        }

        if (strength < 14 || strength > 18) {
            throw new IllegalArgumentException();
        }

        if (speed < 18 || speed > 22) {
            throw new IllegalArgumentException();
        }

        if (mana < 32 || mana > 48) {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public void getInformation() {

        super.getInformation();
        System.out.println("mana : " + mana);

    }
}
