package PrototypePattern.Context;

import PrototypePattern.ConcreteClasses.PDFDocument;
import PrototypePattern.ConcreteClasses.TextDocument;
import PrototypePattern.ConcreteClasses.SpreadSheetDocument;

public class DocumentMaker {
    private PDFDocument pdfPrototype = new PDFDocument("Untitled", "N/A", 0);
    private TextDocument textPrototype = new TextDocument("Untitled", "UTF-8", 0);
    private SpreadSheetDocument sheetPrototype = new SpreadSheetDocument("Sheet1", 0, 0);

    public PDFDocument createPDF(String fileName, String author, int pageCount) {
        PDFDocument doc = pdfPrototype.clone();
        doc.setFileName(fileName);
        doc.setAuthor(author);
        doc.setPageCount(pageCount);
        return doc;
    }

    public TextDocument createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument doc = textPrototype.clone();
        doc.setFilePath(filePath);
        doc.setEncoding(encoding);
        doc.setWordCount(wordCount);
        return doc;
    }

    public SpreadSheetDocument createSpreadSheetDocument(String name, int rows, int columns) {
        SpreadSheetDocument doc = sheetPrototype.clone();
        doc.setSpreadSheetName(name);
        doc.setRow(rows);
        doc.setColumnCount(columns);
        return doc;
    }
}
