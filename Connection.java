public class Connection {
    City cityA;
    City cityB;
    int distance;
    String colour1;
    String colour2;
    int taken;
    int ferries;
    public boolean hasCity(City city) {
        return cityA.equals(city) || cityB.equals(city);
    }

    // Method to get the other city connected by the connection
    public City getOtherCity(City city) {
        if (city.equals(cityA)) {
            return cityB;
        } else if (city.equals(cityB)) {
            return cityA;
        } else {
            return null; // If the provided city is not part of the connection
        }
    }
}
