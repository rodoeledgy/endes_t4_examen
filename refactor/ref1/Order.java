package refactor.ref1;
/*
Tarea: Refactorizar el método processOrder para utilizar un objeto
de parámetro que contenga itemName, quantity, price, y customerName.
 */


class Order {

    class orderProcess {
        private String itemName;
        private int quality;
        private double price;
        private String customerName;

        public orderProcess(String itemName, int quality, double price, String customerName) {
            this.itemName = itemName;
            this.quality = quality;
            this.price = price;
            this.customerName = customerName;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public int getQuality() {
            return quality;
        }

        public void setQuality(int quality) {
            this.quality = quality;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }
    }

    void processOrder(orderProcess procesador) {
        // Procesamiento del pedido
        procesador.getCustomerName();
        procesador.getItemName();
        procesador.getQuality();
        procesador.getPrice();
    }
}
