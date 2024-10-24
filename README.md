# CalculatorApp

**CalculatorApp** is a simple calculator built using JavaFX, following the MVC (Model-View-Controller) architectural pattern. It supports basic arithmetic operations such as addition, subtraction, multiplication, and division. The project also includes error handling for cases such as division by zero and invalid inputs.

## Features
- Basic arithmetic operations: Addition, Subtraction, Multiplication, Division.
- User-friendly GUI with clear display of inputs and results.
- Error handling for invalid inputs and division by zero.
- Built using JavaFX with FXML for defining the user interface.
  
---

## How to Run the Application

### Prerequisites:
- You must have **Java JDK 8** or later installed.
- Ensure you have **JavaFX SDK** installed and configured.
- You need an IDE such as **IntelliJ IDEA** with JavaFX support enabled or any other IDE supporting JavaFX.

### Steps:
1. Clone the repository from GitHub:
   ```bash
   git clone https://github.com/nurjamal505/Calculator-App
   ```
2. Open the project in your preferred IDE (IntelliJ IDEA is recommended).
3. Make sure the `JavaFX` libraries are set up in the project SDK.
4. Locate the `CalculatorApp.java` file and run the application.
5. The calculator window should open, allowing you to perform basic operations.

---

## How to Use the Calculator

1. **Basic Operations**:
   - Enter a number using the buttons or the keyboard.
   - Select an arithmetic operation (addition, subtraction, multiplication, division).
   - Enter the next number.
   - Click the `=` button to display the result.

2. **Error Handling**:
   - If you try to divide by zero, the application will display a warning message: `Error: Division by zero`.
   - If you enter an invalid input or incomplete expression, an error message will appear.

3. **Reset/AC**:
   - To reset the calculator, click the `AC` button. This clears all inputs and results.

---

## UI Screenshots

### Main Interface:
![Снимок экрана 2024-10-24 130803](https://github.com/user-attachments/assets/1ba4b7d4-5ced-4e1d-b55a-cbe2c4a4480a)

### Example of Addition:
![Снимок экрана 2024-10-24 130929](https://github.com/user-attachments/assets/50a1a19b-a42c-4163-b900-1120711135db)
![Снимок экрана 2024-10-24 130938](https://github.com/user-attachments/assets/01f25d5c-3c70-4452-b3fc-f5612bfb299c)
![Снимок экрана 2024-10-24 130944](https://github.com/user-attachments/assets/27a25eb2-6c6a-456f-aed6-d78de13536f8)


### Example of Division by Zero Error:
![Снимок экрана 2024-10-24 131000](https://git![Снимок экрана 2024-10-24 131010](https://github.com/user-attachments/assets/91b72266-9887-4daa-ad8d-f0b29ff18edb)
hub.com/user-attachments/assets/5ffc9f90-850b-4b71-bea1-ec3b9298f574)
![Снимок экрана 2024-10-24 131015](https://github.com/user-attachments/assets/e618d237-c6f8-4997-91b0-d578014a01de)


---

## MVC Structure

- **Model**: Contains the core business logic for performing calculations (e.g., arithmetic operations).
- **View**: Defined using FXML, it manages the graphical user interface (buttons, text fields, etc.).
- **Controller**: Handles user interactions and communicates between the View and the Model.

The structure ensures clean separation of concerns, making the application easy to maintain and extend.

---

## Known Issues
- If you press an operator without inputting numbers first, the operation might not behave as expected. This will be handled in future updates.
- No support for parentheses or complex expressions (e.g., `2 + 3 * 5` is not supported).

---

## Special Instructions
- Ensure your JavaFX SDK is correctly set up in your IDE before running the application.
- The calculator is designed to handle basic arithmetic only; more advanced features may be added in future versions.

---

## Contributing

If you'd like to contribute to the project:
1. Fork the repository.
2. Create a new branch with your changes: `git checkout -b feature-branch`.
3. Commit your changes: `git commit -m "Add feature"`.
4. Push to the branch: `git push origin feature-branch`.
5. Submit a pull request.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

**Link to GitHub repository**: https://github.com/nurjamal505/Calculator-App
