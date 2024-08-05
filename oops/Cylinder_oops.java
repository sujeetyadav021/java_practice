class Cricle{
    double radius;
    Cricle(double radius){
        if(radius < 0 ){
           this.radius=0 ;
        }
        else{
        this.radius=radius;
        }
    }
    
    double getradius(){
        return this.radius;
    }

    double getArea(){
        double area = (this.radius*this.radius*Math.PI);
        return area;
    }
}
class Cylinder extends Cricle { 
    double height;

    Cylinder(double radius,double height){
        super(radius);
        if ((height<0)) {
            this.height=0;
        }
        else{
            this.height=height;
        }
    }

    double getHeight(){
        return this.height;
    }
    double getVolume(){
        double volume=this.height*getArea();
        return volume;
    }
}

public class Cylinder_oops{
    public static void main (String args[]){
        Cricle circle = new Cricle(5.0);
        System.out.println(circle.getArea());
        Cylinder cyl = new Cylinder(5, 5);
        System.out.println(cyl.getVolume()); 

    }
    
}
