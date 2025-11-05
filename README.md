This project contains the implementation of creational design patterns.

1. Singleton Pattern
2. Factory Method Pattern
3. Builder Pattern
4. Prototype Pattern
5. Abstract Factory Pattern
6. Singleton Pattern - Lazy Initialization
7. Singleton Pattern - Enum based


**1. Singleton Pattern**
Singleton Pattern is used to allow creation of only one instance of a class. It disables creating multiple instances of the same class. Once an instance object is created, all the other classes which want to refer to that class should use that single object/instance to access the class.

Usage:
- When creating database connections where the same database is shared among multiple classes using a single connection string.



**2. Factory Method Pattern**
Factory pattern is used to encapsulate object creation logic, making code more flexible, and more easy to maintain. It hides the complexity of how an object is instantiated from the client code, allowing new types of objects to be added without changing existing client code. 

Usage:
- When a class cannot anticipate the class of objects it must create.
- When a class wants its subclasses to specify the objects it creates.
- When object creation logic is complex enough that it makes sense to abstract it away from the client.



**3. Builder Pattern**
The Builder pattern is a creational design pattern that separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

Usage:
- Complex Object Construction with Many Optional Parameters
- Separation of Construction Logic
- Creating Different Representations of the Same Object



**4. Prototype Pattern**
It involves creating new objects by copying or "cloning" an existing object, rather than creating new instances from scratch using constructors.

Usage:
- To reduce Overhead of Object Creation
- Simplify the process of creating multiple objects of the same type that share largely similar data or configuration.
- ex: creating game characters, document editors, user account management



**5. Abstract Factory Pattern**
It is used to create families of related objects without specifying their concrete classes, which promotes consistency and decoupling.

Usage:
- ensure that a family of related objects (e.g., a Windows UI button and a Windows checkbox) are created in a consistent and compatible manner.
- Decoupling client code
- Flexibility and extensibility



**6. Singleton Pattern - Lazy Initialization**
It is used to achieve a single instance of a class while deferring its creation until the instance is actually needed. By delaying instantiation, the application avoids allocating memory and other resources for the singleton until it is first accessed

Usage:
- if the Singleton instance is expensive to create
- To control the timing of initialization
- When thread safety is a concern for initialization



**7. Singleton Pattern - Enum based**
Ensure a class has only one instance, providing a thread-safe, robust, and concise solution that is immune to reflection and serialization vulnerabilities

Usage:
- Guaranteed Single Instance
- Thread Safety
- ex: logging systems, configuration manager, database connection pool





----------------------------------------------**The questions are as follows**----------------------------------------------


**Question 1 – Singleton Pattern (15 min)**
Implement a Logger class using the Singleton Pattern.
  • Only one instance of Logger should exist.
  • It should have a method log(String message) that prints a timestamped message.
  • Demonstrate that multiple calls return the same instance.
Hint: Use a private static Logger instance and getInstance().



**Question 2 – Factory Method Pattern (15 min)**
Create a Shape Factory using the Factory Method Pattern.
  • Define an interface Shape with draw().
  • Implement classes: Circle, Rectangle, and Square.
  • Create a ShapeFactory that returns the correct Shape object based on input.
  • In Main, create and draw different shapes.
Hint: The client should not use new directly for shape creation.



**Question 3 – Builder Pattern (20 min)**
Create a Builder for a Computer class.
  • Fields: CPU, RAM, storage, graphicsCard.
  • Use a static nested Builder class.
  • Demonstrate building two different configurations using method chaining.
Hint: Example:
  Computer gamingPC = new Computer.Builder()
  .setCPU("i9")
  .setRAM(32)
  .setStorage(1000)
  .setGraphicsCard("RTX 4080")
  .build();



**Question 4 – Prototype Pattern (20 min)**  
Implement the Prototype Pattern for a Document class.
  • The class should have fields like title and content.
  • Implement a clone() method that creates a deep copy.
  • Show that modifying the clone doesn’t affect the original.
Hint: Implement Cloneable and override clone() properly.



**Question 5 – Abstract Factory Pattern (25 min)**
Create an Abstract Factory for a UI theme system.
  • Define interfaces:
    o Button with paint()
    o Checkbox with check()
  • Implement two families:
    o LightThemeFactory (creates LightButton, LightCheckbox)
    o DarkThemeFactory (creates DarkButton, DarkCheckbox)
  • In Main, choose a theme (e.g., “light” or “dark”) and create UI elements from that factory.
Hint: Demonstrates how one factory can create related object families.



**Bonus Challenge (Optional – 10 min)**
Add a lazy initialization Singleton or use enum-based Singleton for better thread safety.
