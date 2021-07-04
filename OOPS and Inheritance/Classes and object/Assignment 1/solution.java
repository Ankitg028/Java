/*
Create a class Box that uses a parameterized method to initialize the dimensions of a box.(dimensions are width, height, depth of double type). 
The class should have a method that can return volume. 
Obtain an object and print the corresponding volume in main() function.
**/

class solution {
    public static void main(String[] args) {
        Box b1 = new Box(2,2,5);
        System.out.println("Volume of Box: "+b1.volume());
    }
}

/**
 * Box
 */
class Box {
    double width,height,depth;
    Box(double w, double h, double d){
        height = h;
        width  = w;
        depth = d;
    }

    public double volume() {
        return height*width*depth;
    }
    
}
