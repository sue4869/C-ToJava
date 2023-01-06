import java.util.Scanner;
  
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().split(" ", 0);
    int max = 0;
    String maxStr ="";
    for(String s : str) {
        if(max < s.length()) {
            max = s.length();
            maxStr = s;
        }
    }

    System.out.print(maxStr);
    return ;
  }
}
