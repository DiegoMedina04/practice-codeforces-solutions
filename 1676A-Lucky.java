import java.util.*;
public class Main {
  public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);   
    int numTickets= sc.nextInt();
    while(numTickets-- >0){
      int sum1=0, sum2=0;
      String tickets=sc.next();
      char[] ticketsArray= tickets.toCharArray();
      for(int i=0; i<ticketsArray.length/2; i++){
        sum1+=ticketsArray[i];
        sum2+=ticketsArray[i+3];
      }
      if(sum1==sum2){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
    }
  }
}