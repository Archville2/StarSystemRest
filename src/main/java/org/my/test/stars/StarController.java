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
            @RequestParam(value="name", defaultValue = "n/a") String name,
            @RequestParam(value="name2", defaultValue = "n/a") String name2,
            @RequestParam(value="name3", defaultValue = "n/a") String name3){

        if (command.equals("AddStar")){
            return commandExecution.restExecuteAddStar(name);
        }

        if (command.equals("AddPlanet")){
            return commandExecution.restExecuteAddPlanet(name, name2);
        }

        if (command.equals("AddMoon")){
            return commandExecution.restExecuteAddMoon(name, name2, name3);
        }

        if (command.equals("PrintStars")) {
            return commandExecution.restExecutePrintStars();
        }

        if (command.equals("PrintPlanets")){
            return commandExecution.restExecutePrintPlanets();
        }

        if (command.equals("PrintMoons")){
            return commandExecution.restExecutePrintMoons(name);
        }

        if (command.equals("PrintAll")){
            return commandExecution.restExecutePrintAll();
        }

        return "error! incorrect command!";
    }
}
