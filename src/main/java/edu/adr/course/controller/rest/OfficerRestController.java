package edu.adr.course.controller.rest;

import edu.adr.course.service.officer.impls.OffiserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import edu.adr.course.model.Officers;
import edu.adr.course.model.OfficersRanks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * course.OfficerRestController
 *
 * @Autor: Andrey
 * @DateTime: 06.03.2021|16:34
 * @Version: OfficerRestController: 1.0
 */
@RestController
@RequestMapping(value = "api/Officers")
public class OfficerRestController {

    @Autowired
    OffiserServiceImpl service;

    @RequestMapping(value = "/get/all")
    public List<Officers> getOfficers() {
        return service.getAll();
    }

    @GetMapping(value = "/get/{id}")
    public Officers getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping(value = "/delete/{id}")
    public Officers deleteById(@PathVariable("id") String id){
        return service.delete(id);
    }

    @PostMapping(value = "/create/")
    public Officers create(@RequestBody Officers officers){
        return service.create(officers);
    }

    @PostMapping(value = "/update/")
    public Officers update(@RequestBody Officers officers){
        return service.update(officers);
    }





}
    