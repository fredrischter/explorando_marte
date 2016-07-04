package br.com.elo7;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CenaController {

    private static final String template = "Cena %s criada!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/cena")
    public Cena greeting(@RequestParam(value="content", defaultValue="5 5\n1 2 N\nLMLMLMLMM\n3 3 E\nMMRMMRMRRM") String content) {
        return new Cena(counter.incrementAndGet(),
                            String.format(template, content));
    }
}
