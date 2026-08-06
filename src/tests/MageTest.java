package tests;

import fighters.Mage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MageTest {

    @Test
    void buildMageWithGoodValues(){

        // GIVEN : start data

        String name = "Patrick";
        int hp = 98;
        int strength = 14;
        int speed = 18;
        int mana = 32;

        int specialAbility = 36;
        int featValue = 4;
        int modifierValue = 1;
        int powerValue = 171;

        // WHEN : the action we are testing

        // Build Mage class

        Mage mage = new Mage(name,hp,strength,speed,mana);

        // THEN : what we are expecting

        assertEquals(hp, mage.getHp());
        assertEquals(strength, mage.getStrength());
        assertEquals(speed, mage.getSpeed());
        assertEquals(mana, mage.getMana());

        assertEquals(specialAbility, mage.specialAbility());
        assertEquals(featValue, mage.feat());
        assertEquals(modifierValue, mage.modifier());
        assertEquals(powerValue, mage.power());



    }

    @Test
    void buildMageWithTooHighHpValue(){

        // GIVEN : start data

        String name = "Yannick";
        int hp = 100;
        int strength = 15;
        int speed = 20;
        int mana = 41;


        // WHEN : the action we are testing

        // Build Mage class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Mage(name,hp,strength,speed,mana));
    }

    @Test
    void buildMageWithTooLowHpValue(){

        // GIVEN : start data

        String name = "Johanna";
        int hp = 85;
        int strength = 15;
        int speed = 20;
        int mana = 41;

        // WHEN : the action we are testing

        // Build Mage class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Mage(name,hp,strength,speed,mana));
    }

    @Test
    void buildMageWithTooLowStrengthValue(){

        // GIVEN : start data

        String name = "Matthias";
        int hp = 90;
        int strength = 12;
        int speed = 20;
        int mana = 41;

        // WHEN : the action we are testing

        // Build Mage class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Mage(name,hp,strength,speed,mana));
    }

    @Test
    void buildMageWithTooHighStrengthValue(){

        // GIVEN : start data

        String name = "Alain";
        int hp = 90;
        int strength = 19;
        int speed = 20;
        int mana = 41;

        // WHEN : the action we are testing

        // Build Mage class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Mage(name,hp,strength,speed,mana));
    }

    @Test
    void buildMageWithTooLowSpeedValue(){

        // GIVEN : start data

        String name = "Harry";
        int hp = 90;
        int strength = 15;
        int speed = 13;
        int mana = 41;

        // WHEN : the action we are testing

        // Build Mage class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Mage(name,hp,strength,speed,mana));
    }

    @Test
    void buildMageWithTooHighSpeedValue(){

        // GIVEN : start data

        String name = "Rebecca";
        int hp = 90;
        int strength = 15;
        int speed = 23;
        int mana = 41;

        // WHEN : the action we are testing

        // Build Mage class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Mage(name,hp,strength,speed,mana));
    }

    @Test
    void buildMageWithTooHighManaValue(){

        // GIVEN : start data

        String name = "Jennifer";
        int hp = 90;
        int strength = 15;
        int speed = 20;
        int mana = 50;

        // WHEN : the action we are testing

        // Build Mage class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Mage(name,hp,strength,speed,mana));
    }

    @Test
    void buildMageWithTooLowManaValue(){

        // GIVEN : start data

        String name = "Yohan";
        int hp = 90;
        int strength = 15;
        int speed = 20;
        int mana = 31;

        // WHEN : the action we are testing

        // Build Mage class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Mage(name,hp,strength,speed,mana));
    }



}
