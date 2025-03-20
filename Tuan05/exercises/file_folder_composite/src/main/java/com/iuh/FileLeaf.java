package com.iuh;

public class FileLeaf implements BaseComponent{
    private String name;
    private long size;

    public FileLeaf(String name, long size) {
        super();
        this.name = name;
        this.size = size;
    }

    @Override
    public void showProperty() {
        System.out.println("FileLeaf [name=" + name + ", size=" + size + "]");
    }

    @Override
    public long totalSize() {
        return size;
    }
}
