package com.iuh;

import com.iuh.base.Shape;
import com.iuh.composite.Drawing;
import com.iuh.leaf.Circle;
import com.iuh.leaf.Triangle;

public class TestCompositePattern {
    public static void main(String[] args) {
        // Tạo các hình cơ bản
        Shape tamgiac1 = new Triangle();
        Shape tamgiac2 = new Triangle();
        Shape tron1 = new Circle();

        // Tạo bức tranh lớn (Drawing chính)
        Drawing bigDrawing = new Drawing();
        bigDrawing.add(tamgiac1);
        bigDrawing.add(tron1);

        // Tạo một bức tranh nhỏ (Drawing con)
        Drawing smallDrawing = new Drawing();
        smallDrawing.add(tamgiac2);

        // Thêm bức tranh nhỏ vào bức tranh lớn
        bigDrawing.add(smallDrawing);

        // Vẽ toàn bộ bức tranh lớn với màu xanh
        bigDrawing.draw("Green");
    }
}
