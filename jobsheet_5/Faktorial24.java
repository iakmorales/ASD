package jobsheet_5;

public class Faktorial24 {
    
    //int faktorialBF(int n){
        //int fakto = 1;
        //for(int i=1; i<=n; i++){
            //fakto = fakto * i;
        //}
        //return fakto;
    //}

    int faktorialBF_while(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) { 
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }    

    int faktorialBF_doWhile(int n) {
        int fakto = 1;
        int i = 1;
        do {
            fakto = fakto * i;
            i++;
        } while (i <= n);
        return fakto;
    }
  
    int faktorialDC(int n){
        if(n==1){
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
