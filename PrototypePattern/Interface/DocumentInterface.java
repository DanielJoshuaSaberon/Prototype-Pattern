package PrototypePattern.Interface;

public interface DocumentInterface extends Cloneable {
    DocumentInterface clone();
    void open();
    String getType();
}
