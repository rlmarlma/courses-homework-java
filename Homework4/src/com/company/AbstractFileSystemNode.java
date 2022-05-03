package com.company;

public abstract class AbstractFileSystemNode implements FileSystemNode {
    String name;
    String extension;
    FileSystemNode parentObject;

    public final FileSystemNode getParent() {
        return parentObject;
    }

    public String getName() {
        return name;
    }

    public final void getPath() {
        if (parentObject == null) {
            System.out.println(":/" + name);
        }else{
            System.out.println(":/" + parentObject.getName() + "/" + name);
        }
    }

    public void setParent(FileSystemNode parent){
        parentObject = parent;
    }

    public void getExtension(){
        System.out.println(extension);
    }

    @Override
    public String toString(){
        return name;
    }

}