package io.Covidtracker.CovidCasesTracker.controller;

import io.Covidtracker.CovidCasesTracker.models.LocationStats;
import io.Covidtracker.CovidCasesTracker.service.CovidTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Cotroller {
    @Autowired
    CovidTrackerService covidTrackerService ;
    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = covidTrackerService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat->stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat->stat.getDiffrenceFromPrevDay()).sum();
        model.addAttribute("LocationStats",allStats);
        model.addAttribute("TotalReportedCases",totalReportedCases);
        model.addAttribute("TotalNewCases",totalNewCases);

        return "Home";
    }

}
