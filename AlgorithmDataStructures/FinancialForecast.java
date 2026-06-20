package AlgorithmDataStructures;
class FinancialForecast {
    public static double predictFutureValue(double presentValue, double annualRate, int years) {
        if (years == 0) { //base case
            return presentValue;
        }
        return predictFutureValue(presentValue, annualRate, years - 1) * (1 + annualRate);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; 
        double annualRate = 0.05; 
        int years = 10; 

        double futureValue = predictFutureValue(presentValue, annualRate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}
/* OUTPUT :
Future Value after 10 years: 1628.89

-> Time Complexity: O(n) 

-> Optimization using formula: Future Value = Present Value * (1 + Annual Rate)^Years, which has O(1) time complexity.
(or) Using memoization to store previously calculated values to avoid redundant calculations, which can reduce time complexity to O(n) in the worst case.
*/