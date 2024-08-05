class Animal{
    int legs;
    double  brainSize;

    Animal(int legs, double brainSize){
        this.legs=legs;
        this.brainSize=brainSize;
    }

    void sound(){
        System.out.println("Which animal; sound you want ?");
    }

}

class Lion extends Animal{

    Lion(int legs, double brainSize){
         super(legs, brainSize);
         this.legs=5;
    }

    void sound()
    {
        System.out.println("Lion roar!!roar!roar!!");
    }

}

class Elephant extends Animal{
    Elephant(int legs, double brainSize){
        super(legs, brainSize);
   }
    void sound(){
    
        System.out.println("Elephant Pawaa! Pawaa!!");
    }

}

class Cow extends Animal{

    Cow(int legs, double brainSize){
        super(legs, brainSize);
   }
    void sound(){
        System.out.println("Cow moo moo");
    }
 
}

class Goat extends Animal{

    Goat(int legs, double brainSize){
        super(legs, brainSize);
   }

    void sound(){
        System.out.println("Goat baa!baa!baa");
    }

}

public class Exp1_oops {
    public static void main (String args[]){
        Animal animal = new Animal(4, 1);
        Lion lion = new Lion(4, 5);
        lion.sound();

    }
}
