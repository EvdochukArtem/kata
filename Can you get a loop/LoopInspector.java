import java.util.ArrayList;
import java.util.List;

public class LoopInspector {

    public static void main(String[] args) {

        Node list = Node.createChain(1, 3);
        int result = new LoopInspector().loopSize(list);
        assertEquals("Incorrect loop size", 3, result);

        list = Node.createChain(21, 29);
        result = new LoopInspector().loopSize(list);
        assertEquals("Incorrect loop size", 29, result);
   
        list = Node.createChain(3904, 1087);
        result = new LoopInspector().loopSize(list);
        assertEquals("Incorrect loop size", 1087, result);
    }
    
    public int loopSize(Node node) {
        List<Node> list = new ArrayList<>();
        while (!list.contains(node)) {
            list.add(node);
            node = node.getNext();
        }
        int x = list.indexOf(node);
        return list.size() - x;
    }

    static class Node {
      
        private Node next;
        private final double data;

        private Node() {
            next = null;
            data = Math.random();
        }

        public static Node createChain(final int loopStart, final int loopSize) {

            Node first = new Node();
            Node starter = first;
            for (int i = 1; i < loopStart; i++) {
                starter.next = new Node();
                starter = starter.next;
            }
            Node looper = starter;
            for (int i = 0; i < loopSize - 1; i++) {
                looper.next = new Node();
                looper = looper.next;
            }
            looper.next = starter;
            return first;
        }

        Node getNext() { return next; }
    }

    static void assertEquals(final String text, final int expected, final int result) {
        boolean res = expected == result;
        System.out.println(res);
        if (!res)
        {
            System.out.println(text);
            System.out.println(expected);
            System.out.println(result);
        }
    }
}