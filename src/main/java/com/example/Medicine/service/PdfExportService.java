package com.example.Medicine.service;

import com.example.Medicine.dao.ResearchesDAO;
import com.example.Medicine.model.Researches;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
@Service
public class PdfExportService {
    @Autowired
    ResearchesDAO researchesDAO;

    //Создаем документ PDF
    public void exportToPdf(OutputStream outputStream) throws IOException {
        Document document = new Document();
        try (OutputStream os = new FileOutputStream("export.pdf")){
            PdfWriter.getInstance(document, os);
            document.open();

            List<Researches> researchesList = researchesDAO.getAllResearches();

            Font font = FontFactory.getFont("Helvetica", 12, Font.NORMAL);
            for (Researches researches : researchesList) {
                Paragraph paragraph = new Paragraph();
                paragraph.add(new Chunk(String.valueOf(researches), font));
            }
            document.close();
            os.flush();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }
}
