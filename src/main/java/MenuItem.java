/**
 * This is a model of a menu item of a KFC restaurant.
 */
public class MenuItem {
    String name;
    String description;
    String imageUrl;
    /**
     * The notes field almost always contains the same standard String. It may be useful in case some non-standard
     * text has to be written
     */
    String notes;
    int priceRub;
    int weightGrams;
    int calories;
    double proteins;
    double fats;
    double hydrocarbons;
    /**
     * The availableQuickOrder field is used to define if the link to the delivery club is shown (large plus sign).<br/>
     * Also if true the page of the item will have no "Order" button
     */
    boolean availableQuickOrder;

    public MenuItem(String name, String description, String imageUrl, String notes, int priceRub, int weightGrams,
                    int calories, double proteins, double fats, double hydrocarbons, boolean availableQuickOrder) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.notes = notes;
        this.priceRub = priceRub;
        this.weightGrams = weightGrams;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.hydrocarbons = hydrocarbons;
        this.availableQuickOrder = availableQuickOrder;
    }
}
