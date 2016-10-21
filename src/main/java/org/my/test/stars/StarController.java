package org.my.test.stars;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarController {

    CommandExecution commandExecution=new CommandExecution();

    @RequestMapping("/")

    public String testClass(
            @RequestParam(value="command", defaultValue = "n/a") String command,
            @RequestParam(value="star", defaultValue = "n/a") String star,
            @RequestParam(value="planet", defaultValue = "n/a") String planet,
            @RequestParam(value="moon", defaultValue = "n/a") String moon){

        if (command.equals("AddStar")){
            return commandExecution.restExecuteAddStar(star);
        }

        if (command.equals("AddPlanet")){
            return commandExecution.restExecuteAddPlanet(star, planet);
        }

        if (command.equals("AddMoon")){
            return commandExecution.restExecuteAddMoon(star, planet, moon);
        }

        if (command.equals("PrintStars")) {
            return commandExecution.restExecutePrintStars();
        }

        if (command.equals("PrintPlanets")){
            return commandExecution.restExecutePrintPlanets();
        }

        if (command.equals("PrintMoons")){
            return commandExecution.restExecutePrintMoons(planet);
        }

        if (command.equals("PrintAll")){
            return commandExecution.restExecutePrintAll();
        }

        return "error! incorrect command!";
    }
}
