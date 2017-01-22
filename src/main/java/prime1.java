/**
 * Created by Aman on 1/22/2017.
 */
public class prime1 extends com.amanvishnani.utility {
    public static long isPrimeFunctionComputations=0;
    public static void main(String[] args) {
        computeTenThousand();
        computeHundredThousand();
        computeMillion();
    }


    public static boolean isPrime(long number)
    {
        if(number % 2 ==0)
            return number==2;
        else
            for (long i=3; i<number; i++)
            {
                if(number%i==0)
                    return false;
                isPrimeFunctionComputations++;
            }
        return true;
    }

    public static void compute(long x)
    {
        long max = x, startTime, totalPrime=0, totalComputations=0;
        startTime=System.currentTimeMillis();
        for(long i=2; i<max; i++)
        {
            if(isPrime(i))
            {
                totalPrime++;
            }
            totalComputations++;
        }
        long endTime =System.currentTimeMillis();
        totalComputations= totalComputations+totalPrime;
        log("=====================> Range = "+max+" <======================");
        log("Total Primes = " + totalPrime);
        log("Total Computations = " + totalComputations);
        long elapsedTime =endTime-startTime;
        log("Total Time Required for Computations = " + (elapsedTime>1000 ? (((double)elapsedTime/1000)+"S") : (elapsedTime + "ms")));
        totalComputations = 0;
        isPrimeFunctionComputations=0;
    }
    public static void computeTenThousand()
    {
        compute(10000);
    }
    public static void computeHundredThousand(){
        compute(100000);
    }

    public static void computeMillion(){
        compute(1000000);
    }
}

/*
*                          OUTPUT
*
* =====================> Range = 10000 <======================
* Total Primes = 1229
* Total Computations = 11227
* Total Time Required for Computations = 72ms
* =====================> Range = 100000 <======================
* Total Primes = 9592
* Total Computations = 109590
* Total Time Required for Computations = 4.755S
* =====================> Range = 1000000 <======================
* Total Primes = 78498
* Total Computations = 1078496
* Total Time Required for Computations = 384.175S
*
*
*/