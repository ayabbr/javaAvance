
/**
 * 
 * Veuillez trouver les les réponses 1, 3 et 4 de cet exercice dans le fichier texte REPONSE_TD2
 * Réponse de la question 2 de l'exercice 2
 */
import java.io.IOException;

class Mere {

    public void a() {System.out.println("Mere_a"); }

    void b(Fille fille) {System.out.println("Mere_b(Fille)");}

    void c() {System.out.println("Mere_c");}

    void c(Mere mere) {System.out.println("Mere_c(Mere)"); }

    static void d() {System.out.println("static Mere_d");}

    protected void e() {System.out.println("Mere_e");}
    private void f() {System.out.println("Mere_f");}
    public void printF() { f(); }

    Object g() {System.out.println("Mere_g"); return 2;}
    int h() {System.out.println("Mere_h"); return 2;}
    void i() {System.out.println("Mere_i");}

    void j() throws Exception {System.out.println("Mere_j");  }
    void l() throws Exception {System.out.println("Mere_l");  }
    void m() throws Exception, ArrayIndexOutOfBoundsException {System.out.println("Mere_m");  }
}
class Fille extends Mere {
    void miage() {
        System.out.println("Miage");
    }
    //redefinitions
    public void a() {
        System.out.println("Fille_a");
    }
    //redefinitions
    protected void b(Fille fille) {
        System.out.println("Fille_b(Fille)");
    }
    //redefinitions
    public void c(Mere mere) {
        System.out.println("Fille_c(Mere)");
    }
    //Surcharge
    void c(Fille b) {
        System.out.println("Fille_c(Fille)");
    }
    //redefinitions
    static void d() {
        System.out.println("static Fille_d");
    }
    //Surcharge
    static void d(Mere mere) {
        System.out.println("Fille_d(Mere)");
    }
    //redefinitions
    protected void e() {
        System.out.println("Fille_e");
    }
    //redefinitions
    protected void f() {
        System.out.println("Fille_f");
    }
    //Surcharge
    String g() {
        System.out.println("Fille_g");
        return "c";
    }


    void k() throws Exception {
        System.out.println("Fille_k");
    }
    //redeef
    void l() {
        System.out.println("Fille_l");
    }
}
public class Main1 {
    public static void main(String[] args) throws Exception {
        Mere mere=new Mere();
        Mere mereFille=new Fille();
        Fille fille=new Fille();

        fille.miage();
        ((Fille)mereFille).miage();

        mere.a();
        mereFille.a();
        fille.a();
        ((Mere)mereFille).a();
        mereFille.b(null);

        mereFille.c();
        mereFille.c(mere);
        mereFille.c(mereFille);
        mereFille.c(fille);
        fille.c(fille);

        mere.d();
        mereFille.d();

        mere.printF();
        mereFille.printF();

        mereFille.j();
        mereFille.l();
        mereFille.m();
    }
}