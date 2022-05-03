package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file11 = new File("Picture1.jpeg", "jpeg");
        File file12 = new File("Picture2.png", "png");
        File file13 = new File("Picture3.bmp", "bmp");
        File file21 = new File("Text1.txt", "txt");
        File file22 = new File("Text2.fb2", "fb2");
        File file23 = new File("Text3.epub", "epub");
        File file31 = new File("Video1.avi", "avi");
        File file32 = new File("Video2.mp4", "mp4");
        File file33 = new File("Video3.mov", "mov");

        Folder pictures = new Folder("Pictures", file11, file12, file13);
        Folder texts = new Folder("Texts", file21, file22, file23);
        Folder videos = new Folder("Videos", file31, file32, file33);

        Folder root = new Folder("root", pictures, texts , videos);

        root.getPath();
        root.readFolder();

        System.out.println("Select a folder");

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        switch (x) {
            case 1 -> {
                pictures.getPath();
                pictures.readFolder();
                System.out.println("Choose a file to get a file extension:");
                x = in.nextInt() - 1; // -1 = для навигации в меню
                File.getFile(pictures.filesInside, x);
            }
            case 2 -> {
                texts.getPath();
                texts.readFolder();
                System.out.println("Choose a file to get a file extension:");
                x = in.nextInt() - 1;
                File.getFile(texts.filesInside, x);
            }
            case 3 -> {
                videos.getPath();
                videos.readFolder();
                System.out.println("Choose a file to get a file extension:");
                x = in.nextInt() - 1;
                File.getFile(videos.filesInside, x);
            }
        }

    }
}