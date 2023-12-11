import java.util.HashMap;
import java.util.Map;

public class TableOrdersManager {
    private Map<String, Order> tableOrders;

    public TableOrdersManager() {
        tableOrders = new HashMap<>();
    }

    public void addOrderToTable(String tableNumber, Order order) {
        try {
            if (tableOrders.containsKey(tableNumber)) {
                throw new RuntimeException("Error: Table " + tableNumber + " already has an existing order.");
            } else {
                tableOrders.put(tableNumber, order);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void displayOrderInfo(Order order) {
        System.out.println("Items:");
        Item[] items = order.getItems();
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total Price: $" + order.getTotalPrice());
    }


    public Order getOrderFromTable(String tableNumber) {
        return tableOrders.get(tableNumber);
    }

    public void removeOrderFromTable(String tableNumber) {
        tableOrders.remove(tableNumber);
    }

    public void addItemToTableOrder(String tableNumber, Item item) {
        Order order = tableOrders.get(tableNumber);
        if (order != null) {
            order.addItem(item);
        }
    }

    public void displayTableOrdersInfoWithEmpty() {
        System.out.println("=== Table Orders Information (Including Empty Tables) ===");
        int tableCount = 5; // Задайте общее количество столов
        for (int i = 1; i <= tableCount; i++) {
            String tableNumber = Integer.toString(i);
            Order order = tableOrders.get(tableNumber);
            System.out.println("Table " + tableNumber + " Order:");
            if (order != null) {
                displayOrderInfo(order);
            } else {
                System.out.println("No order on this table.");
            }
            System.out.println("------------------------------");
        }
        System.out.println("Total Price of All Table Orders: " + getTotalPriceOfAllTableOrders());
        System.out.println("------------------------------\n");
    }

    public Order[] getAllTableOrders() {
        return tableOrders.values().toArray(new Order[0]);
    }

    public double getTotalPriceOfAllTableOrders() {
        double totalPrice = 0;
        for (Order order : tableOrders.values()) {
            totalPrice += order.getTotalPrice();
        }
        return totalPrice;
    }

    public int getTotalItemCountOfDishInAllTables(String dishName) {
        int totalCount = 0;
        for (Order order : tableOrders.values()) {
            totalCount += order.getCount(dishName);
        }
        return totalCount;
    }
}
