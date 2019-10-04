package shopItems;

public class SheetMusic extends ShopItem {

    private String songTitle;
    private String composer;

    public SheetMusic(double wholesalePrice, double sellingPrice, String brand, String songTitle, String composer) {
        super(wholesalePrice, sellingPrice, brand);
        this.songTitle = songTitle;
        this.composer = composer;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getComposer() {
        return composer;
    }
}
