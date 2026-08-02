import fighters.Archer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ArcherTest {

    @Test
    void buildArcherWithGoodValues(){

        // GIVEN : start data

        String name = "Médéric";
        int hp = 95;
        int strength = 19;
        int speed = 23;
        int precision = 23;

        // WHEN : the action we are testing

        // Build Archer class

        Archer archer = new Archer(name,hp,strength,speed,precision);

        // THEN : what we are expecting

        assertEquals(hp, archer.getHp());
        assertEquals(strength, archer.getStrength());
        assertEquals(speed, archer.getSpeed());
        assertEquals(precision, archer.getPrecision());

    }

    @Test
    void buildArcherWithTooHighHpValue(){

        // GIVEN : start data

        String name = "Samba";
        int hp = 102;
        int strength = 19;
        int speed = 23;
        int precision = 28;

        // WHEN : the action we are testing

        // Build Archer class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Archer(name,hp,strength,speed,precision));
    }

    @Test
    void buildArcherWithTooLowHpValue(){

        // GIVEN : start data

        String name = "Steeve";
        int hp = 89;
        int strength = 19;
        int speed = 23;
        int precision = 28;

        // WHEN : the action we are testing

        // Build Archer class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Archer(name,hp,strength,speed,precision));
    }

    @Test
    void buildArcherWithTooHighStrengthValue(){

        // GIVEN : start data

        String name = "Dominga";
        int hp = 95;
        int strength = 26;
        int speed = 23;
        int precision = 28;

        // WHEN : the action we are testing

        // Build Archer class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Archer(name,hp,strength,speed,precision));
    }

    @Test
    void buildArcherWithTooLowStrengthValue(){

        // GIVEN : start data

        String name = "Hélène";
        int hp = 95;
        int strength = 14;
        int speed = 23;
        int precision = 28;

        // WHEN : the action we are testing

        // Build Archer class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Archer(name,hp,strength,speed,precision));
    }

    @Test
    void buildArcherWithTooHighSpeedValue(){

        // GIVEN : start data

        String name = "Thibault";
        int hp = 95;
        int strength = 19;
        int speed = 26;
        int precision = 28;

        // WHEN : the action we are testing

        // Build Archer class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Archer(name,hp,strength,speed,precision));
    }

    @Test
    void buildArcherWithTooLowSpeedValue(){

        // GIVEN : start data

        String name = "Corentin";
        int hp = 95;
        int strength = 19;
        int speed = 20;
        int precision = 28;

        // WHEN : the action we are testing

        // Build Archer class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Archer(name,hp,strength,speed,precision));
    }

    @Test
    void buildArcherWithTooHighPrecisionValue(){

        // GIVEN : start data

        String name = "Amine";
        int hp = 95;
        int strength = 19;
        int speed = 23;
        int precision = 34;

        // WHEN : the action we are testing

        // Build Archer class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Archer(name,hp,strength,speed,precision));
    }

    @Test
    void buildArcherWithTooLowPrecisionValue(){

        // GIVEN : start data

        String name = "Amine";
        int hp = 95;
        int strength = 19;
        int speed = 23;
        int precision = 18;

        // WHEN : the action we are testing

        // Build Archer class

        // THEN : what we are expecting
        assertThrows(IllegalArgumentException.class, () -> new Archer(name,hp,strength,speed,precision));
    }





}
