import java.util.*;
class Main {
  public static void main(String[] args) {
    int max=50;
      int min=-50;
    int range=max-min+1;
    int rand = (int)(Math.random() * range) + min;
     int k=10;
    char znak='#';
for(int i=k;i>=0;i--){
      for(int j=0; j<=k;j++)
          System.out.print(rand);
          System.out.println();
}
  }
}