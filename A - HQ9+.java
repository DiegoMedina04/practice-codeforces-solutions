import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String checkWord = "HQ9";
        boolean flag = false;
        String word = sc.next();
        for (int i=0; i<word.length(); i++){
            if(checkWord.contains(String.valueOf(word.charAt(i)))) {
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}