package fighters;

public abstract class Fighter {

    protected String name;
    protected int hp;
    protected int strength;
    protected int speed;
    protected int specificAttribute;

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


    public int getSpecificAttribute(){
        return this.specificAttribute;
    }


    public Fighter(String name, int hp, int strength, int speed, int specificAttribute){

        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.speed = speed;
        this.specificAttribute = specificAttribute;

    }

    public void getInformation() {

        System.out.println("name : " + name);
        System.out.println("hp : " + hp);
        System.out.println("strenght : " + strength);
        System.out.println("speed : " + speed);
        System.out.println("specificAttribute : " + specificAttribute);
    }





}
