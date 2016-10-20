package org.my.test.stars;

import java.util.ArrayList;
import java.util.List;

class StarSystem {

    List<Star> starsList=new ArrayList<>();
    String starSystemName;

    Star getStar(String starName) {
        for (Star stars : starsList) {
            if (stars.starName.equals(starName)) {
                return stars;
            }
        }
        return null;
    }

    StarSystem(String starSystemName){
        this.starSystemName=starSystemName;
    }

    String addStar(String starName){
        if (checkEqualNames(starName)) {
            return "Star "+starName+" already exist!";
        }

        Star star=new Star(starName);
        this.starsList.add(star);
        return ("Star " + starName + " created!");
    }

    boolean checkEqualNames(String name){
        for (Star star:starsList){
            if(star.starName.equals(name)){
                return true;
            }
        }
        return false;
    }
}
