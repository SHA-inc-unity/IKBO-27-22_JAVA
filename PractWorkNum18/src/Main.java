import java.io.Serializable;

interface Animal {
    // some methods
}

class MyClass<T extends Comparable, V extends Serializable & Animal, K> {
    private T t;
    private V v;
    private K k;

    public MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Class of T: " + t.getClass().getName());
        System.out.println("Class of V: " + v.getClass().getName());
        System.out.println("Class of K: " + k.getClass().getName());
    }
}

class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}

class Calculator {
    public static <T, U> double sum(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 + n2;
    }

    public static <T, U> double multiply(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 * n2;
    }

    public static <T, U> double divide(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 / n2;
    }

    public static <T, U> double subtraction(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 - n2;
    }
}

class Matrix<T> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public T getElement(int row, int col) {
        return matrix[row][col];
    }

    public void setElement(int row, int col, T value) {
        matrix[row][col] = value;
    }

    public void printMatrix() {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Тест MyClass
        MyClass<Integer, Cat, String> myClass = new MyClass<>(10, new Cat(), "тестовая строка");
        myClass.printClassNames();
        System.out.println("Значение T: " + myClass.getT());
        System.out.println("Экземпляр класса V: " + myClass.getV());
        System.out.println("Ключ K: " + myClass.getK());

        // Тест MinMax
        Integer[] integers = {15, 20, 9, 30, 5};
        MinMax<Integer> minMax = new MinMax<>(integers);
        System.out.println("Минимум: " + minMax.findMin());
        System.out.println("Максимум: " + minMax.findMax());

        // Тест Calculator
        System.out.println("Сумма: " + Calculator.sum(8, 4.5));
        System.out.println("Умножение: " + Calculator.multiply(3, 7.5));
        System.out.println("Деление: " + Calculator.divide(20, 2.5));
        System.out.println("Вычитание: " + Calculator.subtraction(11.5, 6.5));

        // Тест Matrix
        Integer[][] matrix = {{3, 7, 2}, {6, 10, 8}, {12, 1, 15}};
        Matrix<Integer> integerMatrix = new Matrix<>(matrix);
        integerMatrix.printMatrix();
        System.out.println("Элемент в строке 1, столбце 2: " + integerMatrix.getElement(1, 2));
        integerMatrix.setElement(0, 0, 25);
        integerMatrix.printMatrix();
    }
}


class Cat implements Animal, Serializable {
    // Cat class implementation
}