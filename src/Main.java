import fighters.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Warrior warrior = new Warrior("Warrior",106, 20,8,12);
    Archer archer = new Archer("Archer",100, 17,21,29);
    //Mage mage = new Mage("Mage",98, 14,18,32);
    Mage mage = new Mage("Mage",98, 14,19,33); 

    //warrior.getInformation();
    //archer.getInformation();
    //mage.getInformation();

    /*int abilityResult = warrior.specialAbility();
    int featResult = warrior.feat();
    int modifierResult = warrior.modifier();
    int power = warrior.power();

    System.out.println("ability result : " + abilityResult);
    System.out.println("feat result : " + featResult);
    System.out.println("modifier result : " + modifierResult);
    System.out.println("power result : " + power);*/

    FightManager.fight1v1(mage, archer);

    System.out.println("pts puissance de " + mage.getName() + " : " + mage.power());
    System.out.println("pts puissance de " + archer.getName() + " : " + archer.power());

}
