public class TestTableOrdersManager {
    public static void main(String[] args) {
        TableOrdersManager tableOrdersManager = new TableOrdersManager();

        Order orderForTable11 = new RestaurantOrder();
        orderForTable11.addItem(new MenuItem("Dish1.1", 10.0));
        tableOrdersManager.addOrderToTable("1", orderForTable11);


        Order orderForTable12 = new RestaurantOrder();
        orderForTable12.addItem(new MenuItem("Dish1.2", 10.0));
        tableOrdersManager.addOrderToTable("1", orderForTable12);


        Order orderForTable2 = new RestaurantOrder();
        orderForTable2.addItem(new MenuItem("Dish2", 15.0));
        tableOrdersManager.addOrderToTable("2", orderForTable2);

        displayTableOrdersInfo(tableOrdersManager);

        tableOrdersManager.addItemToTableOrder("1", new MenuItem("Dish3", 20.0));

        displayTableOrdersInfo(tableOrdersManager);

        tableOrdersManager.removeOrderFromTable("2");

        displayTableOrdersInfo(tableOrdersManager);

        tableOrdersManager.removeOrderFromTable("2");

        tableOrdersManager.displayTableOrdersInfoWithEmpty();
    }

    private static void displayTableOrdersInfo(TableOrdersManager tableOrdersManager) {
        System.out.println("=== Table Orders Information ===");
        Order[] allTableOrders = tableOrdersManager.getAllTableOrders();
        for (int i = 0; i < allTableOrders.length; i++) {
            System.out.println("Table " + (i + 1) + " Order:");
            displayOrderInfo(allTableOrders[i]);
            System.out.println("------------------------------");
        }
        System.out.println("Total Price of All Table Orders: " + tableOrdersManager.getTotalPriceOfAllTableOrders());
        System.out.println("------------------------------\n");
    }

    private static void displayOrderInfo(Order order) {
        System.out.println("Items:");
        Item[] items = order.getItems();
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total Price: $" + order.getTotalPrice());
    }
}
