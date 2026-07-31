package fighters;


public class Warrior extends Fighter {

    private int rage;

    public int getRage(){
        return this.rage;
    }

    public Warrior(String name,int hp, int strength, int speed, int rage){
        super(name, hp, strength, speed);
        this.rage = rage;


        if (hp < 96 || hp > 106) {
            throw new IllegalArgumentException();
        }

        if (strength < 20 || strength > 24) {
            throw new IllegalArgumentException();
        }

        if (speed < 8 || speed > 12) {
            throw new IllegalArgumentException();
        }

        if (rage < 12 || rage > 18) {
            throw new IllegalArgumentException();
        }

    }
    @Override
    public void getInformation() {

        super.getInformation();
        System.out.println("rage : " + rage);

    }


}
