import java.util.Scanner;
class Train {
    private String name;
    private String departureTime;
    private String sourceStation;
    private String destinationStation;
    private int passengerStrength;
    private int trainNumber;
    public Train(String name, String departureTime, String sourceStation, String destinationStation,
                 int passengerStrength, int trainNumber) {
        this.name = name;
        this.departureTime = departureTime;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.passengerStrength = passengerStrength;
        this.trainNumber = trainNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public String getSourceStation() {
        return sourceStation;
    }
    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }
    public String getDestinationStation() {
        return destinationStation;
    }
    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }
    public int getPassengerStrength() {
        return passengerStrength;
    }
    public void setPassengerStrength(int passengerStrength) {
        this.passengerStrength = passengerStrength;
    }
    public int getTrainNumber() {
        return trainNumber;
    }
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
}
class ReservationSystem {
    private static final int MAX_TRAINS = 100; 
    private Train[] trains;
    private int trainCount;
    public ReservationSystem() {
        this.trains = new Train[MAX_TRAINS];
        this.trainCount = 0;
    }
    public void addTrain(Train train) {
        if (trainCount < MAX_TRAINS) {
            trains[trainCount++] = train;
        } else {
            System.out.println("Cannot add more trains. Maximum limit reached.");
        }
    }
    public void displayAvailableTrains(String source, String destination) {
        for (int i = 0; i < trainCount; i++) {
            Train train = trains[i];
            if (train.getSourceStation().equals(source) && train.getDestinationStation().equals(destination)) {
                System.out.println("Train Name: " + train.getName() + ", Train Number: " + train.getTrainNumber());
            }
        }
    }
    public void checkSeatAvailability(int trainNumber) {
        for (int i = 0; i < trainCount; i++) {
            if (trains[i].getTrainNumber() == trainNumber) {
                System.out.println("Available Seats for Train " + trainNumber + ": " + trains[i].getPassengerStrength());
                return;
            }
        }
        System.out.println("Train with number " + trainNumber + " not found.");
    }
    public void bookTicket(int trainNumber, String passengerName, int seatNumber) {
        for (int i = 0; i < trainCount; i++) {
            if (trains[i].getTrainNumber() == trainNumber) {
                if (trains[i].getPassengerStrength() > 0) {
                    trains[i].setPassengerStrength(trains[i].getPassengerStrength() - 1);
                    System.out.println("Ticket booked for passenger " + passengerName + " in train " + trainNumber + " with seat number " + seatNumber);
                    return;
                } else {
                    System.out.println("No available seats for train " + trainNumber);
                    return;
                }
            }
        }
        System.out.println("Train with number " + trainNumber + " not found.");
    }
    public void cancelTicket(int trainNumber, String passengerName, int seatNumber) {
        for (int i = 0; i < trainCount; i++) {
            if (trains[i].getTrainNumber() == trainNumber) {
                trains[i].setPassengerStrength(trains[i].getPassengerStrength() + 1);
                System.out.println("Ticket canceled for passenger " + passengerName + " in train " + trainNumber + " with seat number " + seatNumber);
                return;
            }
        }
        System.out.println("Ticket not found for passenger " + passengerName + " in train " + trainNumber + " with seat number " + seatNumber);
    }
    public void displayTicketDetails(int trainNumber, String passengerName, int seatNumber) {
        System.out.println("Ticket Details:");
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Seat Number: " + seatNumber);
    }
}

public class Railway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationSystem reservationSystem = new ReservationSystem();
        Train train1 = new Train("Express", "10:00 AM", "StationA", "StationB", 100, 101);
        Train train2 = new Train("Superfast", "11:00 AM", "StationB", "StationC", 120, 102);
        Train train3 = new Train("Local", "12:00 PM", "StationA", "StationC", 80, 103);
        reservationSystem.addTrain(train1);
        reservationSystem.addTrain(train2);
        reservationSystem.addTrain(train3);
        int choice;
        do {
            System.out.println("1. Display available trains");
            System.out.println("2. Check seat availability");
            System.out.println("3. Book a ticket");
            System.out.println("4. Cancel a ticket");
            System.out.println("5. Display ticket details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter source station: ");
                    String source = scanner.next();
                    System.out.print("Enter destination station: ");
                    String destination = scanner.next();
                    reservationSystem.displayAvailableTrains(source, destination);
                    break;
                case 2:
                    System.out.print("Enter train number: ");
                    int trainNumberCheck = scanner.nextInt();
                    reservationSystem.checkSeatAvailability(trainNumberCheck);
                    break;
                case 3:
                    System.out.print("Enter train number: ");
                    int trainNumberBook = scanner.nextInt();
                    System.out.print("Enter passenger name: ");
                    String passengerName = scanner.next();
                    System.out.print("Enter seat number: ");
                    int seatNumberBook = scanner.nextInt();
                    reservationSystem.bookTicket(trainNumberBook, passengerName, seatNumberBook);
                    break;
                case 4:
                    System.out.print("Enter train number: ");
                    int trainNumberCancel = scanner.nextInt();
                    System.out.print("Enter passenger name: ");
                    String passengerNameCancel = scanner.next();
                    System.out.print("Enter seat number: ");
                    int seatNumberCancel = scanner.nextInt();
                    reservationSystem.cancelTicket(trainNumberCancel, passengerNameCancel, seatNumberCancel);
                    break;
                case 5:
                    System.out.print("Enter train number: ");
                    int trainNumberDisplay = scanner.nextInt();
                    System.out.print("Enter passenger name: ");
                    String passengerNameDisplay = scanner.next();
                    System.out.print("Enter seat number: ");
                    int seatNumberDisplay = scanner.nextInt();
                    reservationSystem.displayTicketDetails(trainNumberDisplay, passengerNameDisplay, seatNumberDisplay);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. PlStation Aease try again.");
            }
        } while (choice != 0);
        scanner.close();
    }
}
