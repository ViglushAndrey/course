package edu.adr.course.controller.ui;

import edu.adr.course.model.Officers;
import edu.adr.course.service.officer.impls.OffiserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * course.StudentUIControler
 *
 * @Autor: Andrey
 * @DateTime: 06.03.2021|17:15
 * @Version: StudentUIControler: 1.0
 */
@RequestMapping(value = "/ui/Officers")
@Controller
public class OfficersUIControler {

    @Autowired
    OffiserServiceImpl service;

    @RequestMapping(value = "/get/all")
    public String showAll(Model model){

        List<Officers> officers = service.getAll();
        model.addAttribute("officers", officers);
          //  model.addAttribute("items", service.getAll());
        return "officer/officers-page";

    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(Model model, @PathVariable String id){
        service.delete(id);
        return "redirect:/ui/Officers/get/all";

    }


}
    