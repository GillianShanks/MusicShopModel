package shopItems.instruments;

public class Guitar extends Instrument{

    private int numOfStrings;

    public Guitar(double wholesalePrice, double sellingPrice, String brand, String material, String colour, InstrumentType instrumentType, int numOfStrings) {
        super(wholesalePrice, sellingPrice, brand, material, colour, instrumentType);
        this.numOfStrings = numOfStrings;

    }


    public int getNumOfStrings() {
        return numOfStrings;
    }
}
