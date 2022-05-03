package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Folder extends AbstractFileSystemNode{

    ArrayList<FileSystemNode> filesInside = new ArrayList<>();

    public Folder(String n, FileSystemNode... inside){
        name = n;
        filesInside.addAll(Arrays.asList(inside));
        for (FileSystemNode fileSystemNode : inside){
            fileSystemNode.setParent(this);
        }
    }

    public void readFolder(){
        for (int i = 0; i < filesInside.size(); i++) {
            System.out.printf("%d)" + filesInside.get(i) + "\n", i+1);
        }
    }
}
