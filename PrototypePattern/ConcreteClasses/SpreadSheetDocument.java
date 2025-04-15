package PrototypePattern.ConcreteClasses;

import PrototypePattern.Interface.DocumentInterface;

public class SpreadSheetDocument implements DocumentInterface {
    private String spreadSheetName;
    private int row;
    private int columnCount;

    public SpreadSheetDocument(String name, int row, int columnCount) {
        this.spreadSheetName = name;
        this.row = row;
        this.columnCount = columnCount;
        System.out.println("Spreadsheet prototype created.");
    }

    public void setSpreadSheetName(String name) {
        this.spreadSheetName = name;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public String getSpreadSheetName() {
        return spreadSheetName;
    }
    public int getRow() {
        return row;
    }
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public SpreadSheetDocument clone() {
        try {
            return (SpreadSheetDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Spreadsheet cloning failed.");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet: " + spreadSheetName + " (" + row + " rows, " + columnCount + " columns)");
    }

    @Override
    public String getType() {
        return "Spreadsheet Document | Name: " + spreadSheetName + " | Rows: " + row + " | Columns: " + columnCount;
    }
}
