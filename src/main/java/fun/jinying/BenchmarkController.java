package fun.jinying;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BenchmarkController {
    @GetMapping("/ping")
    public String ping() {
        return "message : pong";
    }
}
