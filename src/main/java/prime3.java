/**
 * Created by Aman on 1/22/2017.
 */
public class prime3 extends com.amanvishnani.utility {
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
            for (long i=3; i<=Math.sqrt(number); i++)
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
}

/*
*
*                      -: First Run :-
*
* =====================> Range = 10000 <======================
* Total Primes = 1229
* Total Computations = 113757
* Total Time Required for Computations = 0ms
* =====================> Range = 100000 <======================
* Total Primes = 9592
* Total Computations = 2705287
* Total Time Required for Computations = 47ms
* =====================> Range = 1000000 <======================
* Total Primes = 78498
* Total Computations = 67318903
* Total Time Required for Computations = 1.109S
*
*
* */