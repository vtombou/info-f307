/**
 * Cette classe implemente une simple calculette avec 6 operations.
 * Vous pouvez utiliser la classe Java Math pour implémenter les operations plus complexes.
 * Le but de cette classe est de reviser la syntaxe Java et d'experimenter avec le système
 * de contrôle de version Git.
 *
 * @author      Jacopo De Stefani
 */

public class Calculette {

    /**
     * Renvoie un entier qui correspond à la somme des operands passées comme paramètres.
     *
     * @param  op1      un entier qui correspond au premier operand de la somme
     * @param  op2      un entier qui correspond au deuxième operand de la somme
     * @return          la somme des operands op1 et op2
     */
    public static int sum(int op1, int op2){
        return op1 + op2;
    }

    /**
     * Renvoie un entier qui correspond à la différence des operands passées comme paramètres.
     *
     * @param  op1      un entier qui correspond au premier operand de la différence
     * @param  op2      un entier qui correspond au deuxième operand de la différence
     * @return          la différence des operands op1 et op2
     */
    public static int difference(int op1, int op2){
        return op1 - op2;
    }

    /**
     * Renvoie un entier qui correspond à la multiplication des operands passées comme paramètres.
     *
     * @param  op1      un entier qui correspond au premier operand de la multiplication
     * @param  op2      un entier qui correspond au deuxième operand de la multiplication
     * @return          la multiplication des operands op1 et op2
     */
    public static int multiplication(int op1, int op2){
        return op1 * op2;
    }

    /**
     * Renvoie un double qui correspond à la somme des operands passées comme paramètres.
     *
     * @param  op1      un entier qui correspond au premier operand de la division
     * @param  op2      un entier qui correspond au deuxième operand de la division
     * @return          la division entre les op1 et op2
     * @throws ArithmeticException
     */
    public static double division(int op1, int op2){
        return 0.0;
    }

    /**
     * Renvoie un double qui correspond à op1 élevé à la puissance de op2.
     *
     * @param  op1      un double qui correspond au base de l'exponentiel.
     * @param  op2      un double qui correspond au exposant de l'exponentiel.
     * @return          op1 élevé à la puissance de op2
     */
    public static double power(double op1, double op2){
        return 0.0;
    }

    /**
     * Renvoie un double qui corresponde au logarithme en base naturelle de op1.
     *
     * @param  op1      un double qui correspond a l'argument du logarithme
     * @return          le logarithme en base naturelle de op1
     */
    public static double log(double op1){
        return 0.0;
    }
}
