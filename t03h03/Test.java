public class Test {
  int age;
  String name;

 public static void main(String[] args){
  Test t1 = new Test();
  t1.age = 10;
  t1.name = "Bill";

  System.out.println(t1.toString());
  
 }

 public String toString(){
  return "Name: " + name + "\n" + "Age: " + age;
 }

}