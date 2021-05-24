package src.자료구조_11주차;

public class Polynomial {
    private PolyNode firstNode;
    private PolyNode lastNode;

    public Polynomial(){
        firstNode = null;
        lastNode = null;
    }

    public boolean ispZero(){
        if(firstNode == null)return true;
        else return false;
    }

    public int coef(int e){
        PolyNode p = firstNode;
        while(p.link != null){
            if(p.exp == e)return p.coef;
            p = p.link;
        }
        return p.coef;
    }

    public int maxExp(){
        return firstNode.exp;
    }

    public void addTerm(int c, int e){
        PolyNode newNode = new PolyNode(c, e);
        if(firstNode == null){
            firstNode = newNode;
            lastNode = newNode;
            return;
        }
        else if(e > firstNode.exp){
            newNode.link = firstNode;
            firstNode = newNode;
            return;
        }
        else{
            PolyNode p = firstNode;
            while(p.link != null){
                if(p.exp > newNode.exp){
                    newNode.link = p.link;
                    p.link = newNode;
                    return;
                }
            }
            p.link = newNode;
        }
    }
    public void delTerm(int e) {
        PolyNode p = firstNode;
        if(p == null){
            System.out.print("error");
            return;
        }
        if(p.link == null){
            firstNode = null;
            lastNode = null;
            return;
        }
        while(p != null){
            if(p.exp == e){
                p.link = p.link.link;
                return;
            }
        }
    }


    public Polynomial sMult(int c, int e) {
        PolyNode p = firstNode;
        Polynomial r = new Polynomial();
        while(p != null){
            r.appendTerm(c * p.coef, e + p.exp);
            p = p.link;
        }
        return r;
    }


    public Polynomial polyMult(Polynomial p) {
        Polynomial r;
        Polynomial k = new Polynomial();
        PolyNode q = p.firstNode;
        while(q != null){
            r = k;
            Polynomial n = sMult(q.coef, q.exp);
            k = r.polyAdd(n);
            q = q.link;
        }
        return k;
    }

    public void print() {
        PolyNode p = firstNode;
        while(p != null){
            if(p.exp == 0)System.out.print(p.coef);
            else System.out.print(p.coef + "x^" + p.exp);
            p = p.link;
            if(p != null){
                System.out.print(" + ");
            }
        }
        System.out.print("\n");
    }

    private void appendTerm(int c, int e)  {
        PolyNode newNode = new PolyNode(c, e);
        if(firstNode == null){
            firstNode = newNode;
            lastNode = newNode;
        }
        else{
            lastNode.link = newNode;
            lastNode = newNode;
        }
    }

    public Polynomial polyAdd(Polynomial poly) {
        Polynomial r = new Polynomial();
        PolyNode p = firstNode;
        PolyNode q = poly.firstNode;
        while(p != null && q != null){
            if(p.exp == q.exp){
                r.appendTerm(p.coef + q.coef, p.exp);
                p = p.link;
                q = q.link;
            }
            else if(p.exp < q.exp){
                r.appendTerm(q.coef, q.exp);
                q = q.link;
            }
            else {
                r.appendTerm(p.coef, p.exp);
                p = p.link;
            }
        }
        while(q != null){
            r.appendTerm(q.coef, q.exp);
            q = q.link;
        }

        while(p != null) {
            r.appendTerm(p.coef, p.exp);
            p = p.link;
        }

        return r;
    }
}
