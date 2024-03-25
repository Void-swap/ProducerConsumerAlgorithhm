import java.util.Scanner;

public class producer_consumer_algo {

    static boolean mutex = true;
    static int isFull = 0;
    static int isEmpty = 10, buffer = 0;

    static void producer() {

        mutex = !mutex;
        ++isFull;
        --isEmpty;

        buffer++;
        System.out.println("\nProducer produced an item.\t\tBUFFER state :" + buffer);
        mutex = !mutex;
    }

    static void consumer() {

        mutex = !mutex;
        --isFull;
        ++isEmpty;

        System.out.println("\nConsumer consumed an item.\t\tBUFFER state :" + (buffer - 1));
        buffer--;

        mutex = !mutex;
    }

    public static void main(String[] args) {
        int choice = 1;
        Scanner scanner = new Scanner(System.in);

        while (choice != 3) {

            System.out.println("\n1. To Produce"
                    + "\n2. To Consume"
                    + "\n3. To Exit");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    if ((mutex == true)
                            && (isEmpty != 0)) {
                        producer();
                    }

                    else {
                        System.out.println("Buffer is FULL!!!");
                    }
                    break;

                case 2:

                    if ((mutex == true)
                            && (isFull != 0)) {
                        consumer();
                    }

                    else {
                        System.out.println("Buffer is EMPTY!!!");
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nEnter a valid choice +_-");
            }
        }
    }
}
