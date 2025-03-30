class CustomerCarLog {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    public CustomerCarLog(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public static void main(String[] args) {
        CustomerCarLog rental1 = new CustomerCarLog("John Doe", "Toyota Corolla", 5, 40.0);
        System.out.println("Total Rental Cost: $" + rental1.calculateTotalCost());
    }
}