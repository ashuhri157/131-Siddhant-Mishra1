package atmapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingApplication {
List<BankAccount> bankAccountList = null;

private List<BankAccount> getAccountDetails() {
List<BankAccount> bankAccountList = new ArrayList<>();

BankAccount account1 = new BankAccount("Siddhant", "30212");
BankAccount account2 = new BankAccount("Shivani", "51256");
BankAccount account3 = new BankAccount("Nishant", "54785");
BankAccount account4 = new BankAccount("Sumit", "27895");
BankAccount account5 = new BankAccount("Sanjana", "51358");

bankAccountList.add(account1);
bankAccountList.add(account2);
bankAccountList.add(account3);
bankAccountList.add(account4);
bankAccountList.add(account5);

return bankAccountList;
}

private void showMenu() {
Scanner scanner = null;

try {
char option = '\0';
scanner = new Scanner(System.in);

System.out.println("A : Check Your Balance");
System.out.println("B : Deposit");
System.out.println("C : Withdraw");
System.out.println("D : Previous Transaction");
System.out.println("E : Exit The System");

do {
System.out.println("===========================================================*=");
System.out.println("Enter Your Option");
System.out.println("===========================================================*=");
option = scanner.next().charAt(0);
System.out.println("\n");
BankAccount acc = null;

switch (option) {
case 'A':
System.out.println("-------------------------------------------------------");
acc = getAccount(scanner);

if (acc != null) {
System.out.println("Balance = " + acc.getBalance());
System.out.println("-------------------------------------------------------");
System.out.println("\n");
}
break;
case 'B':
System.out.println("-------------------------------------------------------");
acc = getAccount(scanner);
System.out.println("Enter an amount to deposit ");
System.out.println("-------------------------------------------------------");
System.out.println("\n");
int amount = scanner.nextInt();

if (acc != null) {
acc.deposit(amount);
System.out.println("\n");
}
break;
case 'C':
System.out.println("-------------------------------------------------------");
acc = getAccount(scanner);
System.out.println("Enter an amount to withdraw ");
System.out.println("-------------------------------------------------------");
System.out.println("\n");
int amount2 = scanner.nextInt();

if (acc != null) {
acc.withdraw(amount2);
System.out.println("\n");
}
break;
case 'D':
System.out.println("-------------------------------------------------------");
acc = getAccount(scanner);

if (acc != null) {
acc.getPreviousTransaction();
System.out.println("-------------------------------------------------------");
System.out.println("\n");
}
break;
case 'E':
System.out.println("=============================================================");
break;
default:
System.out.println("Invalid Option!! Please Enter Correct Option...");
break;
}
} while (option != 'E');
} catch (Exception excp) {
System.out.println("Some Problem exist in the application. Please try again later.");
excp.printStackTrace();
} finally {
if (scanner != null) {
scanner.close();
}
}

System.out.println("Thank You for Using our Services.....!!");
}

private BankAccount getAccount(Scanner scanner) {
try {
if (bankAccountList == null) {
bankAccountList = getAccountDetails();
}

System.out.println("Enter Your Account Number:");
String customerId = scanner.next();

for (BankAccount acc : bankAccountList) {
if (acc.getCustomerId().equals(customerId)) {
return acc;
}
}

System.out.println("Account number doesnot exist");
} catch (Exception excp) {
excp.printStackTrace();
}
return null;
}

public static void main(String[] args) {
BankingApplication bnkpl = new BankingApplication();

bnkpl.showMenu();
}
}

class BankAccount {
int balance = 10000;
int previousTransaction;
String customerName;
String customerId;

BankAccount(String cname, String cid) {
this.customerName = cname;
this.customerId = cid;
}

public int getBalance() {
return balance;
}

public void setBalance(int balance) {
this.balance = balance;
}

public String getCustomerId() {
return customerId;
}

public void setCustomerId(String customerId) {
this.customerId = customerId;
}

public String getCustomerName() {
return customerName;
}

public void setCustomerName(String customerName) {
this.customerName = customerName;
}

public void getPreviousTransaction() {
if (previousTransaction > 0) {
System.out.println("Deposited: " + previousTransaction);
} else if (previousTransaction < 0) {
System.out.println("Withdraw: " + Math.abs(previousTransaction));
} else {
System.out.println("No Transaction Occured");
}
}

public void setPreviousTransaction(int previousTransaction) {
this.previousTransaction = previousTransaction;
}

public void deposit(int amount) {
if (amount > 0) {
balance = balance + amount;
previousTransaction = amount;
} else {
System.out.println("plz enter valid amount");
}
}

public void withdraw(int amount) {


if (amount > 0) {
if (amount <= balance) {
balance = balance - amount;
previousTransaction = -amount;
} else {
System.out.println("Insufficient fund");
}
} else {
System.out.println("plz enter valid amount");
}
}
}
