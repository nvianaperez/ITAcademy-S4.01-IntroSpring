package cat.itacademy.barcelonactiva.VianaPerez.Nuria.s04.t01.n01.S04T01N01VianaPerezNuria.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //    @RequestParam is encoded --> extract value form query string
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value="nom", defaultValue = "UNKNOWN") String name) {
        return "Hola, "+name+". Estàs executant un projecte Maven.";
    }
    //    @PathVariable is exact value --> extract value form the URI path
    @GetMapping({"HelloWorld2","HelloWorld2/{name}"})
    public String saluda2 (@PathVariable(required = false) String name) {
        return "Hola, "+name+". Estàs executant un projecte Maven.";

    }
}
