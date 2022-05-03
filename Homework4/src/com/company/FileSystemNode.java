package com.company;

public interface FileSystemNode {

    public FileSystemNode getParent();

    public String getName();

    public void getPath();

    public void setParent(FileSystemNode parent);

    void getExtension();
}
