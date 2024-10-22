// Bank Account program in C++

#include <iostream>
using namespace std;

class BankAccount {
private:
    string owner;
    double balance;

public:
    BankAccount(string owner, double balance) {
        this->owner = owner;
        this->balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        cout << "Deposited: " << amount << " | New balance: " << balance << endl;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            cout << "Insufficient funds!" << endl;
        } else {
            balance -= amount;
            cout << "Withdrawn: " << amount << " | New balance: " << balance << endl;
        }
    }

    void displayBalance() {
        cout << "Account owner: " << owner << " | Balance: " << balance << endl;
    }
};

int main() {
    BankAccount myAccount("John Doe", 1000);
    myAccount.displayBalance();
    myAccount.deposit(500);
    myAccount.withdraw(200);
    myAccount.displayBalance();
    
    return 0;
}
