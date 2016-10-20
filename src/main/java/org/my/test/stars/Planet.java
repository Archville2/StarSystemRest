package org.my.test.stars;

import java.util.ArrayList;
import java.util.List;

class Planet {

    List<Moon> moonsList=new ArrayList<>();
    String planetName;

    Planet(String planetName){
        this.planetName=planetName;
    }

    String addMoon(String moonName){
        if (checkEqualNames(moonName)) {
            return "Moon "+moonName+" already exist!";
        }

        Moon moon=new Moon(moonName);
        moonsList.add(moon);
        return "Moon "+moonName+ " successfully added";
    }

    boolean checkEqualNames(String name){
        for (Moon moon:moonsList){
            if(moon.moonName.equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){

        return planetName;
    }

}