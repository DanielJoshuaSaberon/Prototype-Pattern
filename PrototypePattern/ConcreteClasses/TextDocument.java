package PrototypePattern.ConcreteClasses;

import PrototypePattern.Interface.DocumentInterface;

public class TextDocument implements DocumentInterface {
    private String filePath;
    private String encoding;
    private int wordCount;

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
        System.out.println("Text prototype created.");
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public String getFilePath() {
        return filePath;
    }
    public String getEncoding() {
        return encoding;
    }
    public int getWordCount() {
        return wordCount;
    }

    @Override
    public TextDocument clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Text cloning failed.");
            return null;
        }
    }

    @Override
    public void open() {
        System.out.println("Opening Text File: " + filePath + " [" + encoding + "] (" + wordCount + " words)");
    }

    @Override
    public String getType() {
        return "Text Document | File: " + filePath + " | Encoding: " + encoding + " | Words: " + wordCount;
    }
}
