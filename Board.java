import java.util.*;

public class Board {
    static ArrayList<City> cities = new ArrayList<>();
    static ArrayList<Connection> connections = new ArrayList<>();
    static City Edinburgh = new City("Edinburgh");
    static City London = new City("London");
    static City Amsterdam = new City("Amsterdam");
    static City Dieppe = new City("Dieppe");
    static City Bruxelles = new City("Bruxelles");
    static City Essen = new City("Essen");
    static City Frankfurt = new City("Frankfurt");
    static City Paris = new City("Paris");
    static City Brest = new City("Brest");
    static City Kobenhavn = new City("Kobenhavn");
    static City Berlin = new City("Berlin");
    static City Munchen = new City("Munchen");
    static City Pamplona = new City("Pamplona");
    static City Marseille = new City("Marseille");
    static City Zurich = new City("Zurich");
    static City Stockholm = new City("Stockholm");
    static City Danzig = new City("Danzig");
    static City Warszawa = new City("Warszawa");
    static City Wien = new City("Wien");
    static City Venezia = new City("Venezia");
    static City Madrid = new City("Madrid");
    static City Barcelona = new City("Barcelona");
    static City Rome = new City("Rome");
    static City Petrograd = new City("Petrograd");
    static City Riga = new City("Riga");
    static City Wilno = new City("Wilno");
    static City Kyiv = new City("Kyiv");
    static City Budapest = new City("Budapest");
    static City Zagrab = new City("Zagrab");
    static City Lisboa = new City("Lisboa");
    static City Cadiz = new City("Cadiz");
    static City Palermo = new City("Palermo");
    static City Brindisi = new City("Brindisi");
    static City Moskva = new City("Moskva");
    static City Smolensk = new City("Smolensk");
    static City Kharkov = new City("Kharkov");
    static City Bucuresti = new City("Bucuresti");
    static City Sarajevo = new City("Sarajevo");
    static City Smyrna = new City("Smyrna");
    static City Athina = new City("Athina");
    static City Rostov = new City("Rostov");
    static City Sofia = new City("Sofia");
    static City Constantinople = new City("Constantinople");
    static City Sevastopol = new City("Sevastopol");
    static City Ancora = new City("Ancora");
    static City Sochi = new City("Sochi");
    static City Erzurum = new City("Erzurum");



    static Connection EdLo = new Connection();
    static Connection AmLo = new Connection();
    static Connection DiLo = new Connection();
    static Connection AmBr = new Connection();
    static Connection AmEs = new Connection();
    static Connection AmFr = new Connection();
    static Connection DiBr = new Connection();
    static Connection DiPa = new Connection();
    static Connection DiBt = new Connection();
    static Connection FrBr = new Connection();
    static Connection PaBr = new Connection();
    static Connection KoEs = new Connection();
    static Connection BeEs = new Connection();
    static Connection FrEs = new Connection();
    static Connection FrMu = new Connection();
    static Connection FrBe = new Connection();
    static Connection FrPa = new Connection();
    static Connection BrPa = new Connection();
    static Connection PaPa = new Connection();
    static Connection MaPa = new Connection();
    static Connection ZuPa = new Connection();
    static Connection PaBR = new Connection();
    static Connection KoSt = new Connection();
    static Connection BeDa = new Connection();
    static Connection BeWa = new Connection();
    static Connection BeWi = new Connection();
    static Connection ZuMu = new Connection();
    static Connection WiMu = new Connection();
    static Connection VeMu = new Connection();
    static Connection PaMa = new Connection();
    static Connection PaBa = new Connection();
    static Connection PaMA = new Connection();
    static Connection MaBa = new Connection();
    static Connection MaZu = new Connection();
    static Connection MaRo = new Connection();
    static Connection VeZu = new Connection();
    static Connection PeSt = new Connection();
    static Connection RiDa = new Connection();
    static Connection WaDa = new Connection();
    static Connection WaWi = new Connection();
    static Connection WaKy = new Connection();
    static Connection WaWI = new Connection();
    static Connection BuWi = new Connection();
    static Connection ZaWi = new Connection();
    static Connection VeRo = new Connection();
    static Connection VeZa = new Connection();
    static Connection MaLi = new Connection();
    static Connection MaCa = new Connection();
    static Connection LiCa = new Connection();
    static Connection MaBA = new Connection();
    static Connection BrRo = new Connection();
    static Connection PaRo = new Connection();
    static Connection PeRi = new Connection();
    static Connection PeWi = new Connection();
    static Connection PeMo = new Connection();
    static Connection RiWi = new Connection();
    static Connection WiKy = new Connection();
    static Connection WiSm = new Connection();
    static Connection BuKy = new Connection();
    static Connection BUKy = new Connection();
    static Connection SmKy = new Connection();
    static Connection KhKy = new Connection();
    static Connection BuZa = new Connection();
    static Connection BuSa = new Connection();
    static Connection BuBu = new Connection();
    static Connection ZaSa = new Connection();
    static Connection PABr = new Connection();
    static Connection PaSm = new Connection();
    static Connection BrAt = new Connection();
    static Connection SmMo = new Connection();
    static Connection KhMo = new Connection();
    static Connection KhRo = new Connection();
    static Connection BuSo = new Connection();
    static Connection BuCo = new Connection();
    static Connection BuSe = new Connection();
    static Connection AtSa = new Connection();
    static Connection SoSa = new Connection();
    static Connection CoSm = new Connection();
    static Connection AnSm = new Connection();
    static Connection AtSm = new Connection();
    static Connection SeRo = new Connection();
    static Connection SoRo = new Connection();
    static Connection AtSo = new Connection();
    static Connection SoCo = new Connection();
    static Connection SeCo = new Connection();
    static Connection AnCo = new Connection();
    static Connection SeSo = new Connection();
    static Connection SeEr = new Connection();
    static Connection SoEr = new Connection();
    static Connection AnEr = new Connection();






    static City findCityByName(String cityName) {
        for (City city : Board.cities) {
            if (city.getName().equalsIgnoreCase(cityName)) {
                return city;
            }
        }
        return null;
    }

    public static void fillBoard(){

        cities.add(Edinburgh);
        cities.add(London);
        cities.add(Amsterdam);
        cities.add(Dieppe);
        cities.add(Bruxelles);
        cities.add(Essen);
        cities.add(Frankfurt);
        cities.add(Paris);
        cities.add(Brest);
        cities.add(Kobenhavn);
        cities.add(Berlin);
        cities.add(Munchen);
        cities.add(Pamplona);
        cities.add(Marseille);
        cities.add(Zurich);
        cities.add(Stockholm);
        cities.add(Danzig);
        cities.add(Warszawa);
        cities.add(Wien);
        cities.add(Venezia);
        cities.add(Madrid);
        cities.add(Barcelona);
        cities.add(Rome);
        cities.add(Petrograd);
        cities.add(Riga);
        cities.add(Wilno);
        cities.add(Kyiv);
        cities.add(Budapest);
        cities.add(Zagrab);
        cities.add(Lisboa);
        cities.add(Cadiz);
        cities.add(Palermo);
        cities.add(Brindisi);
        cities.add(Moskva);
        cities.add(Smolensk);
        cities.add(Kharkov);
        cities.add(Bucuresti);
        cities.add(Sarajevo);
        cities.add(Smyrna);
        cities.add(Athina);
        cities.add(Rostov);
        cities.add(Sofia);
        cities.add(Constantinople);
        cities.add(Sevastopol);
        cities.add(Ancora);
        cities.add(Sochi);
        cities.add(Erzurum);

        EdLo.cityA = Edinburgh;
        EdLo.cityB = London;
        EdLo.distance = 4;
        EdLo.colour1 = "black";
        EdLo.colour2 = "orange";
        connections.add(EdLo);


        AmLo.cityA = Amsterdam;
        AmLo.cityB = London;
        AmLo.distance = 2;
        AmLo.ferries = 2;
        connections.add(AmLo);

        DiLo.cityA = Dieppe;
        DiLo.cityB = London;
        DiLo.distance = 2;
        DiLo.ferries = 1;
        connections.add(DiLo);


        AmBr.cityA = Amsterdam;
        AmBr.cityB = Bruxelles;
        AmBr.distance = 1;
        AmBr.colour1 = "black";
        connections.add(AmBr);


        AmEs.cityA = Amsterdam;
        AmEs.cityB = Essen;
        AmEs.distance = 3;
        AmEs.colour1 = "yellow";
        connections.add(AmEs);


        AmFr.cityA = Amsterdam;
        AmFr.cityB = Frankfurt;
        AmFr.distance = 2;
        AmFr.colour1 = "white";
        connections.add(AmFr);


        DiBr.cityA = Dieppe;
        DiBr.cityB = Bruxelles;
        DiBr.distance = 2;
        DiBr.colour1 = "green";
        connections.add(DiBr);


        DiPa.cityA = Dieppe;
        DiPa.cityB = Paris;
        DiPa.distance = 1;
        DiPa.colour1 = "pink";
        connections.add(DiPa);


        DiBt.cityA = Dieppe;
        DiBt.cityB = Brest;
        DiBt.distance = 2;
        DiBt.colour1 = "orange";
        connections.add(DiBt);

        FrBr.cityA = Frankfurt;
        FrBr.cityB = Bruxelles;
        FrBr.distance = 2;
        FrBr.colour1 = "blue";
        connections.add(FrBr);

        PaBr.cityA = Paris;
        PaBr.cityB = Bruxelles;
        PaBr.distance = 2;
        PaBr.colour1 = "yellow";
        PaBr.colour2 = "red";
        connections.add(PaBr);

        KoEs.cityA = Kobenhavn;
        KoEs.cityB = Essen;
        KoEs.distance = 3;
        KoEs.ferries = 1;
        connections.add(KoEs);

        BeEs.cityA = Berlin;
        BeEs.cityB = Essen;
        BeEs.distance = 2;
        BeEs.colour1 = "blue";
        connections.add(BeEs);

        FrEs.cityA = Frankfurt;
        FrEs.cityB = Essen;
        FrEs.distance = 2;
        FrEs.colour1 = "green";
        connections.add(FrEs);

        FrMu.cityA = Frankfurt;
        FrMu.cityB = Munchen;
        FrMu.distance = 2;
        FrMu.colour1 = "pink";
        connections.add(FrMu);

        FrBe.cityA = Frankfurt;
        FrBe.cityB = Berlin;
        FrBe.distance = 3;
        FrBe.colour1 = "black";
        FrBe.colour2 = "red";
        connections.add(FrBe);

        FrPa.cityA = Frankfurt;
        FrPa.cityB = Paris;
        FrPa.distance = 3;
        FrPa.colour1 = "white";
        FrPa.colour2 = "orange";
        connections.add(FrPa);

        BrPa.cityA = Brest;
        BrPa.cityB = Paris;
        BrPa.distance = 3;
        BrPa.colour1 = "black";
        connections.add(BrPa);

        PaPa.cityA = Pamplona;
        PaPa.cityB = Paris;
        PaPa.distance = 4;
        PaPa.colour1 = "blue";
        PaPa.colour2 = "green";
        connections.add(PaPa);

        MaPa.cityA = Marseille;
        MaPa.cityB = Paris;
        MaPa.distance = 4;
        connections.add(MaPa);

        ZuPa.cityA = Zurich;
        ZuPa.cityB = Paris;
        ZuPa.distance = 3;
        connections.add(ZuPa);

        PaBR.cityA = Pamplona;
        PaBR.cityB = Brest;
        PaBR.distance = 4;
        PaBR.colour1 = "pink";
        connections.add(PaBR);

        KoSt.cityA = Kobenhavn;
        KoSt.cityB = Stockholm;
        KoSt.distance = 3;
        KoSt.colour1 = "yellow";
        KoSt.colour2 = "white";
        connections.add(KoEs);

        BeDa.cityA = Berlin;
        BeDa.cityB = Danzig;
        BeDa.distance = 4;
        connections.add(BeDa);

        BeWa.cityA = Berlin;
        BeWa.cityB = Warszawa;
        BeWa.distance = 4;
        BeWa.colour1 = "pink";
        BeWa.colour2 = "yellow";
        connections.add(BeWa);

        BeWi.cityA = Berlin;
        BeWi.cityB = Wien;
        BeWi.distance = 3;
        BeWi.colour1 = "green";
        connections.add(BeWi);

        ZuMu.cityA = Zurich;
        ZuMu.cityB = Munchen;
        ZuMu.distance = 2;
        ZuMu.colour1 = "yellow";
        connections.add(ZuMu);

        WiMu.cityA = Wien;
        WiMu.cityB = Munchen;
        WiMu.distance = 3;
        WiMu.colour1 = "orange";
        connections.add(WiMu);

        VeMu.cityA = Venezia;
        VeMu.cityB = Munchen;
        VeMu.distance = 2;
        VeMu.colour1 = "blue";
        connections.add(VeMu);

        PaMa.cityA = Pamplona;
        PaMa.cityB = Madrid;
        PaMa.distance = 3;
        PaMa.colour1 = "black";
        PaMa.colour2 = "white";
        connections.add(PaMa);

        PaBa.cityA = Pamplona;
        PaBa.cityB = Barcelona;
        PaBa.distance = 2;
        connections.add(PaBa);

        PaMA.cityA = Pamplona;
        PaMA.cityB = Marseille;
        PaMA.distance = 4;
        PaMA.colour1 = "red";
        connections.add(PaMA);

        MaBa.cityA = Marseille;
        MaBa.cityB = Barcelona;
        MaBa.distance = 4;
        connections.add(MaBa);

        MaRo.cityA = Marseille;
        MaRo.cityB = Rome;
        MaRo.distance = 4;
        connections.add(MaRo);

        MaZu.cityA = Marseille;
        MaZu.cityB = Zurich;
        MaZu.colour1 = "pink";
        MaZu.distance = 2;
        connections.add(MaZu);

        VeZu.cityA = Venezia;
        VeZu.cityB = Zurich;
        VeZu.distance = 2;
        VeZu.colour1 = "green";
        connections.add(VeMu);

        PeSt.cityA = Petrograd;
        PeSt.cityB = Stockholm;
        PeSt.distance = 8;
        connections.add(PeSt);

        RiDa.cityA = Riga;
        RiDa.cityB = Danzig;
        RiDa.colour1 = "black";
        RiDa.distance = 3;
        connections.add(RiDa);

        WaDa.cityA = Warszawa;
        WaDa.cityB = Danzig;
        WaDa.distance = 2;
        connections.add(WaDa);

        WaWi.cityA = Warszawa;
        WaWi.cityB = Wilno;
        WaWi.colour1 = "red";
        WaWi.distance = 3;
        connections.add(WaWi);

        WaKy.cityA = Warszawa;
        WaKy.cityB = Kyiv;
        WaKy.distance = 4;
        connections.add(WaKy);

        WaWI.cityA = Warszawa;
        WaWI.cityB = Wien;
        WaWI.colour1 = "blue";
        WaWI.distance = 4;
        connections.add(WaWI);

        BuWi.cityA = Budapest;
        BuWi.cityB = Wien;
        BuWi.distance = 1;
        BuWi.colour1 = "red";
        BuWi.colour2 = "white";
        connections.add(BuWi);

        ZaWi.cityA = Zagrab;
        ZaWi.cityB = Wien;
        ZaWi.distance = 2;
        connections.add(ZaWi);

        VeRo.cityA = Venezia;
        VeRo.cityB = Rome;
        VeRo.distance = 2;
        VeRo.colour1 = "black";
        connections.add(VeRo);

        VeZa.cityA = Venezia;
        VeZa.cityB = Zagrab;
        VeZa.distance = 2;
        connections.add(VeZa);

        MaLi.cityA = Madrid;
        MaLi.cityB = Lisboa;
        MaLi.colour1 = "pink";
        MaLi.distance = 3;
        connections.add(MaLi);

        MaCa.cityA = Madrid;
        MaCa.cityB = Cadiz;
        MaCa.colour1 = "orange";
        MaCa.distance = 3;
        connections.add(MaCa);

        LiCa.cityA = Lisboa;
        LiCa.cityB = Cadiz;
        LiCa.colour1 = "blue";
        LiCa.distance = 2;
        connections.add(LiCa);

        MaBA.cityA = Madrid;
        MaBA.cityB = Barcelona;
        MaBA.colour1 = "yellow";
        MaBA.distance = 2;
        connections.add(MaBA);

        PaRo.cityA = Palermo;
        PaRo.cityB = Rome;
        PaRo.ferries = 1;
        PaRo.distance = 4;
        connections.add(PaRo);

        BrRo.cityA = Brindisi;
        BrRo.cityB = Rome;
        BrRo.colour1 = "white";
        BrRo.distance = 2;
        connections.add(BrRo);

        PeRi.cityA = Petrograd;
        PeRi.cityB = Riga;
        PeRi.distance = 4;
        connections.add(PeRi);

        PeWi.cityA = Petrograd;
        PeWi.cityB = Wilno;
        PeWi.colour1 = "blue";
        PeWi.distance = 4;
        connections.add(PeWi);

        PeMo.cityA = Petrograd;
        PeMo.cityB = Moskva;
        PeMo.colour1 = "white";
        PeMo.distance = 4;
        connections.add(PeMo);

        RiWi.cityA = Riga;
        RiWi.cityB = Wilno;
        RiWi.colour1 = "green";
        RiWi.distance = 4;
        connections.add(RiWi);

        WiKy.cityA = Kyiv;
        WiKy.cityB = Wilno;
        WiKy.distance = 2;
        connections.add(WiKy);

        WiSm.cityA = Smolensk;
        WiSm.cityB = Wilno;
        WiSm.colour1 = "yellow";
        WiSm.distance = 3;
        connections.add(WiSm);

        BuKy.cityA = Kyiv;
        BuKy.cityB = Budapest;
        BuKy.distance = 6;
        connections.add(BuKy);

        BUKy.cityA = Kyiv;
        BUKy.cityB = Bucuresti;
        BUKy.distance = 4;
        connections.add(BUKy);

        KhKy.cityA = Kyiv;
        KhKy.cityB = Kharkov;
        KhKy.distance = 4;
        connections.add(KhKy);

        SmKy.cityA = Kyiv;
        SmKy.cityB = Smolensk;
        SmKy.colour1 = "red";
        SmKy.distance = 3;
        connections.add(SmKy);

        BuZa.cityA = Budapest;
        BuZa.cityB = Zagrab;
        BuZa.distance = 2;
        BuZa.colour1 = "orange";
        connections.add(BuZa);

        BuSa.cityA = Budapest;
        BuSa.cityB = Sarajevo;
        BuSa.distance = 3;
        BuSa.colour1 = "pink";
        connections.add(BuSa);

        BuBu.cityA = Budapest;
        BuBu.cityB = Bucuresti;
        BuBu.distance = 4;
        connections.add(BuBu);

        ZaSa.cityA = Zagrab;
        ZaSa.cityB = Sarajevo;
        ZaSa.colour1 = "red";
        ZaSa.distance = 3;
        connections.add(ZaSa);

        PABr.cityA = Palermo;
        PABr.cityB = Brindisi;
        PABr.ferries = 1;
        PABr.distance = 3;
        connections.add(PABr);

        PaSm.cityA = Palermo;
        PaSm.cityB = Smyrna;
        PaSm.ferries = 2;
        PaSm.distance = 6;
        connections.add(PaSm);

        BrAt.cityA = Brindisi;
        BrAt.cityB = Athina;
        BrAt.ferries = 1;
        BrAt.distance = 4;
        connections.add(BrAt);

        SmMo.cityA = Smolensk;
        SmMo.cityB = Moskva;
        SmMo.colour1 = "orange";
        SmMo.distance = 2;
        connections.add(SmMo);

        KhMo.cityA = Kharkov;
        KhMo.cityB = Moskva;
        KhMo.distance = 4;
        connections.add(KhMo);

        KhRo.cityA = Kharkov;
        KhRo.cityB = Rostov;
        KhRo.colour1 = "green";
        KhRo.distance = 2;
        connections.add(KhRo);

        BuSo.cityA = Sofia;
        BuSo.cityB = Bucuresti;
        BuSo.distance = 2;
        connections.add(BuSo);

        BuCo.cityA = Constantinople;
        BuCo.cityB = Bucuresti;
        BuCo.colour1 = "blue";
        BuCo.distance = 3;
        connections.add(BuCo);

        BuSe.cityA = Sevastopol;
        BuSe.cityB = Bucuresti;
        BuSe.colour1 = "white";
        BuSe.distance = 4;
        connections.add(BuSe);

        AtSa.cityA = Athina;
        AtSa.cityB = Sarajevo;
        AtSa.distance = 4;
        AtSa.colour1 = "green";
        connections.add(AtSa);

        SoSa.cityA = Sofia;
        SoSa.cityB = Sarajevo;
        SoSa.distance = 2;
        connections.add(SoSa);

        AtSm.cityA = Smyrna;
        AtSm.cityB = Athina;
        AtSm.ferries = 1;
        AtSm.distance = 2;
        connections.add(AtSm);

        CoSm.cityA = Constantinople;
        CoSm.cityB = Smyrna;
        CoSm.ferries = 2;
        connections.add(CoSm);

        AnSm.cityA = Smyrna;
        AnSm.cityB = Ancora;
        AnSm.colour1 = "orange";
        AnSm.distance = 3;
        connections.add(AnSm);

        SeRo.cityA = Rostov;
        SeRo.cityB = Sevastopol;
        SeRo.distance = 4;
        connections.add(SoRo);

        SoRo.cityA = Rostov;
        SoRo.cityB = Sochi;
        SoRo.distance = 2;
        connections.add(SoRo);

        AtSo.cityA = Athina;
        AtSo.cityB = Sofia;
        AtSo.distance = 3;
        AtSo.colour1 = "pink";
        connections.add(AtSo);

        SoCo.cityA = Sofia;
        SoCo.cityB = Constantinople;
        SoCo.distance = 3;
        SoCo.colour1 = "blue";
        connections.add(SoCo);

        SeCo.cityA = Sevastopol;
        SeCo.cityB = Constantinople;
        SeCo.distance = 4;
        SeCo.ferries = 2;
        connections.add(SeCo);

        AnCo.cityA = Ancora;
        AnCo.cityB = Constantinople;
        AnCo.distance = 2;
        connections.add(AnCo);

        SeSo.cityA = Sevastopol;
        SeSo.cityB = Sochi;
        SeSo.distance = 2;
        SeSo.ferries = 1;
        connections.add(SeSo);

        SeEr.cityA = Sevastopol;
        SeEr.cityB = Erzurum;
        SeEr.distance = 4;
        SeEr.ferries = 2;
        connections.add(SeEr);

        SoEr.cityA = Sochi;
        SoEr.cityB = Erzurum;
        SoEr.distance = 3;
        SoEr.colour1 = "red";
        connections.add(SoEr);

        AnEr.cityA = Ancora;
        AnEr.cityB = Erzurum;
        AnEr.distance = 3;
        AnEr.colour1 = "black";
        connections.add(AnEr);


        for (Connection connection : connections) {
            connection.cityA.connections.add(connection);
            connection.cityB.connections.add(connection);
        }


    }
    public static ArrayList<Connection> shortestPath(City startCity, City endCity) {


        // Map to keep track of the shortest distances from startCity to each city
        Map<City, Integer> shortestDistances = new HashMap<>();
        // Map to keep track of the previous city on the shortest path to each city
        Map<City, City> previousCities = new HashMap<>();
        // Priority queue to process cities with the shortest distance first
        PriorityQueue<City> pq = new PriorityQueue<>(Comparator.comparingInt(shortestDistances::get));

        // Initialize shortest distances to infinity and add startCity to priority queue
        for (City city : cities) {
            shortestDistances.put(city, Integer.MAX_VALUE);
            previousCities.put(city, null);
        }
        shortestDistances.put(startCity, 0);
        pq.offer(startCity);

        while (!pq.isEmpty()) {
            City currentCity = pq.poll();

            if (currentCity.equals(endCity)) {
                // Reached the end city, reconstruct the shortest path
                return reconstructPath(previousCities, endCity);
            }

            // Visit neighbors of currentCity
            for (Connection connection : currentCity.connections) {
                City neighbor = connection.getOtherCity(currentCity);
                int distanceToNeighbor = shortestDistances.get(currentCity);
                if (connection.taken == 2) {
                    distanceToNeighbor += connection.distance;
                }

                if (distanceToNeighbor < shortestDistances.get(neighbor)) {
                    shortestDistances.put(neighbor, distanceToNeighbor);
                    previousCities.put(neighbor, currentCity);
                    pq.offer(neighbor);
                }
            }
        }
        return null;
    }

    // Helper method to reconstruct the shortest path from startCity to endCity
    private static ArrayList<Connection> reconstructPath(Map<City, City> previousCities, City endCity) {
        ArrayList<Connection> path = new ArrayList<>();
        City currentCity = endCity;
        while (previousCities.get(currentCity) != null) {
            City previousCity = previousCities.get(currentCity);
            for (Connection connection : currentCity.connections) {
                if (connection.hasCity(previousCity)) {
                    path.add(connection);
                    break;
                }
            }
            currentCity = previousCity;
        }
        Collections.reverse(path);
        return path;
    }



}


