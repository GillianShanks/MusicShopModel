package shop;

import org.junit.Before;
import org.junit.Test;
import shopItems.GuitarStringPack;
import shopItems.SheetMusic;
import shopItems.instruments.Guitar;
import shopItems.instruments.Piano;
import shopItems.instruments.propertyEnums.*;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Piano piano;
    Guitar guitar;
    GuitarStringPack guitarStringPack;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop();
        piano = new Piano (1000, 1500, "AllTheKeys", PianoMaterial.BIRCH, "black", InstrumentType.Keyboard, PianoType.BABYGRAND, KeyType.HAMMERACTION);
        guitar = new Guitar(400, 600, "Plucky", GuitarMaterial.WOOD, "natural", InstrumentType.String, 6);
        guitarStringPack = new GuitarStringPack(10, 15, "Plucky", 6);
        sheetMusic = new SheetMusic(2, 10, "Musical Notology", "Doctor Who Theme", "BBC");
    }

    @Test
    public void hasEmptyStockAtStart() {
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddStock() {
        shop.addItem(piano);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.addItem(piano);
        shop.removeItem(piano);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void getTotalProfit() {
        //Given there are several items added to the shop
        shop.addItem(piano);
        shop.addItem(guitar);
        shop.addItem(guitarStringPack);
        shop.addItem(sheetMusic);
        //Then the total profit will be £713
        assertEquals(713, shop.calculateTotalProfit(), 0.0);
    }
}
