package com.company;

import java.util.ArrayList;

public class File extends AbstractFileSystemNode{

    public File(String n, String ex){
        name = n;
        extension = ex;
    }

    public static void getFile(ArrayList<FileSystemNode> list, int i){
        FileSystemNode fileSystemNode = list.get(i);
        fileSystemNode.getExtension();
    }
}
