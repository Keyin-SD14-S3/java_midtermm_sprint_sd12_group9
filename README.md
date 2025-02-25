# Deployment Documentation for Menu.java
This document provides a step-by-step guide to deploying and running the Menu.java class for the Pharmacy Management System project. For setting up the project, compiling the code, and executing the program the steps are to follow:
 
# Prerequisites
Before running the system, needs to make sure to install:
•	Java Development Kit (JDK): The project is written in Java JDK version 22, so 22 or higher should be installed. Anyone can download it from Oracle's JDK’s Website.
•	IDE/Text Editor: A Java-friendly IDE like IntelliJ IDEA, Eclipse, or a simple text editor like Visual Studio Code.
 
# Step 1: Clone the Repository
Need to clone the GitHub repository containing the project. Open terminal or command prompt and run the following command:
git clone https://github.com/your-repository-url.git

Navigate to the project directory:
cd your-project-directory
 
# Step 2: Set Up the Java Project
1.	Open the project in your IDE or editor.
2.	Ensure the directory structure is correct, with src/models containing the Menu.java file.
3.	Make sure that all the necessary classes (MedicationTrackingSystem, Patient, Doctor, Medication, etc.) are implemented and available.
 

# Step 3: Compile the Code
1.	Using an IDE:
o	If you are using an IDE, ensure the project is configured to use JDK 22 or above.
o	Compile the project by running the Menu.java class (typically done by pressing the “Run” button).
 
# Step 4: Run the Program
Once the code is compiled, run the Menu.java class:
1.	Using an IDE:
o	Press the “Run” button to execute the Menu.java class.
 
# Step 5: Interacting with the Program
Once the program is running, you’ll be presented with a menu in the console with the following options:
=====Welcome To The Pharmacy Med Tracking System=====
What would you like to do?
1: Add A New Patient
2: Add A New Doctor
3: Add A New Medication To The Pharmacy
4: Print System Report
5: Check If Meds Are Expired
6: Process A New Prescription
7: Print All Scripts For Specific Doctor
8: Restock the drugs in the pharmacy
9: Print all scripts for specific patient
10: Delete Patient
11: Delete Doctor
12: Delete Medication
13: Edit Patient
14: Edit Doctor
15: Edit Medication
16: Exit
Choose an option by entering the corresponding number and pressing Enter. You will be prompted to provide details based on the selected option (e.g., adding a new patient or editing a medication).
 
# Step 6: Exiting the Program
To exit the program, select option 16 and press Enter. The program will terminate, and you will see the message:
Exiting The System! Good Bye!
 
# Troubleshooting
•	NoSuchElementException: This error occurs if the program is trying to read input when none is available. It might happen if the user input is not provided as expected. Ensure that you're entering valid input and follow the prompts accurately.
•	Class Not Found: Ensure that your src directory is set up correctly and the class files are located in the proper packages.
 
# Step 7: Conclusion
By following the steps above, one should be able to successfully deploy and run the Pharmacy Management System using the Menu.java class. The system will allow you to manage various pharmacy operations, such as adding new patients, doctors, and medications, and processing prescriptions.
If one encounters any issues, consult the project documentation or reach out for further assistance.

