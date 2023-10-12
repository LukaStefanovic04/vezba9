public class Kalkulator {
    double operand1;
    double operand2;

    public Kalkulator(){}
    public double add(double operand1, double operand2) {
        System.out.println("Zbir " + (operand1 + operand2));
        return operand1 + operand2;
    }
    public double sub(double operand1, double operand2){
        System.out.println("Razlika " + (operand1 - operand2));
        return  operand1 - operand2;
    }
   public double mul(double operand1, double operand2){
       System.out.println("Proizvod " + (operand1 * operand2));
        return operand1 * operand2;
   }
   public double div(double operand1, double operand2){
       System.out.println("Ostatak " + (operand1 / operand2));
       return operand1 / operand2;
   }
}
