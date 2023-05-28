// public class If_then{
//     public static void main(String[] args) {
//         // int newValue = 50;
//         // if(newValue == 50){
//         //     System.out.println("This is an error");
//         // }

//         // boolean isCar = false;
//         // if(isCar == true){
//         //     System.out.println("This is not supposed to happen");
//         // }

//         // String makeOfcar = "Maruti";
//         // boolean isDomestic = makeOfcar == "Maruti" ? false : true;

//         // if(isDomestic){
//         //     System.out.println("This car is domestoic to our country");
//         // }
//         // else{
//         //     System.out.println("This is not from our country");
//         // }

//         int ageOfClient = 20;
//         String ageText = (ageOfClient >= 18) ? "Over Eitheen" : "Still a kid";
//         System.out.println("Our client is " + ageText);
//     }
    
// }

/*  Step 1:  create a double variable with a value of 20.00.
    Step 2:  create a second variable of type double with a value 80.00.
    Step 3:  add both numbers together, then multiply by 100.00.
    Step 4:  use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00, will be.
    Step 5:  create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero.
    Step 6:  output the boolean variable just to see what the result is. 
    Step 7:  write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true.
 */
class If_then{
    public static void main(String[] args) {
        double firstValue = 20.00d, secondValue = 80.00d;

        double sumOfValues = (firstValue + secondValue) * 100.00d;
        System.out.println(sumOfValues);

        double theRemainder = sumOfValues % 40.00d;
        System.out.println("theRemaonder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println(isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
     }
}