package fi.solita.java10demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public Map getGreeting() {
        var now = Instant.now();
        return Map.of("message", String.format("It's %s", now));
    }
}
