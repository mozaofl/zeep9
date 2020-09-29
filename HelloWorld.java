package br.edu.usj.ads.lgii.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    @GetMapping(value="helloView")
    public String getHelloView() {
        return "helloView";
    }
    
    
}
