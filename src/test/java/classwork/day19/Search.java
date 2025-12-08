package classwork.day19;

public class Search {
    String user = "";
    boolean strict;

    public Search(String user, boolean strict) {
        this.user = user;
        this.strict = strict;
    }

    public Search() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isStrict() {
        return strict;
    }

    public void setStrict(boolean strict) {
        this.strict = strict;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Search search = (Search) o;
        return isStrict() == search.isStrict() && getUser().equals(search.getUser());
    }

    @Override
    public int hashCode() {
        int result = getUser().hashCode();
        result = 31 * result + Boolean.hashCode(isStrict());
        return result;
    }

    @Override
    public String toString() {
        return "Search{" +
                "user='" + user + '\'' +
                ", strict=" + strict +
                '}';
    }
}
