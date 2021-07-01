package src.자료구조_11주차;

public class PolyTest {
    public static void main(String[] args){
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        p1.addTerm(4, 1);
        p1.addTerm(3, 2);
        p1.addTerm(1, 3);

        p2.addTerm(2, 1);
        p2.print();
        p2.addTerm(3, 0);
        p2.print();
        p2.addTerm(1, 2);
        p2.print();
        System.out.print(p2.maxExp() + "\n");
        System.out.print(p2.coef(3) + "\n");
        p2.sMult(4, 1).print();
        p2.delTerm(2);
        p2.print();
        System.out.print("------------------------------------------------------------\n");
        System.out.print("p1 = ");
        p1.print();
        System.out.print("p2 = ");
        p2.print();
        p2.polyAdd(p1).print();
        p2.polyMult(p1).print();
        System.out.print(p2.ispZero());
    }
}
