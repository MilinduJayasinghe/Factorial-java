
package factorial;

public class Factorial {

  
   
  public static int CalculateFactoril(int N){
      if (N == 0) {
          return 1;
          
        }else{
          return(N *  CalculateFactoril(N-1));
      }
  }
    public static void main(String[] args) {
        System.out.println( CalculateFactoril(3));
        System.out.println( CalculateFactoril(5));
        System.out.println( CalculateFactoril(7));
        
    }
    
}
