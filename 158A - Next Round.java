import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int cont=0;
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] score= new int[n];
    for(int i=0; i<n; i++){
      score[i]=sc.nextInt();
    }
    int position =score[k-1];
    for(int i=0; i<score.length; i++){
      cont+=(score[i]>=position && score[i]!=0)?1:0;
      if(i==k-1)continue;
    }
    System.out.println(cont);
  }
}
