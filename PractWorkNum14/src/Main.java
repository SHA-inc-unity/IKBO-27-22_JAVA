public class Main {
    public static void main(String[] args) {
        // Создание списка ожидания (WaitList)
        WaitList<Integer> waitList = new WaitList<>();
        waitList.add(1);
        waitList.add(2);
        waitList.add(3);
        System.out.println("Содержимое списка ожидания (WaitList): " + waitList);

        // Создание ненадежного списка ожидания (UnfairWaitList)
        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add(4);
        unfairWaitList.add(5);
        unfairWaitList.add(6);
        System.out.println("Содержимое ненадежного списка ожидания (UnfairWaitList): " + unfairWaitList);

        // Удаление элемента из ненадежного списка ожидания (UnfairWaitList)
        unfairWaitList.remove(5);
        System.out.println("Содержимое ненадежного списка ожидания после удаления 5: " + unfairWaitList);

        // Перемещение элемента в конец ненадежного списка ожидания (UnfairWaitList)
        unfairWaitList.moveToBack(4);
        System.out.println("Содержимое ненадежного списка ожидания после перемещения 4 в конец: " + unfairWaitList);

        // Создание ограниченного списка ожидания (BoundedWaitList) с емкостью 2
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(2);
        boundedWaitList.add(7);
        boundedWaitList.add(8);
        System.out.println("Содержимое ограниченного списка ожидания (BoundedWaitList): " + boundedWaitList);

        // Попытка добавить элемент в ограниченный список ожидания (BoundedWaitList) с превышением емкости
        boundedWaitList.add(9); // Этот элемент не будет добавлен, так как емкость превышена
        System.out.println("Содержимое ограниченного списка ожидания после попытки добавления 9: " + boundedWaitList);
    }
}
