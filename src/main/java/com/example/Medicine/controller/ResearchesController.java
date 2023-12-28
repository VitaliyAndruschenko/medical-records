package com.example.Medicine.controller;

import com.example.Medicine.model.Researches;
import com.example.Medicine.service.PdfExportService;
import com.example.Medicine.service.ResearchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@Controller
public class ResearchesController {
    @Autowired
    ResearchesService researchesService;
    @Autowired
    PdfExportService pdfExportService;
    @ModelAttribute("allResearches")
    public List<Researches> allResearches() {
        return researchesService.getAllResearches();
    }
    @GetMapping("/researches")
    public String getResearchesPage() {
        return "researches";
    }
    @PostMapping("/addResearches")
    public String addResearches(@ModelAttribute Researches researches) {
        researchesService.addResearches(researches);
        return "redirect:/researches";
    }
    @GetMapping("/pdfExport")
    public String pdfExport() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        pdfExportService.exportToPdf(baos);
        return "redirect:/researches";
    }

}
