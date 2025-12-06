package classwork.day19;

public class Ingredient {
    private String itemdescription;
    private int quantity;

    public Ingredient(String itemdescription, int quantity) {
        this.itemdescription = itemdescription;
        this.quantity = quantity;
    }

    public Ingredient() {
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;
        return getQuantity() == that.getQuantity() && getItemdescription().equals(that.getItemdescription());
    }

    @Override
    public int hashCode() {
        int result = getItemdescription().hashCode();
        result = 31 * result + getQuantity();
        return result;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "itemdescription='" + itemdescription + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
