package com.tay.dockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/docker/demo")
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @GetMapping
    public List<DemoEntity> findAll() {
        return demoRepository.findAll();
    }

    @PostMapping
    public DemoEntity save(@RequestBody DemoEntity demoEntity) {
        return demoRepository.save(demoEntity);
    }

    @GetMapping("/{id}")
    public DemoEntity findOne(@PathVariable Integer id) {
        return demoRepository.findById(id).orElseThrow();
    }

}
