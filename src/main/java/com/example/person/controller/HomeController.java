package com.example.person.controller;

import com.example.person.dto.PersonGeneralInformationDto;
import com.example.person.service.PersonGeneralInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PersonGeneralInformationService personGeneralInformationService;

    @RequestMapping(value="/home")
    public  String view(Model model){
        model.addAttribute("person", personGeneralInformationService.getPersonListExceptNotUS());
        return "index";
    }

    @RequestMapping(value="/qualification")
    public  String qualification(Model model){
        model.addAttribute("person", personGeneralInformationService.sortBasedOnQualification());
        return "qualification";
    }

    @GetMapping("/qualification/{qualification}")
    public String qualificaion(@PathVariable("qualification") String qualification, Model model) {
        List<PersonGeneralInformationDto> personGeneralInformationDto = personGeneralInformationService.sortBasedOnQualification();
        model.addAttribute("person", personGeneralInformationDto);
        return "qualification";
    }


    @PostMapping("/scanlist")
    public String getScanList(RedirectAttributes redirectAttributes,
                               String scannedBy, Model model) {
        System.out.println("Scannedby: "+scannedBy);

        model.addAttribute("person",personGeneralInformationService.getPersonBasedOnScannedBy(scannedBy));
        System.out.println(personGeneralInformationService.getPersonBasedOnScannedBy(scannedBy));
            return "scannedList";

    }
    @RequestMapping(value="/scan")
    public  String scan(Model model){
        model.addAttribute("scannedBy", personGeneralInformationService.getScannedByList());
        System.out.println(personGeneralInformationService.getScannedByList());
        return "scan";
    }

}
