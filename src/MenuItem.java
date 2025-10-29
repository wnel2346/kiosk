public class MenuItem {
    private String name;
    private int price;
    private String description;

    public MenuItem(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void displayInfo() {
        System.out.printf("  - %s (%,d원): %s\n", name, price, description);
    }
    public String getDisplayInfo() {
        String formattedPrice = String.format("%,d원", price);
        return String.format("%s |%s| %s", name, formattedPrice, description);
    }
}
