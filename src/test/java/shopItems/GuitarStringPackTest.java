package shopItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringPackTest {

    GuitarStringPack guitarStringPack;

    @Before
    public void before(){
        guitarStringPack = new GuitarStringPack (10, 15, "Plucky", 6);

    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(10, guitarStringPack.getWholesalePrice(),0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(15, guitarStringPack.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBrand() {
        assertEquals("Plucky", guitarStringPack.getBrand());
    }

    @Test
    public void canGetMarkupValue() {
        assertEquals(5, guitarStringPack.calculateMarkup(), 0.0);
    }

    @Test
    public void hasPackSize() {
        assertEquals(6, guitarStringPack.getPackSize());
    }
}
