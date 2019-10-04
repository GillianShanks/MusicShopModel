package shopItems.instruments;

import interfaces.IPlay;
import shopItems.ShopItem;
import shopItems.instruments.propertyEnums.InstrumentType;

public abstract class Instrument extends ShopItem implements IPlay {

    private String material;
    private String colour;
    private InstrumentType instrumentType;


    public Instrument(double wholesalePrice, double sellingPrice, String brand, String material, String colour, InstrumentType instrumentType) {
        super(wholesalePrice, sellingPrice, brand);
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
