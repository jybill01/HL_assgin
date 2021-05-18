package src.자료구조_21_05_03;

public class LinkedTest {
    public static void main(String[] args){
        ListNode L = new ListNode();
        ListNode newNode = new ListNode();
        L.name = "Kim";
        L.link = null;

        L.link = new ListNode();
        L.link.name = "Lee";

        newNode.name = "Han";
        newNode.link = L.link;
    }
}
