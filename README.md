# Group Chatting Application

## Overview

This project is a group chatting application developed in Java. The application allows multiple users to connect to a single server and communicate in real-time. It leverages Java Swing and AWT for the graphical user interface, and Socket programming for network communication. 

The core components of the application include:
- **Server**: Manages connections and messages between multiple clients.
- **Client**: User interface for sending and receiving messages.
- **Group Chat**: Enables communication between all connected users.

## Features

- Real-time messaging between users.
- Support for multiple clients connected to a single server.
- User interface built with Java Swing and AWT.
- Thread management for handling multiple client connections.

## Architecture

- **Server**: A standalone server application that handles incoming connections from clients. It manages message distribution among connected clients and ensures all messages are broadcasted to the entire group.
  
- **Client**: A graphical user interface application that allows users to send and receive messages. Each client connects to the server and displays incoming messages in real-time.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor

### Setup

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Ashishwayachal12/Group-Chatting-Application
   cd group-chatting-application

2.Compile the Code:

   Navigate to the directory containing the source code and compile it using javac:
      
     javac groupchattingapplication.java
3.Run the Clients:

    java groupchattingapplication.UserOne
    java groupchattingapplication.UserTwo

## You can run additional client instances by creating new classes similar to UserOne and UserTwo with different names.

##Usage:

After starting the server, run the client applications. Each client will connect to the server and be able to send and receive messages.

Messages sent by one client will be broadcasted to all connected clients in real-time.

Implementation Details:

##Server:

The server uses ServerSocket to accept incoming client connections. Each client is handled in a separate thread to manage concurrent interactions. The server maintains a list of active clients and broadcasts messages to all connected clients.

##Client:

The client uses Socket to connect to the server. It includes a graphical interface built with Java Swing and AWT for sending and receiving messages. Each client runs in its own thread to handle incoming messages asynchronously.

##Threads and I/O:

The application uses threads to handle multiple clients concurrently. BufferedReader and BufferedWriter are used for reading from and writing to sockets.


Feel free to modify the content according to your preferences or add any additional information relevant to your project.

##Contact:

For any questions or inquiries, please contact me-

     ashishwayachal14@gmail.com.




