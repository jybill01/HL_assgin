package src.자료구조_12주차;

public class GenListTest {
    public static void main(String[] args){
        GenList p = new GenList();
        p.insertData(82);
        p.insertData("korea");
        GenList q = new GenList();
        q. insertData(p);
        q.insertData("seoul");
        GenList r = new GenList();
        r.insertData(p);
        r.insertData("Busan");
        GenList L = new GenList();
        L.insertData(q);
        L.insertData(r);
        L.insertData("City");
        L.printGL();
        GenList ng = q.copy();
        System.out.print("\n");
        ng.printGL();
        System.out.print("\n");
        q.printGL();
        System.out.print("\n" + ng.equals(L));
        System.out.print("\n" + ng.equals(ng));
    }
}
