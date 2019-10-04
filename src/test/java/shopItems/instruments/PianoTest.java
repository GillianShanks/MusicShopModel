package shopItems.instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.propertyEnums.InstrumentType;
import shopItems.instruments.propertyEnums.KeyType;
import shopItems.instruments.propertyEnums.PianoMaterial;
import shopItems.instruments.propertyEnums.PianoType;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano (1000, 1500, "AllTheKeys", PianoMaterial.BIRCH, "black", InstrumentType.Keyboard, PianoType.BABYGRAND, KeyType.HAMMERACTION);

    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(1000, piano.getWholesalePrice(),0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(1500, piano.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBrand() {
        assertEquals("AllTheKeys", piano.getBrand());
    }

    @Test
    public void hasMaterial() {
        assertEquals(PianoMaterial.BIRCH, piano.getMaterial());

    }

    @Test
    public void hasColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.Keyboard, piano.getInstrumentType());
    }

    @Test
    public void hasPianoType() {
        assertEquals(PianoType.BABYGRAND, piano.getPianoType());
    }

    @Test
    public void hasKeyType() {
        assertEquals(KeyType.HAMMERACTION, piano.getKeyType());
    }

    @Test
    public void canGetMarkupValue() {
        assertEquals(500, piano.calculateMarkup(), 0.0);
    }

    @Test
    public void canPlay() {
        assertEquals("plinky plonk", piano.play());
    }
}
