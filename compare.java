/*Collections is a class full of static methods. Comparable is an interface
that has the compareTo method. Some objects implement comparable already. Comparable is in the
class youre comparing and has one parameter. Those that do not
need to have a comparator in order to sort those objects. You can also compare things in
different ways by writing your own comparator, similarly to writing your own iterator. Comparator
is in its own class and has two parameters.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Animal{
  String name;
  int legs;

}

class Dog extends Animal{
  public String toString(){
    String temp;
    temp=this.name+ " "+Integer.toString(legs);
    return temp;
  }

  public Dog(String name, int legs){
    this.name=name;
    this.legs=legs;
  }

  public static void main(String [] args){
    Collection<Dog>dogList = new ArrayList<>();
    dogList.add(new Dog("Max",3));
    dogList.add(new Dog("Fido",4));
    dogList.add(new Dog("Max",4));

    System.out.println(dogList);

    Collections.sort(dogList);

    System.out.println(dogList);

    Collections.sort(dogList, new AnimalCompare());

    System.out.println(dogList);
  }
}
class AnimalCompare implements Comparator<Animal>{
  public int compare(Animal no1, Animal no2){
    return no1.legs-no2.legs;
  }
}
