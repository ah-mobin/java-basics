package javabasics.loops;

public class Main {
    public static void main(String[] args) {
        SumThreeFiveChallenge.Sum();
        System.out.println("======================================");
        //sum of odds on range challenge ---
//        System.out.println(SumOddChallenge.isOdd(-1));
        System.out.println(SumOddChallenge.sumOdd(1,100));
        System.out.println(SumOddChallenge.sumOdd(-1,100));
        System.out.println(SumOddChallenge.sumOdd(100,100));
        System.out.println(SumOddChallenge.sumOdd(13,13));
        System.out.println(SumOddChallenge.sumOdd(100,-100));
        System.out.println(SumOddChallenge.sumOdd(100,1000));
    }
}