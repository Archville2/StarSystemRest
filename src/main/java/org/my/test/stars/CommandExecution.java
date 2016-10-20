package org.my.test.stars;

class CommandExecution {

    StarSystem starSystem=new StarSystem("SolSystem");
    Print print = new Print();

    String restExecuteAddStar(String name){
        if (name.equals("n/a")){
            return "error! missing parameters!";
        }

        return starSystem.addStar(name);
    }

    String restExecuteAddPlanet(String name, String name2) {
        if (name.equals("n/a")||name2.equals("n/a")){
            return "error! missing parameters!";
        }

        if (starSystem.getStar(name)==null) {
            return "Star " + name + " not found!";
        }

        return starSystem.getStar(name).addPlanet(name2);
    }

    String restExecuteAddMoon(String name, String name2, String name3) {
        if (name.equals("n/a")||name2.equals("n/a")||name3.equals("n/a")){
            return "error! missing parameters!";
        }

        if (starSystem.getStar(name)==null) {
            return "Star " + name + " not found!";
        }
        if (starSystem.getStar(name).getPlanet(name2)==null) {
            return "Planet " + name2 + " not found!";
        }

        return starSystem.getStar(name).getPlanet(name2).addMoon(name3);
    }

    String restExecutePrintStars(){
        return print.printStars(starSystem);
    }

    String restExecutePrintPlanets(){
        return print.printPlanets(starSystem);
    }

    String restExecutePrintMoons(String name){
        return print.printMoons(starSystem, name);
    }

    String restExecutePrintAll(){
        return print.printAll(starSystem);
    }
}
