import fighters.Archer;
import fighters.Fighter;
import fighters.Mage;
import fighters.Warrior;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    Warrior warrior = new Warrior("Warrior",106, 20,8,12);
    Archer archer = new Archer("Archer",100, 17,21,29);
    Mage mage = new Mage("Mage",98, 14,18,32);

    //warrior.getInformation();
    //archer.getInformation();
    //mage.getInformation();

    int abilityResult = archer.specialAbility();
    int featResult = archer.feat();
    int modifierResult = archer.modifier();
    int power = archer.power();

    System.out.println("ability result : " + abilityResult);
    System.out.println("feat result : " + featResult);
    System.out.println("modifier result : " + modifierResult);
    System.out.println("power result : " + power);




}
