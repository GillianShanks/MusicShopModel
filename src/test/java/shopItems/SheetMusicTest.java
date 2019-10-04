package shopItems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic (2, 10, "Musical Notology", "Doctor Who Theme", "BBC");
    }

    @Test
    public void hasWholesalePrice() {
        assertEquals(2, sheetMusic.getWholesalePrice(),0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(10, sheetMusic.getSellingPrice(), 0.0);
    }

    @Test
    public void hasBrand() {
        assertEquals("Musical Notology", sheetMusic.getBrand());
    }

    @Test
    public void canGetMarkupValue() {
        assertEquals(8, sheetMusic.calculateMarkup(), 0.0);
    }

    @Test
    public void hasTitle() {
        assertEquals("Doctor Who Theme", sheetMusic.getSongTitle());
    }

    @Test
    public void hasComposer() {
        assertEquals("BBC", sheetMusic.getComposer());
    }
}
