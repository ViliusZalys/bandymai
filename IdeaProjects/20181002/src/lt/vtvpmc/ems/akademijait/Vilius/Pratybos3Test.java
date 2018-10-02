package lt.vtvpmc.ems.akademijait.Vilius;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Pratybos3Test {
    @Test
    void checkChar(){
        assertEquals('o', Pratybos3.changeStringToCharacterArray("Tomas"));
    }

}