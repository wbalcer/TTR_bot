import java.util.ArrayList;
import java.util.Objects;


public class City {
    String name;
    ArrayList<Connection> connections = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        City city = (City) obj;
        return name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
