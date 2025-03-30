public class Main{
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(1001, "2025-04-01", "TRK12345", "2025-04-03");
        System.out.println(order.getOrderStatus());
    }
}
