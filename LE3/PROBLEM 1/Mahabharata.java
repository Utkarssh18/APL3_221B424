/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Mahabharata {
    public static void main(String[] args) {
        Pandav arjun = new Pandav();
        Pandav bheem = new Pandav();
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun: ");
        arjun.fight();
        System.out.println("Obedient: " + arjun.isObedient());
        System.out.println("Kind: " + arjun.isKind());

        System.out.println("\nBheem: ");
        bheem.fight();
        System.out.println("Obedient: " + bheem.isObedient());
        System.out.println("Kind: " + bheem.isKind());

        System.out.println("\nDuryodhan: ");
        duryodhan.fight();
        System.out.println("Obedient: " + duryodhan.isObedient());
        System.out.println("Kind: " + duryodhan.isKind());

        System.out.println("\nVikarn: ");
        vikarn.fight();
        System.out.println("Obedient: " + vikarn.isObedient());
        System.out.println("Kind: " + vikarn.isKind());
    }
}
