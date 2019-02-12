public class Main {

    public static void main(String[] args) {
	    Calculette calculetteTest = new Calculette();
        int a = 194, b= 17;
        double c = 2.09, d = 3.07;
        System.out.println( a + " + " + b + " = " + Calculette.sum(a,b));
        System.out.println( a + " - " + b + " = " + Calculette.difference(a,b));
        System.out.println( a + " * " + b + " = " + Calculette.multiplication(a,b));
        System.out.println( a + " / " + b + " = " + Calculette.division(a,b));
        System.out.println( c + " ^ " + d + " = " + Calculette.power(c,d));
        System.out.println("log_e " + d + " = " + Calculette.log(d));
    }
}
