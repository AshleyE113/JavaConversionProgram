import java.util.HashMap;
import java.util.Scanner;
import jaba.lang.Math;

public class Conversion_work
{
    public static int binary_to_octal(int binary)
    {
        /*
        int octal = 0; 
        int decimal = 0;
        String bin_str = String.valueOf(binary);
        String deci_str = String.valueOf(decimal);

        for (int i = 0; i<bin_str.length(); i++){

            decimal += (binary%10) * Math.pow(2,i);
            binary/=10;
        }

        for(int i = 0; i < deci_str.length(); i++){
            
            decimal /= 8;
            i *= 10;
            octal += (decimal % 8) * i;
            
        }
        return octal;
        //*/
        /*int octal = 0, decimal = 0, i = 0;

        while(binary != 0)
        {
            decimal += (binary%10) * Math.pow(2,i);
            ++i;
            binary/=10;
        }

            i = 1;

        while (decimal != 0)
        {
            octal += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }*/

            //return octal;
    }

    public static void main(String[] args)
    {
       //binary to octal, decimal, or hexidecmal

       //binary -> deci -> hex
       
       //binary to octal

       //bin -> deci -> octal
       //System.out.print(binary_to_octal());
//_______________________________________________________________________________________
       //binary to decimal
       /*int binary = 1111;
       int pwr = 0;
       int deci_num = 0;
       while (binary != 0){
           int rem = binary % 10;
           deci_num = deci_num + (int)(rem*Math.pow(2, pwr));
           pwr++;
           binary = binary/10;
       }
       
       System.out.println(deci_num);
       */
    //_____________________________________________________________________



       // to octal. Octal has 3 numbers

//_______________________________________________________________________________________
//_______________________________________________________________________________________

       //octal to binary, decimal, or hexidecimal
       //Octal to hexidecimal
       String oct = "1234";
       String hex_val = "";
       int deci_num = 0;

       deci_num = Integer.parseInt(oct, 8);
       hex_val = Integer.toHexString(deci_num);
       //Octal -> deci -> hex
       //octal to binary
       /*
       int oct = 101;
       int i = 0;
       int deci_num = 0;
       int bin_val = 0;

       while (oct != 0){
           deci_num +=(oct%10) * Math.pow(8, i);
           i++;
           oct/=10;
       }
       
       i = 1;

       while (deci_num != 0){
           bin_val += (deci_num %2) *i;
           deci_num /=2;
           i*=10;
       }
       System.out.print(bin_val);
       */
//_______________________________________________________________________________________

       //Octal to decimal

       int num = 123; 
       int deci_num = 0; 
 
       // Initializing base value to 1, i.e 8^0 
       int base = 1; 
 
       int store = num; 
       while (store > 0) { 
           // Extracting last digit 
           int last_digit = store % 10; 
           store = store / 10; 
 
           // Multiplying last digit with appropriate 
           // base value and adding it to dec_value 
           deci_num += last_digit * base; 
 
           base = base * 8; 
       }
       System.out.println(deci_num);

//_______________________________________________________________________________________
//_______________________________________________________________________________________

       //hex to binary, decimal, or octal?
       //hex to binary

       //hex -> deci -> binary

       /*
       //hex to octal

       - hex -> deci -> octal
       */


       //Hex to deci
       //Remember to have if elses or switch for A-F.
       /*
       int hex_num = 10;
       int rem = 0;
       int deci_num = 0;
       int i = 0;

       while (hex_num !=0){
           rem = hex_num %10;
           deci_num = (int) (deci_num + rem * Math.pow(16, i));
           hex_num = hex_num/10;
           i++;
       }
       System.out.println("Decimal num: " + deci_num);
       */
//_______________________________________________________________________________________
//_______________________________________________________________________________________
       //decimal to binary, octal, or hexidecmal?
       /*
       //Decimal to binary
       //int num; //for user unput
       int test1 = 2;
       int i = 0;

       int[] binary = new int[100];
       while (test1 != 0){

        binary[i] = test1 % 2;
        test1= test1/2;
        i++;
       }       

       for (int rev = i; rev >=0; rev--){
           System.out.print(binary[rev]);
       }
       */
    //_______________________________________________________________________________________

      //deciml to octal
      /*
        int deci_num = 14;
        int i = 0;
        int store;
        String store_str;
        int octs[] = new int [100];
        int ans = 0;

        store = deci_num;
        //System.out.print(store);
        while(store != 0){

            octs[i] = store % 8;
            store = store/8;
            i++;
        }

        for (int j = i-1; j>=0; j--){
            if (deci_num > 9){

                store_str = String.valueOf(octs[j]); //Remove the extra 0

                System.out.print("0" + store_str);
            } else{

                System.out.print("00" + octs[j]);

            }
            
        }
        //System.out.print("octal val of" + deci_num) + " is " + );
        */
        //_______________________________________________________________________________________
        //Deci to hex
        /*
        int deci_num = 9;
        int rem;
        int store = deci_num;
        String display = "";
        char[] hex_vals = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (deci_num > 0){
            rem = deci_num%16;
            display = hex_vals[rem] + display;
            deci_num = deci_num/16;
        }
        if (store <10){

            System.out.println("Hex val: 000"+ display);
        } else{
            System.out.println("Hex val: "+ display);

        }
        */
        


//SAVING
public static void conversion_options()
{
    
    if (start_point.equals("binary"))
        {   
            System.out.println("Would you like to convert it to octal, decimal, or hexadecmal?");
            String go_to = convert_to.nextLine();

            if (go_to.equals("octal")){

                System.out.println(bin_to_oct(to_convert)); //WORKS!
                

            } else if (go_to.equals("hexadecimal")){
                System.out.println(bin_to_hex(to_convert)); //WORKS

            } else{
                System.out.println(bin_to_deci(to_convert)); //WORKS!
            }
        //___________________________________________________________________        

        } else if (start_point.equals("octal")){
    
            System.out.println("This is an octal number. Would you like to convert it to binary, decimal, or hexadecmal?");
            String go_to = convert_to.nextLine(); 
            //Try these
            if (go_to.equals("binary")){

                System.out.println(octal_to_bin(to_convert)); //WORKS

            } else if (go_to.equals("hexadecimal")){
                System.out.println(octal_to_hex(to_convert)); //WORKS

            } else{
                System.out.println(octal_to_deci(to_convert)); //WORKS
            }
        //___________________________________________________________________        
        } else if (start_point.equals("hexadecimal")){
        
            System.out.println("This is an hex number. Would you like to convert it to binary, decimal, or octal?");
            String go_to = convert_to.nextLine();

            if (go_to.equals("binary")){

                System.out.println(hex_to_bin(to_convert)); //WORKS!

            } else if (go_to.equals("octal")){
                System.out.println(hex_to_oct(to_convert)); //WORKS!

            } else{
                System.out.println(hex_to_deci(to_convert)); //WORKS!
            }

        //___________________________________________________________________        

        }else{
            System.out.println("This is an decimal number. Would you like to convert it to binary, octal, or hexadecmal?");
            String go_to = convert_to.nextLine();

            if (go_to.equals("octal")){

                System.out.println(deci_to_octal(to_convert)); //WORKS!

            } else if (go_to.equals("hexadecimal")){
                System.out.println(deci_to_hex(to_convert)); //WORKS!

            } else{
                System.out.println(deci_to_bin(to_convert)); //WORKS!
            }

        }

    
    //*/ 
}