package Week5_2;
public class TicketReservationSystem implements Runnable {

    public class Customer {
        static int id = 0;
        private int customerID;

        public Customer() {
            this.customerID = ++id;
        }
    }

    private int totalSeatAmount;
    private int seatsReserved;
    private int seatsAvailable;

    public TicketReservationSystem(int numSeats) {
        this.totalSeatAmount = numSeats;
        this.seatsReserved = 0;
        this.seatsAvailable = numSeats;
    }

    public synchronized void reserveTickets(Customer customer, int amount) {
        if (amount > this.seatsAvailable) {
            System.out.println("Customer " + customer.customerID + " couldn't reserve " + amount + " tickets.");
        } else {
            this.seatsReserved += amount;
            this.seatsAvailable -= amount;
            System.out.println("Customer " + customer.customerID + " reserved " + amount + " tickets.");
        }
    }

    @Override
    public void run() {
        Customer customer = new Customer();
        int amount = (int) (Math.random() * 3 + 1);
        reserveTickets(customer, amount);
    }

    public static void main(String[] args) {
        int numSeats = 10;
        int numCustomers = 15;
        Thread[] threads = new Thread[numCustomers];
        TicketReservationSystem ticketReservationSystem = new TicketReservationSystem(numSeats);
        for (int i = 0; i < numCustomers; i++) {
            threads[i] = new Thread(ticketReservationSystem);
            threads[i].start();
        }
    }
}
