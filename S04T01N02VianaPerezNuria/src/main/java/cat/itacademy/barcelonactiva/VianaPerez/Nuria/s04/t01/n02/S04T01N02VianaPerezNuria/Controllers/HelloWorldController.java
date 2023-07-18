package cat.itacademy.barcelonactiva.VianaPerez.Nuria.s04.t01.n02.S04T01N02VianaPerezNuria.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("HelloWorld")
    public String saluda(@RequestParam(value="nom", defaultValue = "UNKNOWN") String name) {
        return "Hola, "+name+". Estàs executant un projecte Gradle.";
    }

    @RequestMapping({"HelloWorld2", "HelloWorld2/{name}"})
    public String saluda2(@PathVariable(required = false) String name) {
        return "Hola, "+name+". Estàs executant un projecte Gradle.";
    }

}