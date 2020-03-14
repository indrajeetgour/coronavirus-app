package com.gour.controller;

import com.gour.modules.LocationStats;
import com.gour.services.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    @Autowired
    private CoronavirusDataService coronavirusDataService;


    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronavirusDataService.getAllStats();

        int totalCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPreDay()).sum();

        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalCases);
        model.addAttribute("totalNewCases",totalNewCases);

        return "home";
    }

}
