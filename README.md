Automated Smart Parking Simulation

1. Project Overview

The Automated Smart Parking Simulation is a Java based console application designed to manage vehicle allocation and billing in space constrained environments. It simulates a real world parking lot controller that differentiates between vehicle types (Cars vs. Bikes), assigns the first available slot dynamically, and calculates fees based on hourly usage. This project demonstrates core Object Oriented Programming (OOP) principles, including Inheritance, Polymorphism, and Exception Handling, within a modular package structure.

2. Features

Dynamic Slot Allocation: Automatically searches the array for the first null (empty) slot to park a vehicle.

Polymorphic Billing: Differentiates costs based on object type:

Cars: Rs. 20 per hour.

Bikes: Rs. 10 per hour.

Capacity Management: Enforces a hard limit on parking slots (Size: 5). Throws a custom ParkingException if the lot is full.

Checkout System: precise billing generation by searching for specific Vehicle IDs.

Modular Design: Logic is separated into a dedicated parking package, isolating it from the main execution flow.

3. Technologies Used

Language: Java (JDK 8 or higher)

Concepts Implemented:

Packages: Organized code into parking package for modularity.

Abstraction: Vehicle abstract class defines the contract for all vehicle types.

Inheritance: Car and Bike extend the base functionality.

Exception Handling: Robust try-catch blocks with a custom ParkingException.

Arrays: Efficient fixed-size data structure for slot management.

4. Project Structure

The project follows a strict package based directory structure:

Automated-Smart-Parking-Simulation/
├── Main.java                // Entry point (Execution Logic)
├── README.md                // Project Documentation
├── statement.md             // Problem Definition
└── parking/                 // Package Folder (Core Logic)
    ├── Vehicle.java         // Abstract Parent Class
    ├── Car.java             // Concrete Child Class
    ├── Bike.java            // Concrete Child Class
    └── ParkingException.java // Custom Error Handling


5. Steps to Install and Run

Since this project uses a Package, you must compile and run it from the root directory (where Main.java is located).

Clone the repository:

git clone [https://github.com/manasburde/Automated-Smart-Parking-Simulation.git](https://github.com/manasburde/Automated-Smart-Parking-Simulation.git)
cd Automated-Smart-Parking-Simulation


Compile the code:
(Note: Compiling Main.java automatically compiles the files inside the parking folder)

javac Main.java


Run the application:

java Main


6. Usage Instructions

Park a Vehicle: Select Option 1 (Car) or Option 2 (Bike). Enter a unique ID (e.g., 101) and the duration in hours.

System Feedback: The system will confirm the "Slot Number" where the vehicle is parked.

Full Capacity: If you try to park a 6th vehicle, the system will catch the error and display "Error: Parking Full".

Checkout: Select Option 3 and enter the Vehicle ID. The system will calculate the total fee and clear the slot for new customers.
