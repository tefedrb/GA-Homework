---
title: OOP Review
type: Homework
duration: "1:00"
creator:
    name: Charlie Drews
---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) OOP Review

## Requirements

Respond to the following questions based on what we've learned (and maybe what we haven't covered yet).

---

## Questions

1. What's the difference between **member variables** (also called **instance variables**) and **class variables** (with the `static` keyword)? Which can be accessed without creating an instance of the class?

Member variables (fields) within an object (AKA instance variables (fields)) are unique variables with values that are only available on the respective instance of a class (although they are usually part of the instantiation from it's class). If member variables are changed they remain unique to that instance only. Class variables, however, persist throughout every instance of a class. So once you change class variables on any instance, they change on every instance. 


2. Does it make sense to write **getter** and **setter** methods for a `public` member variable? What about `private` variables?

I doesn't make sense to write getter or setter methods for a member variable set to public - they are already accesible via dot notation. Private variables, however, are hidden and can only be accessed by outside code via getters and setters.

3. What are some benefits of making member variables `private`?

Making variables private is part and parcel to the concept of encapsulation - they need to be more explicity accessed via methods (getters and setters) which adds a layer of protection. This also helps manage complexity - if things go wrong there are more contained areas to check - the object itself.

4. If Class A extends Class B, which is the superclass and which is the subclass? Which would you call the parent, and which would you call the child?

Class B is the superclass and Class A is the subclass. Class B is therefore the parent, and Class B is the child.

5. What does it mean for a class to **inherit** methods or variables (or both) from its parent class?

When a class inherits methods or variables from it's parents class, those methods and variables are either shared or have unique copies of them for that child classes use.

6. Consider the following code, where the `Refrigerator` class extends the `Appliance` class, and `getTemperature()` is a method in `Refrigerator`, but **not** in `Appliance`:

    ```
    Appliance myAppliance = new Refrigerator();
    double temperature = myAppliance.getTemperature();
    ```

   Why will this call to `getTemperature()` cause an error? How will **casting** help solve this issue?
   
   This is causing an error because Appliance does not have a .getTemperature() method and your instantiating a new Refrigerator from that class. Downcasting to a refrigerator class (allowing your instance to pick up its methods) like ((Refrigerator) myAppliance).getTemp...
   will solve the issue.

7. In a normal class (also called a **concrete** class), do you need to **implement** all the methods, or can you simply **declare** some? What about in an `abstract` class?
With a concrete class you have to implement your methods, an abstract class only allows for method declaration.

8. What about an `interface`? Can you implement any methods in an `interface`? Can you declare methods in an `interface`?
Default methods can be implemented, however in general all methods are abstract unless explicity changed, meaning you can't implement them.

9. Can you create an instance of an `abstract` class? Also, look up the Java keyword `final` and see if you can explain why a class **cannot** be both `abstract` and `final`.
You cannot make an instance of an abstract class. They serve the purpose of being a foundation for subclasses. You cannot create a subclass from a class that is 'final'.

10. What happens when a method **overrides** another method? If parent and child classes have methods with the same name, when you call that method on an instance of the child class, which implementation of the method will be executed?

When you override a method while subclassing you are creating a unique version for that class. When you call that method on an instance of that subclass, you'll get that unique implementation that you created by overriding it's parents method.

11. What's the relationship between `List`, `LinkedList`, and `ArrayList`? Why do we call a method **polymorphic** if it takes an input of type `List` rather than an input of type `LinkedList` or `Arraylist`? Why is that useful?

LinkedList and ArrayList both implement List. A method is polymorphic when it takes an input of type 'List' because LinkedList and ArrayList can pass through that input since they implement List (they are, in a sense, iterations of a List).
### Deliverable

This file, with your answers added.

---

## Additional Resources

Refer to the "Classes and Objects" lesson, the "Subclasses" lesson, and the "Abstract Classes and Interfaces" lesson.

Feel free to do a Google search for these concepts as well. There are plenty of Java tutorial websites and Stack Overflow posts that can help you. But be sure to write up your answers in your own words — copying and pasting some text does **not** help you actually learn (and is, in fact, cheating).
