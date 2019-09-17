import java.util.*;
class Dog extends Animal{
  public Dog(String name, int legs){
    this.name=name;
    this.legs=legs;
  }
  public String toString(){
    String tmp;
    tmp=this.name+""+Integer.toString(legs);
    return tmp;
  }
}
