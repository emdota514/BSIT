
import java.util.Scanner;


public class Sullano2 {
        public static void main (String[] args){
{
        
        Scanner input = new Scanner (System.in);
        double toppings=1.50,tax =0.05,pizzas=12.00 ; 

        double  numbertoppings,numberpizzas,total,pinal1,pinal2 ,pinal3,finale; 
        
        System.out.print("Enter the number of pizzas:");
        numberpizzas = input.nextDouble();
        System.out.print("Enter the number of toppings:");
        numbertoppings = input.nextDouble();
            
        total = numberpizzas * pizzas ; 
        pinal1 = numbertoppings * toppings ; 
        pinal2 = pinal1 + total ; 
        pinal3 = pinal2 * tax ;
        finale = pinal3 + pinal2 ; 
            
        System.out.println("Receipt Numebr of pizzas:" + numberpizzas);
        System.out.println("Number of Toppings:" + numbertoppings);
        System.out.printf("Cost (include tax ): %.2f" , finale) ;
            
            
       
        
}           
}  
}     
            
        
   
    
                   