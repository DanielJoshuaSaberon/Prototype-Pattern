package PrototypePattern;

import PrototypePattern.Context.DocumentMaker;
import PrototypePattern.Interface.DocumentInterface;

public class MyDocumentApp {
    public static void main(String[] args) {
        DocumentMaker registry = new DocumentMaker();

        System.out.println();

        DocumentInterface pdf1 = registry.createPDF("annual_report_2024.pdf", "Acme Corp", 150);
        pdf1.open();
        System.out.println(pdf1.getType() + "\n");

        DocumentInterface textDoc = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        textDoc.open();
        System.out.println(textDoc.getType() + "\n");

        DocumentInterface sheet = registry.createSpreadSheetDocument("sales_data_q1.xlsx", 1000, 20);
        sheet.open();
        System.out.println(sheet.getType() + "\n");

        DocumentInterface pdf2 = registry.createPDF("summary_report.pdf", "Acme Corp", 30);
        pdf2.open();
    }
}
