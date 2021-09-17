
package cryptographyvalidatealpha;

/**
 *
 * @author Diana Paola
 */
public class CryptographyValidateAlpha {
    
    public CryptographyValidateAlpha(){
        
    }
    
    int GCD(int num1, int num2){
        int x, y, remainder = 1;
        x = num1;
        y = num2;
        
        if(num2 > num1){
            x = num2;
            y = num1;
        }         
        while(y > 0){
            remainder = x % y;
            x = y;
            y = remainder;
        }
        return remainder;
    }
    
    public boolean alphaIsValid(int alpha, int n){
        if(GCD(alpha, n) == 1){
            return true;
        }else
            return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
