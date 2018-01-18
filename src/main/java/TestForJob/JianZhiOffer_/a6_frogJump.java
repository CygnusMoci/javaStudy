package TestForJob.JianZhiOffer_;

/**
 * @author moci
 * @create 2018-01-18 11:17 AM
 **/
public class a6_frogJump {
    public static void main(String[] args) {
        for (int n = 1; n <20; n++) {

            System.out.println(JumpFloor(n)+" "+new a5_Fibonacci().Fib(n));
        }
    }

    public static int JumpFloor(int target){
        if(target<=2) return 1;
        int result = 0 ;
        int n = target/2;
        for (int i = 0; i <=n; i++) {
            result = result + Cnk(i,target-i);
        }
        System.out.print(target+" "+n +" ");
        return result;
    }

    public static int Cnk(int up,int down){
        if (down<up) return 0;
        int U =1;
        int D = 1;
        for (int i = 0; i <up; i++) {
            U  = U*(down-i);
        }
        for (int i = 1; i <=up; i++) {
            D = D*i;
        }
        return U/D;
    }
}
