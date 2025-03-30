class Main{
    public static void main(String[] args){
        Chef chef = new Chef("Nancy", 202, "Japanese");
        Waiter waiter = new Waiter("Harry", 108, 6);

        chef.displayDetail();
        chef.performDuties();

        waiter.displayDetail();
        waiter.performDuties();
    }
}