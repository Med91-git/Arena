package fighters;

public class Archer extends Fighter{

    private int precision;

    public int getPrecision(){
        return this.precision;
    }

    public Archer(String name, int hp, int strength, int speed, int precision){
        super(name,hp, strength, speed);
        this.precision = precision;

        if (getHp() < 90 || getHp() > 100) {
            throw new IllegalArgumentException();
        }

        if (getStrength() < 17 || getStrength() > 21) {
            throw new IllegalArgumentException();
        }

        if (getSpeed() < 21 || getSpeed() > 25) {
            throw new IllegalArgumentException();
        }

        if (getPrecision() < 20 || getPrecision() > 30) {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public void getInformation() {

        super.getInformation();
        System.out.println("precision : " + precision);

    }

    @Override
    public int specialAbility() {
        return getSpeed() + getStrength()/2;
    }

    @Override
    public int feat() {
        return getPrecision()/5;
    }




}
