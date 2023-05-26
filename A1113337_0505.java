import java.util.*;

public class A1113337_0505 {
   public static void main(String[] argv){

   int sum_pork = 5000;
   int sum_beaf = 3000;
   int sum_vege = 1000;

   Random rnd = new Random();
   Scanner sc = new Scanner(System.in);

   System.out.print("請輸入顧客的人數:");
   int i = sc.nextInt();

   double[] customers;
   customers = new double[i];

   int SUM = 0;
   int sum = 0;
   
   for(int a  = 0; a < customers.length; a++){
      customers[a] = rnd.nextInt(41) + 10;
      int random = rnd.nextInt(3);

      SUM += customers[a];

      if(random == 0){
         sum_pork -= customers[a]; 
         if(sum_pork <= 0){
            System.out.println("今天的豬肉水餃全部售完");
            break;
            
         }

      }else if(random == 1){
         sum_beaf -= customers[a];
         if(sum_beaf <= 0){
            System.out.println("今天的牛肉水餃全部售完");
            break;
         }

      }else if(random == 2){
         sum_vege -= customers[a];
         if(sum_vege <= 0){
            System.out.println("今天的蔬菜水餃全部售完");
            for(int A = a; A < customers.length; A++){             

               customers[A] = rnd.nextInt(41) + 10;
               int random1 = rnd.nextInt(2);

               SUM += customers[A];            
               
               if(random1 == 0){
                  sum_pork -= customers[A];

                  if(sum_pork <= 0){
                     System.out.println("今天的豬肉水餃全部售完");
                     for(int A1 = A; A1 < customers.length; A1++){

                        customers[A1] = rnd.nextInt(41) + 10;
                        sum_beaf -= customers[A1];
                        SUM += customers[A1];
                        sum = A1;
                                              
                        if(sum_beaf <= 0){
                           System.out.println("今天的牛肉水餃全部售完");
                           System.out.println("今天的水餃全部都售完了,謝謝光臨");
                           break;
                        }
                     }
                     break;
                  }
               }
               
               if(random1 == 1){
                  sum_beaf -= customers[A];

                  if(sum_beaf <= 0){
                     System.out.println("今天的牛肉水餃全部售完");
                     for(int A1 = A; A1 < customers.length; A1++){
                                                
                        customers[A1] = rnd.nextInt(41) + 10;                    
                        sum_pork -= customers[A1];
                        SUM += customers[A1];
                        sum = A1;
                                                  
                        if(sum_pork <= 0){
                           System.out.println("今天的豬肉水餃全部售完");
                           System.out.println("今天的水餃全部都售完了,謝謝光臨");
                           
                           break;
                        }
                     }
                     break;
                  }
               }
            }
            break;
            }
         }
      }
   
      System.out.println("average:"+SUM/sum);
   
   System.out.println(sum_beaf);
   System.out.println(sum_pork);
   System.out.println(sum_vege);

   }
}