package com.example.demo.controller;

import com.example.demo.model.ResponseAutoDto;
import com.example.demo.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("auto")
public class AutoController {

    private AutoService service;

    public AutoController(AutoService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseAutoDto finById(@PathVariable(name = "id") String id){
        return service.findById(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseAutoDto save(@RequestBody ResponseAutoDto request){
        return service.save(request);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable(name = "id") String id){
        service.deleteById(id);
    }

    @GetMapping("/status")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Object> status() {
        return Map.of("status", "UP");
    }


}
