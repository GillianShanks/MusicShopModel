package shopItems;

public class GuitarStringPack extends ShopItem {

    private int packSize;

    public GuitarStringPack(double wholesalePrice, double sellingPrice, String brand, int packSize) {
        super(wholesalePrice, sellingPrice, brand);
        this.packSize = packSize;
    }

    public int getPackSize() {
        return packSize;
    }
}
