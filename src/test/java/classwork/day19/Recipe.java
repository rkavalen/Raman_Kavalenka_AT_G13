package classwork.day19;

import java.util.List;

public class Recipe {
    private String recipename;
    private List<Ingredient> ingredlist;
    private int preptime;

    public Recipe(String recipename, List<Ingredient> ingredlist, int preptime) {
        this.recipename = recipename;
        this.ingredlist = ingredlist;
        this.preptime = preptime;
    }

    public Recipe() {
    }

    public String getRecipename() {
        return recipename;
    }

    public void setRecipename(String recipename) {
        this.recipename = recipename;
    }

    public List<Ingredient> getIngredlist() {
        return ingredlist;
    }

    public void setIngredlist(List<Ingredient> ingredlist) {
        this.ingredlist = ingredlist;
    }

    public int getPreptime() {
        return preptime;
    }

    public void setPreptime(int preptime) {
        this.preptime = preptime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Recipe recipe = (Recipe) o;
        return getPreptime() == recipe.getPreptime() && getRecipename().equals(recipe.getRecipename()) && getIngredlist().equals(recipe.getIngredlist());
    }

    @Override
    public int hashCode() {
        int result = getRecipename().hashCode();
        result = 31 * result + getIngredlist().hashCode();
        result = 31 * result + getPreptime();
        return result;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipename='" + recipename + '\'' +
                ", ingredlist=" + ingredlist +
                ", preptime=" + preptime +
                '}';
    }
}
