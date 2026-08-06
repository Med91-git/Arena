package fighters;

public class Mage extends Fighter {

    private int mana;

    public int getMana(){
        return this.mana;
    }

    public Mage(String name, int hp, int strength, int speed, int mana){
        super(name, hp, strength, speed);
        this.mana = mana;

        if (getHp() < 88 || getHp() > 98) {
            throw new IllegalArgumentException();
        }

        if (getStrength() < 14 || getStrength() > 18) {
            throw new IllegalArgumentException();
        }

        if (getSpeed() < 18 || getSpeed() > 22) {
            throw new IllegalArgumentException();
        }

        if (getMana() < 32 || getMana() > 48) {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public void getInformation() {

        super.getInformation();
        System.out.println("mana : " + mana);

    }

    @Override
    public int specialAbility() {
        return getSpeed()*2;
    }

    @Override
    public int feat() {
        return getMana()/8;
    }


}
