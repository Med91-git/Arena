package tests;

import fighters.Warrior;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class WarriorTest {

    @Test
    void buildWarriorWithGoodValues(){

        // GIVEN : start data

        String name = "Alan";
        int hp = 106;
        int strength = 20;
        int speed = 8;
        int rage = 12;
        int specialAbility = 32;
        int featValue = 4;
        int modifierValue = 3;
        int powerValue = 173;

        // WHEN : the action we are testing

        // Build Warrior class

         Warrior warrior = new Warrior(name,hp,strength,speed,rage);

        // THEN : what we are expecting

        assertEquals(hp, warrior.getHp());
        assertEquals(strength, warrior.getStrength());
        assertEquals(speed, warrior.getSpeed());
        assertEquals(rage, warrior.getRage());

        assertEquals(specialAbility, warrior.specialAbility());
        assertEquals(featValue, warrior.feat());
        assertEquals(modifierValue, warrior.modifier());
        assertEquals(powerValue, warrior.power());


    }

    @Test
    void buildWarriorWithTooHighHpValue(){

        // GIVEN : start data

        String name = "Bob";
        int hp = 107;
        int strength = 22;
        int speed = 9;
        int rage = 12;

        // WHEN : the action we are testing

        // Build Warrior class (line 52)

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Warrior(name,hp,strength,speed,rage));
    }

    @Test
    void buildWarriorWithTooLowHpValue(){

        // GIVEN : start data

        String name = "Patrick";
        int hp = 95;
        int strength = 22;
        int speed = 9;
        int rage = 12;

        // WHEN : the action we are testing

        // Build Warrior class (line 52)

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Warrior(name,hp,strength,speed,rage));
    }

    @Test
    void buildWarriorWithTooLowStrengthValue(){

        // GIVEN : start data

        String name = "Jacques";
        int hp = 96;
        int strength = 18;
        int speed = 9;
        int rage = 12;

        // WHEN : the action we are testing

        // Build Warrior class (line 52)

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Warrior(name,hp,strength,speed,rage));
    }

    @Test
    void buildWarriorWithTooHighStrengthValue(){

        // GIVEN : start data

        String name = "Amel";
        int hp = 96;
        int strength = 25;
        int speed = 9;
        int rage = 12;

        // WHEN : the action we are testing

        // Build Warrior class (line 52)

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Warrior(name,hp,strength,speed,rage));
    }

    @Test
    void buildWarriorWithTooLowSpeedValue(){

        // GIVEN : start data

        String name = "jules";
        int hp = 96;
        int strength = 20;
        int speed = 6;
        int rage = 12;

        // WHEN : the action we are testing

        // Build Warrior class (line 52)

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Warrior(name,hp,strength,speed,rage));
    }

    @Test
    void buildWarriorWithTooHighSpeedValue(){

        // GIVEN : start data

        String name = "Arnaud";
        int hp = 96;
        int strength = 20;
        int speed = 14;
        int rage = 12;

        // WHEN : the action we are testing

        // Build Warrior class (line 52)

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Warrior(name,hp,strength,speed,rage));
    }

    @Test
    void buildWarriorWithTooHighRageValue(){

        // GIVEN : start data

        String name = "Arnaud";
        int hp = 96;
        int strength = 20;
        int speed = 11;
        int rage = 11;

        // WHEN : the action we are testing

        // Build Warrior class (line 52)

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Warrior(name,hp,strength,speed,rage));
    }

    @Test
    void buildWarriorWithTooLowRageValue(){

        // GIVEN : start data

        String name = "Arnaud";
        int hp = 96;
        int strength = 21;
        int speed = 10;
        int rage = 21;

        // WHEN : the action we are testing

        // Build Warrior class (line 52)

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Warrior(name,hp,strength,speed,rage));
    }






}
