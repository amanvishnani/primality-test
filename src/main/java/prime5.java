/**
 * Created by Aman on 1/22/2017.
 */
public class prime5 extends com.amanvishnani.utility {
    public static long isPrimeFunctionComputations=0;
    public static void main(String[] args) {
        computeTenThousand();
        computeHundredThousand();
        computeMillion();
        computeTenMillion();
    }


    public static boolean isPrime(long number)
    {
        if(number == 2 ||number == 3)
            return true;
        else {
            for (long i = 1; (6 * i - 1) <= Math.sqrt(number); i++) {
                if ((6 * i - 1) <= Math.sqrt(number) && number % (6 * i - 1) == 0)
                    return false;
                if ((6 * i + 1) <= Math.sqrt(number)&& number % (6 * i + 1) == 0)
                    return false;
                isPrimeFunctionComputations++;
            }
        }
        return true;
    }

    public static void compute(long max)
    {
        long startTime, totalPrime=2, totalComputations=0;
        startTime=System.currentTimeMillis();
        for(long k=1; (6*k+1)<=max; k++)
        {
            if(isPrime(6*k-1))
            {
                totalPrime++;
            }
            if(isPrime(6*k+1))
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
*                       -: First Run :-
* =====================> Range = 10000 <======================
* Total Primes = 1229
* Total Computations = 18069
* Total Time Required for Computations = 2ms
* =====================> Range = 100000 <======================
* Total Primes = 9592
* Total Computations = 440518
* Total Time Required for Computations = 16ms
* =====================> Range = 1000000 <======================
* Total Primes = 78498
* Total Computations = 11106344
* Total Time Required for Computations = 331ms
*
* =====================> Range = 1000000 <======================
* Total Primes = 664579
* Total Computations = 289108183
* Total Time Required for Computations = 6.305S
*
*
* */
