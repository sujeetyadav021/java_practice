package opps;



/**
 *  Person
 */
 class Person {

    String name;
    double age;
    double weight;
    long phoneNo;
    
    Person(String n,double ageOFPerson,double weightofPerson,long phone){
        name=n;
        age=ageOFPerson;
        weight=weightofPerson;
        phoneNo=phone;


    }
}

public class Constructor_in_java {
    public static void main(String[] args) {
        Person p1 = new Person("Sujeet",24,75,98454);
        System.out.println(p1.name);
    }
}