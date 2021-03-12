import com.module12.*;

import com.module3.*;

// public class App {
//     public static void main(String[] args) throws Exception {
//         Room newRoom= new Room();
//         newRoom.setData(40, "MyRoom" , 50, 2);
//         newRoom.getData();

//         new SimpleObject();
//     }
// }




// public class App {
//     public static void getRef1(CallByRefVal a, CallByRefVal b) {
//         System.out.println("Before Using call by reference ref1 of a: "+Integer.toString(a.ref1)+" ref1 of b: "+Integer.toString(b.ref1)); 
//      }
//      public static void getRef1(CallByRefVal a, CallByRefVal b,int end){
//         System.out.println("After Using call by reference ref1 of a: "+Integer.toString(a.ref1)+" ref1 of b: "+Integer.toString(b.ref1)); 
//      }
//      public static void swapNumber(CallByRefVal a, CallByRefVal b){
//          CallByRefVal temp=new CallByRefVal(a.ref1);
 
         
//          a.ref1=b.ref1;
//          b.ref1=temp.ref1;
         
//          System.out.println("Call by reference within function swapping 2 numbers, a: "+a.ref1+" b: "+b.ref1 );
 
//      }
//     public static void swapByValue(int a, int b){
//         System.out.println("\nCall by value before swapping 2 numbers, a: "+a+" b: "+b );

//         int c=a;
//         a=b;
//         b=c;
//         System.out.println("Call by value within function swapping 2 numbers, a: "+a+" b: "+b );
        
//     }
//     public static void main(String[] args) throws Exception {
//         CallByRefVal a= new CallByRefVal(15);
//         CallByRefVal b= new CallByRefVal(20);


//         getRef1(a, b);

//         swapNumber(a, b);

//         getRef1(a, b, 10);

//         swapByValue(a.ref1, b.ref1);
//         System.out.println("Call by value after swapping 2 numbers, a: "+a.ref1+" b: "+b.ref1 );

//     }
// }

// public class App {
//     public static void main(String[] args) throws Exception{
//         ThisExample exmp=new ThisExample();
//         exmp.setAB("10", "20");
//         ThisExample exmp2=exmp.returnThis();
//         System.out.println("The new instance of ThisExample returns the previous instance a: "+exmp2.getA()+" b: "+exmp2.getB());

//     }
    
// }


// public class App {
//     public static void main(String[] args) throws Exception{
//         ConvertUppercase exmp1=new ConvertUppercase(7);
//         try {
//             exmp1.printUpperCase("abcdef");
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
    
// }



// public class App {
//     public static void main(String[] args) throws Exception{
//         FileOutputExample exmp = new FileOutputExample("F:\\work\\Java_Assignment\\Assignment1\\assignment1\\src\\output.txt");
//         exmp.writeFile("Example for file output");
//         exmp.close();
//     }
    
// }
