// import  java.io.*;
 class Overloading {
     
    void subtract(int x, int y)  
    {  
        System.out.println(x-y);  
    }  
    void subtract(int x, int y, int z)  
    {  
        System.out.println(x-y-z);  
    }  
    void subtract(int x, int y, int z, int w)  
    {  
        System.out.println(x-y-z-w);  
    }  
    public static void main(String[] args)  
    {  
         Overloading sn = new Overloading();
        sn.subtract(20, 10);  
        sn.subtract(60, 30, 10);     
        sn.subtract(90, 30, 20, 10);  
    }  
} 
