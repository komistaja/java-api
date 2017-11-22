package hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    private Integer multi;
    private String response;
    private static final String template = "Hello, %s! ";

    @RequestMapping("/hello")
    public Hello hello(@RequestParam(value="name", defaultValue = "World") String name, @RequestParam(value="number", defaultValue = "1") String number) {

        if (number.length() > 5) {
            this.multi = Integer.parseInt(number.substring(0, 4));
        } else {
            this.multi = Integer.parseInt(number);
        }
        if(this.multi < 1000 && this.multi > 0) {
            this.response = String.format(template, name);
            for (int i = 0; i < multi; i++) {
                response += String.format(template, name);
            }
        } else {
            response = "et osaa";
        }
        return new Hello(multi, response);
    }
}
