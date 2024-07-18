# Railway Reservation System

This Java application simulates a railway booking system where customers can book tickets, cancel them, and view seat availability and bookings.

## Features

- **Booking System**: Allows customers to book tickets based on age, gender, and birth preference (lower or upper seat).
- **Cancellation**: Supports cancellation of booked tickets, with seats moving to the RAC (Reservation Against Cancellation) queue.
- **Queue Management**: Automatically manages waiting lists and RAC queues when seats are fully booked.
- **Seat Management**: Tracks and displays available and booked seats in different classes (lower and general/upper).

## Classes

- **RailwayBooking**: Manages ticket booking, seat allocation, and queue management.
- **Customer**: Represents a customer with details like name, age, gender, and seat preference.
- **PrintData**: Provides methods to print available and booked seat information.
- **Seats**: Defines seat configurations and manages seat data using a HashMap.

## How to Use

1.Clone the repository to your local computer.
2.Compile the Railway.java file.
