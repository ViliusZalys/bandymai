package lt.vtvmpc.ems.akademijait;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    @Test
    public void itemShouldHaveNameAndBasePrice(){
        Item item = new Item("Pear", 5.0);

        assertEquals("Pear", item.getName());
        assertEquals(5.0, item.getBasePrice());


    }

}