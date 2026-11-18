# Day 04: Polymorphism & Interface Design - Payment System

## Overview
This module demonstrates runtime polymorphism and interface-driven design using a real-world **Payment Gateway / Payment Processor** system.

---

## Design Principles Applied
1. **Interface Segregation & Abstraction**:
   - `PaymentMethod` defines the contract (`processPayment(double amount)`).
   - High-level modules depend on the abstraction (`PaymentMethod`), not concrete classes.
2. **Runtime Polymorphism**:
   - `PaymentProcessor` processes payments via `PaymentMethod`, completely agnostic of whether it is Credit Card, UPI, or NetBanking.
3. **Open/Closed Principle (OCP)**:
   - New payment channels (e.g. `CryptoPayment`, `WalletPayment`) can be added by implementing `PaymentMethod` without altering a single line of `PaymentProcessor`.

---

## Architecture Diagram

```mermaid
classDiagram
    direction TB
    class PaymentMethod {
        <<interface>>
        +processPayment(double amount) void
    }

    class CreditCardPayment {
        -String cardNumber
        -String cardHolder
        +processPayment(double amount) void
    }

    class UpiPayment {
        -String upiId
        +processPayment(double amount) void
    }

    class NetBankingPayment {
        -String bankName
        -String accountHolder
        +processPayment(double amount) void
    }

    class PaymentProcessor {
        +processPayment(PaymentMethod payMethod, double amount) void
    }

    class Main {
        +main(String[] args)$ void
    }

    PaymentMethod <|.. CreditCardPayment : implements
    PaymentMethod <|.. UpiPayment : implements
    PaymentMethod <|.. NetBankingPayment : implements
    PaymentProcessor ..> PaymentMethod : depends on
    Main ..> PaymentProcessor : uses
    Main ..> PaymentMethod : instantiates
```

---

## How to Run

```powershell
cd 'week-01\Day-04\PaymentSystem'
javac *.java
java Main
```
