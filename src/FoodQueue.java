public class FoodQueue {

    private int capacity;
    private Object[] customers;
    private int size;

    public FoodQueue(int capacity) {
        this.capacity = capacity;
        this.customers = new Customer[capacity];
        this.size = 0;
    }

    public void enqueue(Object customer) {
        if (size < capacity) {
            customers[size] = customer;
            size++;
            System.out.println("Customer added to the queue");
        } else {
            System.out.println("Queue is full. Please try another queue");
        }
    }
}
