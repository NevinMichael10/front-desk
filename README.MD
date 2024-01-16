# Prompt Desk - Frontdesk Management Web Application

## Introduction
Prompt Desk is a comprehensive frontdesk management web application developed using Mendix. It streamlines the interaction between employees and customers, providing a unified platform for handling product complaints, generating invoices, and accessing weather information.

## Features

### Authentication
- **Login Page**: A single login page for all users.
- **User Roles**: Admin, Employee, and Customer.

### User Registration
- **Employee Registration**: Requires admin approval.
- **Customer Registration**: Distinct sign-up page with necessary validations.
- **Email Confirmation**: An email is sent to the user upon successful registration.

### Weather Integration
- **Weather Information**: All users can access real-time weather information via Weather API integration.

### Complaint Management
- **Complaint Registration**: Customers can register product complaints.
- **Complaint Resolution**: Employees receive and resolve complaints.
- **Bill Generation**: Employees generate bills for resolved complaints.
- **Email Notification**: Bills are sent to customers via email and are accessible within the application.

### Product Management
- **Product Registration**: Customers can register their products.
- **Product Status**: Customers can view the status of their registered products.

### User-Specific Views
- **Employee Dashboard**: Displays all customers' registered products, their status, and generated invoices.
- **Customer Dashboard**: Displays only the customer's products, status, and invoices (if generated).

### Admin Privileges
- **Employee Approval**: Admin approves employee registrations.
- **User Creation**: Admin can create users (Admin, Employee, Customer) without a sign-in page.
- **Workflow Monitoring**: Admin can monitor the overall workflow.
- **Configuration Settings**:
  - Email Configuration
  - Account Configuration
  - MX Model Reflection Configuration

### View Application

Web application url: https://prompt-desk-sandbox.mxapps.io/index.html?profile=Responsive

### To Run Application on local host

1. Clone the repository.
2. Install Mendix studio pro 9.24.4
3. Navigate the Repository and open `Front Desk Management.mpr`
3. Click on Run button on studio pro
4. After running is finished click on view button on studio pro and view the application.

Feel free to explore and contribute to the development of Prompt Desk!

### Project UI Images

### Contact Page
![Contact](uiux/Contact.png)

### Weather Page
![weather](uiux/weather.png)

### Login Screen
![Login](uiux/1.png)

### Sign Up Screen
![Sign up](uiux/2.png)
![Sign up2](uiux/3.png)

### Customer Notification Screen
![CustNotification](uiux/4.png)

### Employee Notification Screen
![Sign up](uiux/5.png)

### Email
![Email](uiux/emailinbox.PNG)

### Customer Pages
![CustHome](uiux/custHome.png)
![CustProduct](uiux/custRegister.png)
![CustRegister](uiux/custRegister.png)
![CustStatus](uiux/custStatus.png)
![CustProduct](uiux/custProduct.png)
![CustBill](uiux/custBill.png)

### Profile Page
![Profile](uiux/profile.png)

### Notification Page
![Profile](uiux/Notification%20(2).png)

### Employee Pages
![EmpHome](uiux/EmpHome.png)
![EmpTask](uiux/empTask.png)
![EmpResolve](uiux/empResolve.png)
![EmpProduct](uiux/empProduct.PNG)
![EmpBill](uiux/empBill.PNG)
![EmpBilll](uiux/empBillEdit.png)
![EmpStatus](uiux/empStatus.PNG)

### Invoice 
![Invoice](uiux/invoice.png)

### Admin Pages 
![Settings](uiux/AdminSettings.PNG)