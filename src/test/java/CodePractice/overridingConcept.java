package CodePractice;

class Animal {}
class Dog extends Animal {}

class Parent {
    Animal getPet() {
        return new Animal();
    }
}

class Child extends Parent {
    @Override
    Dog getPet() {   // allowed: Dog is a subclass of Animal
        return new Dog();
    }
}