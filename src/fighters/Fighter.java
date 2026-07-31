package fighters;

public abstract class Fighter {

    protected String name;
    protected int hp;
    protected int strength;
    protected int speed;

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





}
