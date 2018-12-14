import javafx.scene.control.MenuItem;

public class BubblingMenuItem extends MenuItem {
    private boolean favorite;

    public BubblingMenuItem(String menuName){
        super(menuName);
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
