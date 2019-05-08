import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args){
        int i;
        Fibonacci fibonacci = new Fibonacci();
        for(i=1;i<=200;i++){
            System.out.println("第"+i+"个fibonacci数字："+fibonacci.of(i));
        }
    }
    public BigInteger of(int x){
        int i;
        BigInteger finonacci[] = new BigInteger[x];
        BigInteger last=BigInteger.valueOf(1);
        if(x>2){
            finonacci[0]=BigInteger.valueOf(1);
            finonacci[1]=BigInteger.valueOf(1);
            for(i=2;i<x;i++){
                finonacci[i]=finonacci[i-1].add(finonacci[i-2]);
            }
            last=finonacci[x-1];
        }else{
            last=BigInteger.valueOf(1);
        }
        return last;
    }
}
