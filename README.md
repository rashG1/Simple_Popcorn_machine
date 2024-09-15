# Popcorn Machine Simulation

Project Description

This project simulates a free popcorn machine using a Producer-Consumer pattern in Java. The simulation consists of two key entities:

A Cooker (Producer) that produces a bag of popcorn and places it in an output bin.
A Robot Arm (Consumer) that picks up the popcorn bag from the bin and places it on a nearby table for others to take.
The project demonstrates the use of multi-threading in Java, along with proper handling of thread execution exceptions. The cooker can produce one popcorn bag at a time, the output bin holds only one bag, and the robot arm can pick up one bag at a time.

Key Features
Multi-threaded simulation with proper synchronization.
Exception handling for thread-related issues.
Demonstrates a typical Producer-Consumer scenario.
Getting Started
Prerequisites
Java Development Kit (JDK) 8 or higher.
An IDE or text editor like IntelliJ IDEA, Eclipse, or Visual Studio Code for running the project.
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/rashG1/Simple_Popcorn_machine.git
Open the project in your preferred IDE.

Compile and run the program.

Running the Program
To run the program, navigate to the main class file (Main.java) that contains the main method. This method simulates the popcorn machine and demonstrates the key steps of the scenario.

Code Structure
Main.java: Contains the main method, where the simulation starts.
Cooker.java: Simulates the producer that creates a bag of popcorn and places it in the output bin.
RobotArm.java: Simulates the consumer that picks up the popcorn from the bin and places it on the table.
PopcornMachine.java: The shared resource (output bin) between the cooker and robot arm.
Exception Handling
The project includes the handling of an exception related to thread execution, such as the InterruptedException that occurs when a thread is interrupted during execution.

Additional Information
Deadlock: The project does not cause deadlock as it uses proper synchronization with a well-defined order of execution.
Starvation: If thread priorities are changed, there is a potential for starvation, but with default priorities, all threads are treated equally.
