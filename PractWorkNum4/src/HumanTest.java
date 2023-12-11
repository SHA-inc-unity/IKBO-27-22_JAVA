public class HumanTest {
    public static void main(String[] args) {
        // Создаем объекты для каждой части тела
        Head head = new Head("Каштановые");
        Leg leftLeg = new Leg("Левая", 90);
        Leg rightLeg = new Leg("Правая", 92);
        Hand leftHand = new Hand("Левая", 5);
        Hand rightHand = new Hand("Правая", 5);

        // Создаем объект класса Human
        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        // Выводим информацию о частях тела человека
        System.out.println("Информация о человеке:");
        System.out.println("Волосы: " + person.getHead().getHairColor());
        System.out.println("Длина левой ноги: " + person.getLeftLeg().getLengthInCentimeters() + " см");
        System.out.println("Длина правой ноги: " + person.getRightLeg().getLengthInCentimeters() + " см");
        System.out.println("Количество пальцев на левой руке: " + person.getLeftHand().getFingersCount());
        System.out.println("Количество пальцев на правой руке: " + person.getRightHand().getFingersCount());

        // Изменяем некоторые свойства и выводим их снова
        head.setHairColor("Русые");
        leftLeg.setLengthInCentimeters(95);
        rightHand.setFingersCount(6);

        System.out.println("\nИзмененная информация о человеке:");
        System.out.println("Волосы: " + person.getHead().getHairColor());
        System.out.println("Длина левой ноги: " + person.getLeftLeg().getLengthInCentimeters() + " см");
        System.out.println("Длина правой ноги: " + person.getRightLeg().getLengthInCentimeters() + " см");
        System.out.println("Количество пальцев на левой руке: " + person.getLeftHand().getFingersCount());
        System.out.println("Количество пальцев на правой руке: " + person.getRightHand().getFingersCount());
    }
}
