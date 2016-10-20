package org.my.test.stars;

class Print {

    String printStars(StarSystem starSystem){
        String text="";

        for (Star stars:starSystem.starsList){
            text+=(stars + " ");
        }
        return "Stars: "+text+"\n";
    }

    String printPlanets(StarSystem starSystem){
        String text="";

        for (Star stars:starSystem.starsList){
            for (Planet planets:stars.planetsList) {
                text += (planets + " ");
            }
        }
        return "Planets: "+text+"\n";
    }

    String printMoons (StarSystem starSystem, String name){
        String text="";

        if (name.equals("n/a")){
            for (Star stars:starSystem.starsList) {
                for (Planet planets : stars.planetsList) {
                    text+="Planet " + planets.planetName + " has ";

                        if (planets.moonsList.size()>0){
                            for (Moon moons : planets.moonsList) {
                                text+=(moons + " ");
                            }
                            text+="<br>";
                        }
                        else text+="no moons<br>";
                    }
                return text;
                }
            }

        for (Star stars:starSystem.starsList) {
            for (Planet planets : stars.planetsList) {
                if (planets.planetName.equals(name)) {
                    text="Planet " + name + " has ";

                    if (planets.moonsList.size()>0){
                        for (Moon moons : planets.moonsList) {
                            text+=(moons + " ");
                        }
                        return text;
                    }
                    return text+"no moons";
                }
            }
        }
        return "Planet "+name+" not found!";
    }

    String printAll(StarSystem starSystem){
        String text="Star system name: "+starSystem.starSystemName+"<br>";

        text+=printStars(starSystem)+"<br>";
        text+=printPlanets(starSystem)+"<br>";
        text+=printMoons(starSystem,"n/a");

        return text;
    }

}
