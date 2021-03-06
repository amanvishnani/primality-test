/**
 * Created by Aman on 1/22/2017.
 */
public class prime4 extends com.amanvishnani.utility {
    public static long isPrimeFunctionComputations=0;
    public static void main(String[] args) {
        computeTenThousand();
        computeHundredThousand();
        computeMillion();
        computeTenMillion();
    }


    public static boolean isPrime(long number)
    {
        if(number % 2 ==0)
            return number==2;
        else
            for (long i=3; i<=Math.sqrt(number); i=i+2)
            {
                if(number%i==0)
                    return false;
                isPrimeFunctionComputations++;
            }
        return true;
    }

    public static void compute(long x)
    {
        long max = x, startTime, totalPrime=1, totalComputations=0;
        startTime=System.currentTimeMillis();
        for(long i=3; i<max; i=i+2)
        {
            if(isPrime(i))
            {
                totalPrime++;
            }
            totalComputations++;
        }
        long endTime =System.currentTimeMillis();
        totalComputations= totalComputations+isPrimeFunctionComputations;
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
    public static void computeTenMillion(){
        compute(10000000);
    }
}

/*
*
*                   -: First Run :-
*
* =====================> Range = 10000 <======================
* Total Primes = 1229
* Total Computations = 57186
* Total Time Required for Computations = 0ms
* =====================> Range = 100000 <======================
* Total Primes = 9592
* Total Computations = 1355033
* Total Time Required for Computations = 16ms
* =====================> Range = 1000000 <======================
* Total Primes = 78498
* Total Computations = 33679057
* Total Time Required for Computations = 453ms
*
* =====================> Range = 10000000 <======================
* Total Primes = 664579
* Total Computations = 871103734
* Total Time Required for Computations = 10.941S
*
*
* */