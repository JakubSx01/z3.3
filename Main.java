import java.util.*;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    ArrayList<Integer> liczby = new ArrayList<Integer>();
    for(int i=0; i<100;i++){
      int numer = rand.nextInt(101)-50;
      liczby.add(numer);
    }
    System.out.println("Wylosowane liczby:");
    int l=0;
for(int k=10;k>0;k--){
  
      for(int j=0; j<10;j++){
          System.out.print(liczby.get(l)+" ");
        l++;}
          System.out.println();
          

}
  }
}