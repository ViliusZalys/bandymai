package lt.vtvmpc.ems.akademijait.vilius;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {
    @Test
    public void productShouldHaveName(){
        Item products = new Item("Pear", 15.0);

       assertEquals(15.0, products.getPrice());
       assertEquals("Pear", products.getName());
    }





}