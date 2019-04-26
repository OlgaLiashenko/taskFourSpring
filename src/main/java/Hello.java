import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Hello {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Hello.class, args);
    }

}


//@RestController is another convenience annotation that simply adds @ResponseBody to all request mapping methods
// of a controller class. RestController is mostly used in REST API programming when no view technology
// (e.g. JSP, Thymeleaf) is required.

//@GetMapping is a specialized RequestMapping. It specifies that HTTP GET requests to “/hello” are mapped
// to the sayHello() method.


//@SpringBootApplication. This convenience annotation is a wrapper for the following:
//@Configuration – Flags the class as a source of bean definitions for the application context.
//@ComponentScan – Searches for beans and components (e.g., Controllers, Services, Repositories, etc.) in the package hierarchy.
//@EnableAutoCofiguration – Inspects the application context and classpath and automatically configures the
// required beans using opinionated assumptions.