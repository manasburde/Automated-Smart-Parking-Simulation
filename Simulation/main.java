import parking.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vehicle[] slots = new vehicle[10]; // Fixed array size as per report
        
        System.out.println("--- Automated Smart Parking System ---");
        while(true) {
            try {
                System.out.println("\n1. Park Car (Rs.20/hr)");
                System.out.println("2. Park Bike (Rs.15/hr)");
                System.out.println("3. Park Premium Car (Rs.40/hr)");
                System.out.println("4. Checkout Vehicle");
                System.out.println("5. View All Parked");
                System.out.println("6. Exit");
                System.out.print("Select Option: ");
                
                int ch = sc.nextInt();
                
                if(ch == 1 || ch == 2 || ch == 3) {
                    int emptySlot = -1;
                    for(int i=0; i<slots.length; i++) {
                        if(slots[i] == null) {
                            emptySlot = i;
                            break;
                        }
                    }
                    
                    if(emptySlot == -1) {
                        throw new parkingException("Error: Parking Full! Cannot park more vehicles.");
                    }
                    
                    System.out.print("Enter Vehicle ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Duration (Hours): ");
                    int hrs = sc.nextInt();
                    
                    if(ch == 1) slots[emptySlot] = new car(id, hrs);
                    else if(ch == 2) slots[emptySlot] = new bike(id, hrs);
                    else slots[emptySlot] = new premimumCar(id, hrs);
                    
                    System.out.println("Success: Vehicle parked at Slot " + (emptySlot + 1));
                    
                } else if(ch == 4) {
                    System.out.print("Enter Vehicle ID to Checkout: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    
                    for(int i=0; i<slots.length; i++) {
                        if(slots[i] != null && slots[i].getId() == id) {
                            double fee = slots[i].calculateFee();
                            System.out.println("\n--- Receipt ---");
                            slots[i].display();
                            System.out.println("Total Fee: Rs. " + fee);
                            System.out.println("Status: Paid & Checked Out");
                            slots[i] = null; // Free up the slot
                            found = true;
                            break;
                        }
                    }
                    
                    if(!found) System.out.println("Error: Vehicle ID not found.");
                    
                } else if(ch == 5) {
                    System.out.println("\n--- Current Parking Status ---");
                    boolean empty = true;
                    for(int i=0; i<slots.length; i++) {
                        if(slots[i] != null) {
                            System.out.print("Slot " + (i+1) + ": ");
                            slots[i].display();
                            empty = false;
                        }
                    }
                    if(empty) System.out.println("Parking Lot is Empty.");
                    
                } else if(ch == 6) {
                    System.out.println("System Shutting Down...");
                    break;
                } else {
                    System.out.println("Invalid Option.");
                }
                
            } catch (parkingException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter numbers only.");
                sc.next(); // Clear buffer
            }
        }
    }
}
