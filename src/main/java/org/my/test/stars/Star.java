package org.my.test.stars;

import java.util.ArrayList;
import java.util.List;

class Star {

    List<Planet> planetsList=new ArrayList<>();
    String starName;

    Star(String starName){
        this.starName=starName;
    }

    Planet getPlanet(String planetName) {
        for (Planet planets: planetsList) {
            if (planets.planetName.equals(planetName)) {
                return planets;
            }
        }
        return null;
    }

    String addPlanet(String planetName){
        if (checkEqualNames(planetName)) {
            return "Planet "+planetName+" already exist!";
        }

        Planet planet=new Planet(planetName);
        planetsList.add(planet);
        return "Planet "+planetName+ " successfully added";
    }

    boolean checkEqualNames(String name){
        for (Planet planet:planetsList){
            if(planet.planetName.equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){

        return starName;
    }
}