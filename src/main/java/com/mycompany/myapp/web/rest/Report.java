package com.mycompany.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Report {
    private Logger logger = LoggerFactory.getLogger(Report.class);

    @GetMapping("/report")
    public String index(Model model) {
        model.addAttribute("name", "jimureport");
        model.addAttribute("base", "");
        model.addAttribute("customPrePath", "");

        return "jmreport/desreport/list";
    }
}
