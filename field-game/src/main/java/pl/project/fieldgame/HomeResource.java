package pl.project.fieldgame;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

        @GetMapping("/")
        public String home() {
            return ("<h1>Welcome</h1>");
        }

        @GetMapping("/secured")
        public String user() {
            return ("<h1>Welcome secured</h1>");
        }

}

