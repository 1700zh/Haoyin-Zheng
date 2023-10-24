package edu.neu.mgen;
import java.util.ArrayList;
import java.util.Arrays;

public class lab1 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    

//Part 1
    int[] x = {3,7,8,29,1};
    int[] y = {63,2,48,9,36};
    int[] xy = {x[0],x[1],x[2],x[3],x[4],y[0],y[1],y[2],y[3],y[4]};//put elements together
   
    Arrays.sort(xy); //sort the elements from min to max
    
    int l =  xy.length;//find the position of the biggest value
   
    int[] z = {xy[l-1],xy[l-2],xy[l-3],xy[l-4],xy[l-5]};//creat array z

    System.out.println("Array x = " + Arrays.toString(x));
    System.out.println("Array y = " + Arrays.toString(y));
    System.out.println("Array z = x+y =" + Arrays.toString(z));

//Part 2

    ArrayList<String> names = new ArrayList<String>();
        names.add("Steve");
        names.add("Tom");
        names.add("Julia");
        names.add("Jax");
        names.add("Jeff");
    
    System.out.println("Names =" + names);

        names.set(0,"Etevs");
        names.set(1,"Mot");
        names.set(2,"Aulij");
        names.set(3,"Xaj");
        names.set(4,"Fefj");
    System.out.println("Names (switched) =" + names);






    }
}
