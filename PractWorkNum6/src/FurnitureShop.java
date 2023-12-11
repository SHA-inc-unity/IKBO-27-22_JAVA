

class FurnitureShop {
    private Furniture[] furnitureArray;

    public FurnitureShop(Furniture[] furnitureArray) {
        this.furnitureArray = furnitureArray;
    }

    public void displayAllFurniture() {
        for(Furniture furniture : furnitureArray) {
            furniture.displayInfo();
            System.out.println();  // empty line separator
        }
    }
}