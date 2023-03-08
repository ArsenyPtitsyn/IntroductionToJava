package org.example.seminar2.task0;

import org.example.seminar2.task0.model.Vector;

public class MainClass {

    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 1.0, 1.0);
        Vector vector2 = new Vector(1.0, 2.0, 1.0);
        System.out.println(vector1);
        System.out.println(vector2);
        System.out.println("Длина вектора vector1 равна: " + vector1.lengthVector());
        System.out.println("Длина вектора vector2 равна: " + vector2.lengthVector());
        System.out.println("Скалярное поизведение векторов равно: " + vector1.scalarProduct(vector2));
        System.out.println("Векторное произведение векторов равно: " + vector1.vectorProduct(vector2));
        System.out.println("Косинус угла между векторами равен: " + vector1.cosOfTheAngleBetweenVectors(vector2));
        System.out.println("Сумма векторов равна: " + vector1.vectorSum(vector2));
        System.out.println("Разность векторов равна: " + vector1.vectorDiff(vector2));
    }
}
