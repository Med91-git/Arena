package fighters;


public class Warrior extends Fighter {

    private int rage;

    public int getRage(){
        return this.rage;
    }

    public Warrior(String name,int hp, int strength, int speed, int rage){
        super(name, hp, strength, speed);
        this.rage = rage;

        if (getHp() < 96 || getHp() > 106) {
            throw new IllegalArgumentException();
        }

        if (getStrength() < 20 || getStrength() > 24) {
            throw new IllegalArgumentException();
        }

        if (getSpeed() < 8 || getSpeed() > 12) {
            throw new IllegalArgumentException();
        }

        if (getRage() < 12 || getRage() > 18) {
            throw new IllegalArgumentException();
        }

    }
    @Override
    public void getInformation() {

        super.getInformation();
        System.out.println("rage : " + rage);

    }


}
