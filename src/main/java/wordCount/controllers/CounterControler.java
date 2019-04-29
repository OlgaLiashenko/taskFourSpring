package wordCount.controllers;

import org.springframework.web.bind.annotation.*;
import wordCount.counters.Counter;
import wordCount.counters.CounterFactory;


@RestController
public class CounterControler {
 //   @RequestMapping(value = "/wc", method = RequestMethod.POST)
    @PostMapping("/wc")
    public int count(@RequestBody String input, @RequestParam("mode") String mode) {

        Counter counter = CounterFactory.createCounter(mode);

        counter.readLine(input);

        return counter.getResult();
    }
}




