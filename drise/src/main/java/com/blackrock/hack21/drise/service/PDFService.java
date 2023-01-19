package com.blackrock.hack21.drise.service;

import com.blackrock.hack21.drise.dao.DiversityScore;
import com.blackrock.hack21.drise.dao.PdfViewer;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.text.MessageFormat;
import java.util.Map;
import java.util.stream.Stream;

@Service
public class PDFService {

    public ByteArrayInputStream createPDF(PdfViewer diversityScore,
                                          Integer teamSize) {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, out);

            document.open();

            Paragraph para3 = new Paragraph("Diversity Report");
            para3.setAlignment(Element.ALIGN_CENTER);

            document.add(para3);

            Paragraph team = new Paragraph(MessageFormat.format("Team Size: {0}", teamSize));
            team.setAlignment(Element.ALIGN_LEFT);

            Paragraph para = new Paragraph(MessageFormat.format("Name: {0}", diversityScore.name()));
            para.setAlignment(Element.ALIGN_LEFT);

            Paragraph para1 = new Paragraph(MessageFormat.format("Team: {0}", diversityScore.team()));
            para1.setAlignment(Element.ALIGN_LEFT);

            Paragraph para2 = new Paragraph(MessageFormat.format("Operation Performed: {0}", diversityScore.operation()));
            para2.setAlignment(Element.ALIGN_LEFT);

            document.add(para);
            document.add(para1);
            document.add(team);
            document.add(para2);
            Paragraph paragraph = new Paragraph();
            addEmptyLine(paragraph, 2);
            document.add(paragraph);

            PdfPTable ageTable = new PdfPTable(2);
            addTableHeader(ageTable, "ageDivision");
            addRows(ageTable, diversityScore.ageGroupDivision());

            PdfPTable jobTitleTable = new PdfPTable(2);
            addTableHeader(jobTitleTable, "jobTitleDivision");
            addRows(jobTitleTable, diversityScore.jobTitleDivision());

            PdfPTable experienceTable = new PdfPTable(2);
            addTableHeader(experienceTable, "experienceDivision");
            addRows(experienceTable, diversityScore.experienceDivision());

            PdfPTable table = new PdfPTable(2);
            addTableHeader(table, "genderDivision");
            addRows(table, diversityScore.genderDivision());

            document.add(table);
            document.add(experienceTable);
            document.add(ageTable);
            document.add(jobTitleTable);

            document.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return new ByteArrayInputStream(out.toByteArray());
    }

    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

    private void addTableHeader(PdfPTable table, String text) {
        Stream.of("category", text)
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));
                    table.addCell(header);
                });
    }

    private void addRows(PdfPTable table, Map<String, Integer> diversityScore) {
        diversityScore.forEach((request, row) -> {
            table.addCell(request);
            table.addCell(String.valueOf(row));
        });
    }
}
