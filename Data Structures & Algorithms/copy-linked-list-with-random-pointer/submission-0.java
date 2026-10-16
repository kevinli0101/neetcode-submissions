/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        ArrayList<Node> original = new ArrayList<>();
        ArrayList<Node> copy = new ArrayList<>();

        Node curr = head;

        while (curr != null) {
            original.add(curr);
            copy.add(new Node(curr.val));
            curr = curr.next;
        }

        for (int i = 0; i < original.size(); i++) {
            Node node = original.get(i);

            if (i + 1 < copy.size()) {
                copy.get(i).next = copy.get(i + 1);
            }

            if (node.random != null) {
                int index = original.indexOf(node.random);
                copy.get(i).random = copy.get(index);
            }
        }

        return copy.get(0);
    }
}
