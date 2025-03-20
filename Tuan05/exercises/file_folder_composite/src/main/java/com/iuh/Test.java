package com.iuh;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BaseComponent file1 = new FileLeaf("file 1", 10);
        BaseComponent file2 = new FileLeaf("file 2", 5);
        BaseComponent file3 = new FileLeaf("file 3", 12);


        FolderComposite folder1 = new FolderComposite();
        FolderComposite folder2 = new FolderComposite();
        folder1.add(file1);
        folder1.add(file2);
        folder1.add(folder2);
        folder2.add(file3);

        folder1.showProperty();
        System.out.println("Total Size: " + folder1.totalSize());
    }
}
