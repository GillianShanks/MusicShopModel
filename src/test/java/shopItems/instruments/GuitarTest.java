package shopItems.instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.propertyEnums.GuitarMaterial;
import shopItems.instruments.propertyEnums.InstrumentType;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar (400, 600, "Plucky", GuitarMaterial.WOOD, "natural", InstrumentType.String, 6);

    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(400, guitar.getWholesalePrice(),0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(600, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBrand() {
        assertEquals("Plucky", guitar.getBrand());
    }

    @Test
    public void hasMaterial() {
        assertEquals(GuitarMaterial.WOOD, guitar.getMaterial());

    }

    @Test
    public void hasColour() {
        assertEquals("natural", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.String, guitar.getInstrumentType());
    }

    @Test
    public void hasNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canGetMarkupValue() {
        assertEquals(200, guitar.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("twang twang", guitar.play());
    }
}
