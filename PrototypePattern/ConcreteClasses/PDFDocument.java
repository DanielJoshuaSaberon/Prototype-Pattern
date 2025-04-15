package PrototypePattern.ConcreteClasses;

import PrototypePattern.Interface.DocumentInterface;

public class PDFDocument implements DocumentInterface {
    private String fileName;
    private String author;
    private int pageCount;

    public PDFDocument(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        System.out.println("PDF prototype created.");
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getFileName() {
        return fileName;
    }
    public String getAuthor() {
        return author;
    }
    public int getPageCount() {
        return pageCount;
    }

    @Override
    public PDFDocument clone() {
        try {
            return (PDFDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("PDF cloning failed.");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening PDF: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public String getType() {
        return "PDF Document | File: " + fileName + " | Author: " + author + " | Pages: " + pageCount;
    }
}
