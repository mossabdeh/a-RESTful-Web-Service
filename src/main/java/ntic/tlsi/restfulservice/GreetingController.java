package ntic.tlsi.restfulservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
@RestController
public class GreetingController {


    private static final String template = "Wesh,A %s!";

    // to Generate the Id w yb9a y increnmenter
    private final AtomicLong counter = new AtomicLong();

    // ndirou Get psq HTTP reqeust de  type Get
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name",defaultValue = "Zin") String name ){
     return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
