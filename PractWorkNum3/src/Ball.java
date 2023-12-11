
public class Ball {
    // Приватные переменные для хранения положения мяча
    private double x;
    private double y;

    // Конструктор для инициализации положения мяча
    public Ball(double initialX, double initialY) {
        x = initialX;
        y = initialY;
    }

    // Методы для получения значений положения мяча
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Методы для установки значений положения мяча
    public void setX(double newX) {
        x = newX;
    }

    public void setY(double newY) {
        y = newY;
    }

    // Метод для задания скорости мяча
    public void setXYSpeed(double xSpeed, double ySpeed) {
        // Здесь можно добавить проверки на допустимые значения скорости
        // и обработку ошибок, если необходимо
    }

    // Метод для перемещения мяча
    public void move(double xDisp, double yDisp) {
        // Увеличиваем x и y на заданный сдвиг
        x += xDisp;
        y += yDisp;
    }

    // Метод для получения строкового представления мяча
    @Override
    public String toString() {
        return "Ball @ (" + x + ", " + y + ")";
    }
}