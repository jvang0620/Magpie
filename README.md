# Magpie Chatbot

This project implements a simple chatbot named Magpie. The chatbot responds to user input with predefined responses based on certain keywords or phrases. It also includes a set of random responses for general conversation when no specific keywords are detected.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Setup](#setup)
- [Usage](#usage)
- [How It Works](#how-it-works)
- [Future Enhancements](#future-enhancements)
- [License](#license)

## Overview

The Magpie Chatbot project showcases basic natural language processing concepts and response generation based on user input. It engages users in a text-based conversation, responding with different messages depending on what the user types.

## Features

- Responds to specific keywords such as "mother", "brother", "dog", "cat", "park", and more.
- Handles various combinations of keywords to give unique responses.
- Includes a set of random fallback responses when no specific keywords are found.
- Simple greeting and closing messages to start and end the conversation.
- Repeatedly engages the user until they choose to exit by typing "Bye".

## Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE or command-line environment for running Java programs

### Installation

1. Clone the repository or download the source code.
2. Compile the Java files:
   ```bash
   javac src/Magpie.java src/MagpieDriver.java
   ```
3. Run the program:
   ```bash
   java src.MagpieDriver
   ```

## Usage

1. When you run the program, the chatbot will greet you with a welcome message:
   ```
   Hello, let's talk.
   ```
2. Enter any message to start the conversation.
3. The chatbot will respond based on the keywords detected in your message. For example:
   - **User**: "Tell me about my mother."
   - **Magpie**: "Tell me more about your mother."
4. The conversation will continue until you type "Bye", at which point the program will terminate with a closing message:
   ```
   Goodbye!
   ```

## How It Works

The program consists of two main classes:

### `Magpie`

- This class contains the logic for generating responses based on user input.
- The `getGreeting()` method returns a default greeting message.
- The `getResponse(String statement)` method generates responses based on the content of the user's input. It checks for specific keywords like "mother", "brother", "dog", "cat", "wife", "Starbucks", and more.
- The `getRandomResponse()` method provides a fallback set of generic responses if no specific keywords are detected in the user's statement.

### `MagpieDriver`

- The `MagpieDriver` class handles user interaction with the chatbot.
- It creates an instance of the `Magpie` class and uses a `Scanner` object to read user input.
- It repeatedly prompts the user for input and prints the chatbot's responses until the user types "Bye".

  ### Example Conversation

  ```
  **************************** START ******************************* Hello, let's talk. User: Do you like dogs? Magpie: Tell me more about your pets. User: What is the nearest Starbucks? Magpie: The nearest Starbucks is in the Student Union 0.5 miles away. User: Bye. Goodbye! **************************** END *******************************
  ```

## Future Enhancements

Possible improvements to this project include:

- **Enhanced keyword detection**: Use more advanced natural language processing (NLP) techniques to better understand user input.
- **Additional responses**: Expand the keyword-response library to cover more topics and variations of user statements.
- **Conversation memory**: Implement a way for the chatbot to remember previous interactions and respond based on conversation history.
- **User-defined responses**: Allow users to customize the responses for specific keywords.

## License

This project is open-source and available under the [MIT License](LICENSE).

## Author

Jai Vang
