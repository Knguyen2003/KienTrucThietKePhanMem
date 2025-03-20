package com.iuh;

import java.util.ArrayList;
import java.util.List;

public class FolderComposite implements BaseComponent {
    private List<BaseComponent> files = new ArrayList<BaseComponent>();


    public void add(BaseComponent f){
        this.files.add(f);
    }

    @Override
    public void showProperty() {
        for (BaseComponent file : files) {
            file.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (BaseComponent file : files) {
            total += file.totalSize();
        }
        return total;
    }
}
