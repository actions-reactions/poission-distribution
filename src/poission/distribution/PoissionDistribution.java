/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poission.distribution;

/**
 *
 * @author Al-amin
 */
public class PoissionDistribution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double Px;
        int x, a;
        
        final double e=2.72;
    

        Px=(Math.pow(a,x)*Math.pow(e,-a))/PoissionDistribution.fact(x);
       
        
        
    }
    
        public int fact(int n){
        int fact=1, i;
        for (i=1;i<=n;i++){
           fact=fact*i;
        }
        return fact;
    }
    
    
}
