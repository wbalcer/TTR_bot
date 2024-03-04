import java.util.*;

public class Game {
    static ArrayList<Ticket> tickets = new ArrayList<>();
    static HashMap<Connection, Integer> connectionsWeight = new HashMap<>();
    static HashMap<String, Integer> coloursWeight = new HashMap<>();
    static HashMap<String, Integer> coloursCount = new HashMap<>();
    static HashMap<String, Integer> cards = new HashMap<>();
    static String[] flop = new String[5];
    static int trains = 45;


    public static void fillColours(){
        cards.put("black",0);
        cards.put("white",0);
        cards.put("orange",0);
        cards.put("red",0);
        cards.put("yellow",0);
        cards.put("pink",0);
        cards.put("blue",0);
        cards.put("green",0);
        cards.put("joker",0);
    }
    public static void addTicket(String startCity, String endCity){
        Ticket ticket = new Ticket();
        ticket.cityA = Board.findCityByName(startCity);
        ticket.cityB = Board.findCityByName(endCity);
        tickets.add(ticket);
    }
    public static void addCard(String colour){
        cards.put(colour, cards.get(colour)+1);
    }
    public static void fillFlop(String colour, int space) {
        flop[space] = colour;
    }
    public static void claimRoute(String ctA, String ctB, int playerN) {
         for (Connection connection : Objects.requireNonNull(Board.findCityByName(ctA)).connections) {
             if (connection.cityB.equals(Board.findCityByName(ctB))) {
                 connection.taken = playerN;
                 break;
             }
         }
    }

    public static String move() {
        restart();
        int cardsTaken = 0;
        weighConnections();
        countAndWeighColours();
        checkNeighbours();
        for (Connection weight : connectionsWeight.keySet()) {
            System.out.println(weight.cityA.name + "-" + weight.cityB.name + " " + connectionsWeight.get(weight));
        }
        System.out.println(Collections.singletonList(connectionsWeight.toString()));
        LinkedHashMap<Connection, Integer> sorted = sort(connectionsWeight);
        LinkedHashMap<String, Integer> sortedC = sortDesColours(coloursWeight);
        System.out.println(List.of(sortedC));
        for (int i = 6; i > 0; i--) {
            for (Connection connection : sorted.keySet()) { //any connection possible with given weight?
                if (sorted.get(connection) < i) {
                    break;
                }
                String result = possibleConnection(connection);
                if (result != null) {
                    return connection.cityA.name + "-" + connection.cityB.name + " using " + result;
                }
            }
            for (Map.Entry<String, Integer> colour : sortedC.entrySet()) { //any attractive card in the flop?
                String card1 = "";
                String card2;
                System.out.println(colour.getKey() + colour.getValue());
                if (colour.getValue() < i * 2) {
                    break;
                }
                for (int j = 0; j < 5; j++) {
                    if ((flop[j].equalsIgnoreCase(colour.getKey()))) {
                        cards.put(flop[j], cards.get(flop[j]) + 1);
                        card1 = flop[j];
                        Main.flopFilling(j);
                        cardsTaken++;
                        j--;
                    }
                    if (cardsTaken == 2) {
                        return card1 + " " + card1;
                    }
                }
                if (cardsTaken == 1) {
                    for (Map.Entry<String, Integer> colour2 : sortedC.entrySet()) {
                        if (colour2.getValue() == 0) {
                            break;
                        }
                        for (int k = 0; k < 5; k++) {
                            if ((flop[k].equalsIgnoreCase(colour2.getKey()))) {
                                cards.put(flop[k], cards.get(flop[k]) + 1);
                                card2 = flop[k];
                                Main.flopFilling(k);
                                return card1 + " " + card2;
                            }
                        }
                    }
                    Main.drawRandom();
                    return card1 + " blind draw";
                }
            }
        }
        Main.drawRandom();
        Main.drawRandom();
        return "2 blind draws";
    }

    public static void weighConnections() {
        for (Ticket ticket : tickets) {
            for(Connection connection : Board.shortestPath(ticket.cityA, ticket.cityB)) {

                if (connectionsWeight.containsKey(connection)) {
                    connectionsWeight.put(connection,connectionsWeight.get(connection) + 5);
                } else {
                    connectionsWeight.put(connection, 1);
                }

                for (Connection cityConnection : connection.cityB.connections) {
                    if (connectionsWeight.containsKey(cityConnection) && cityConnection != connection) {
                        connectionsWeight.put(connection, connectionsWeight.get(connection) + 1);
                        System.out.println("x");
                    }
                }
                for (Connection cityConnection : connection.cityA.connections) {
                    if (connectionsWeight.containsKey(cityConnection) && cityConnection != connection) {
                        connectionsWeight.put(connection, connectionsWeight.get(connection) + 1);
                        System.out.println("y");
                    }
                }

            }
        }
    }
    public static void countAndWeighColours() {
        for (Connection connection : connectionsWeight.keySet()) {
            if (connection.ferries > 0) {
                coloursWeight.put("joker", connection.ferries * connectionsWeight.get(connection) + coloursWeight.get("joker"));
                coloursCount.put("joker", coloursCount.get("joker") + connection.ferries);
            }
            if (connection.colour1 == null) {
                continue;
            }
            if (connection.colour2 == null) {
                coloursWeight.put(connection.colour1, connection.distance * connectionsWeight.get(connection) + coloursWeight.get(connection.colour1));
                coloursCount.put(connection.colour1, coloursCount.get(connection.colour1) + connection.distance);
            } else {
                if (coloursCount.get(connection.colour1) > coloursCount.get(connection.colour2)) {
                    coloursWeight.put(connection.colour2, connection.distance * connectionsWeight.get(connection) + coloursWeight.get(connection.colour2));
                    coloursCount.put(connection.colour2, coloursCount.get(connection.colour2)+connection.distance);
                } else {
                    coloursWeight.put(connection.colour1, connection.distance * connectionsWeight.get(connection) + coloursWeight.get(connection.colour1));
                    coloursCount.put(connection.colour1, coloursCount.get(connection.colour1)+connection.distance);
                        }
                }
            }
    }
    public static void checkNeighbours() {
        for (Connection connection : connectionsWeight.keySet()) {
            for (Connection connectionA : connection.cityA.connections) {
                if (connectionA.taken == 1) {
                    connectionsWeight.put(connection,connectionsWeight.get(connection)+3);
                }
            }
            for (Connection connectionB : connection.cityB.connections) {
                if (connectionB.taken == 1) {
                    connectionsWeight.put(connection,connectionsWeight.get(connection)+3);
                }
            }
        }
    }

    public static String possibleConnection(Connection connection) {
        if (connection.taken == 2) {
            return null;
        }
        if (connection.colour1 != null && connection.colour2 == null) { //single colour connection
            if (connection.distance <= cards.get(connection.colour1)) {
                claimConnection(connection, connection.colour1);
                return connection.colour1;
            } else {
                return null;
            }
        } else if (connection.colour1 != null) { //double colour connection
            if (connection.distance <= cards.get(connection.colour1) || connection.distance <= cards.get(connection.colour2)) {
                if (connection.distance <= cards.get(connection.colour1) && connection.distance <= cards.get(connection.colour2)) {
                    if (coloursWeight.get(connection.colour1) > coloursWeight.get(connection.colour2)) {
                        claimConnection(connection, connection.colour2);
                    } else {
                        claimConnection(connection, connection.colour1);
                    }
                    return connection.colour1;
                } else if (connection.distance <= cards.get(connection.colour1)) {
                    claimConnection(connection, connection.colour1);
                    return connection.colour1;
                } else {
                    claimConnection(connection, connection.colour2);
                    return connection.colour2;
                }
            } else { //not enough colours for any line
                return null;
            }
        } else { //grey connection
            LinkedHashMap<String, Integer> sorted = sortColours(coloursWeight);
            if (cards.get("joker") < connection.ferries) {
                return null;
            }
            for (String colour : sorted.keySet()) {
                if (cards.get(colour) >= connection.distance) {
                    claimConnection(connection, colour);
                    return colour;
                }
            }
        }
        return null;
    }

    public static void claimConnection(Connection connection, String colour) {
        connection.taken = 2;
        cards.put(colour, cards.get(colour) - connection.distance + connection.ferries);
        cards.put("joker", cards.get("joker") - connection.ferries);
        trains -= connection.distance;
    }

    public static LinkedHashMap<Connection, Integer> sort(HashMap<Connection, Integer> map) {
        List<Map.Entry<Connection, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        LinkedHashMap<Connection, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Connection, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    public static LinkedHashMap<String, Integer> sortColours(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
    public static LinkedHashMap<String, Integer> sortDesColours(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static List<Ticket> chooseTickets() {
        weighConnections();
        List<Ticket> validTickets = new ArrayList<>();

        for (Ticket ticket : tickets) {
            boolean isValid = true;
            for (Connection connection : Board.shortestPath(ticket.cityA, ticket.cityB)) {
                if (connectionsWeight.getOrDefault(connection, 0) > 2) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                validTickets.add(ticket);
            }
        }

        if (validTickets.size() > 2) {
            validTickets.sort(Comparator.comparingInt(ticket -> {
                int distanceSum = 0;
                for (Connection connection : Board.shortestPath(ticket.cityA, ticket.cityB)) {
                    distanceSum += connection.distance;
                }
                return distanceSum;
            }));
            validTickets = validTickets.subList(0, 2);
        }
        tickets.removeAll(validTickets);
        return validTickets;
    }


    private static void restart() {
        coloursWeight.put("black",0);
        coloursWeight.put("white",0);
        coloursWeight.put("orange",0);
        coloursWeight.put("red",0);
        coloursWeight.put("yellow",0);
        coloursWeight.put("pink",0);
        coloursWeight.put("blue",0);
        coloursWeight.put("green",0);
        coloursWeight.put("joker",0);
        coloursCount.put("black",0);
        coloursCount.put("white",0);
        coloursCount.put("orange",0);
        coloursCount.put("red",0);
        coloursCount.put("yellow",0);
        coloursCount.put("pink",0);
        coloursCount.put("blue",0);
        coloursCount.put("green",0);
        coloursCount.put("joker",0);
        connectionsWeight.clear();
    }
}
