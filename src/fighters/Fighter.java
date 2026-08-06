package fighters;

public abstract class Fighter {

    private String name;
    private int hp;
    private int strength;
    private int speed;

    // getters/setters

    public String getName(){
        return this.name;
    }


    public int getHp(){
        return this.hp;
    }


    public int getStrength(){
        return this.strength;
    }


    public int getSpeed(){
        return this.speed;
    }



    public Fighter(String name, int hp, int strength, int speed){

        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.speed = speed;

    }

    public void getInformation() {

        System.out.println("name : " + name);
        System.out.println("hp : " + hp);
        System.out.println("strenght : " + strength);
        System.out.println("speed : " + speed);
    }

    public abstract int specialAbility();

    public abstract int feat();

    public int modifier() {
       return getSpeed()/10;
    }

    public int power() {
        return hp + strength + speed + specialAbility() + feat() + modifier();
    }






}
