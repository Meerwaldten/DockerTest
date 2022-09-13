package com.example.docker2;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private Repo repo;

    public HelloWorldController(Repo repo){
        this.repo = repo;
    }


    @GetMapping("/")
    public ResponseEntity<HelloWorld> helloWorld(){
        HelloWorld helloworld = new HelloWorld("Hej med Zando");
        repo.save(helloworld);
        return new ResponseEntity<>(helloworld, HttpStatus.OK);
    }

}
