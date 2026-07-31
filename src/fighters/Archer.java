package fighters;

public class Archer extends Fighter{

    private int precision;

    public int getPrecision(){
        return this.precision;
    }

    public Archer(String name, int hp, int strength, int speed, int precision){
        super(name,hp, strength, speed);
        this.precision = precision;

        if (hp < 90 || hp > 100) {
            throw new IllegalArgumentException();
        }

        if (strength < 17 || strength > 21) {
            throw new IllegalArgumentException();
        }

        if (speed < 21 || speed > 25) {
            throw new IllegalArgumentException();
        }

        if (precision < 20 || precision > 30) {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public void getInformation() {

        super.getInformation();
        System.out.println("precision : " + precision);

    }
}
