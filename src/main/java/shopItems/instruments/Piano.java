package shopItems.instruments;

import shopItems.instruments.propertyEnums.InstrumentType;
import shopItems.instruments.propertyEnums.KeyType;
import shopItems.instruments.propertyEnums.PianoMaterial;
import shopItems.instruments.propertyEnums.PianoType;

public class Piano extends Instrument{

    private KeyType keyType;
    private PianoType pianoType;

    public Piano(double wholesalePrice, double sellingPrice, String brand, PianoMaterial material, String colour, InstrumentType instrumentType, PianoType pianoType, KeyType keyType) {
        super(wholesalePrice, sellingPrice, brand, material, colour, instrumentType);
        this.pianoType = pianoType;
        this.keyType = keyType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public KeyType getKeyType() {
        return keyType;
    }

    public String play() {
        return "plinky plonk";
    }
}
