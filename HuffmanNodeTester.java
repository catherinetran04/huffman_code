public class HuffmanNodeTester {
    public static void main(String[] args) {
        // Test Huffman Node isValid #1 max_score = 1)
        HuffmanNode emptyNode = new HuffmanNode('c');
        boolean b = emptyNode.isValid();
        System.out.println(b);                           // True

        // This should be null for all 3 data variables by the way
        HuffmanNode otherNode = new HuffmanNode(null, null);
        System.out.println(emptyNode.isValid());         // true
        System.out.println(otherNode.isValid());         // false
        otherNode.setOne(emptyNode);
        System.out.println(emptyNode.isValid());         // true
        System.out.println(otherNode.isValid());         // false
        HuffmanNode emptyNode2 = new HuffmanNode('d');
        otherNode.setZero(emptyNode2);
        System.out.println(emptyNode.isValid());         // true
        System.out.println(emptyNode2.isValid());        // true
        System.out.println(otherNode.isValid());         // true

        // Test Huffman Node isValid #2 max_score = 1)
        HuffmanNode n1 = new HuffmanNode('a');
        HuffmanNode n2 = new HuffmanNode('b');
        HuffmanNode n3 = new HuffmanNode('c');
        HuffmanNode n4 = new HuffmanNode('d');
        HuffmanNode temp1 = new HuffmanNode(n1, n2);
        HuffmanNode temp2 = new HuffmanNode(n3, n4);
        HuffmanNode temp = new HuffmanNode(temp1, temp2);
        System.out.println(n1.isValid());                // true
        System.out.println(n2.isValid());                // true
        System.out.println(n3.isValid());                // true
        System.out.println(n4.isValid());                // true
        System.out.println(temp1.isValid());             // true
        System.out.println(temp2.isValid());             // true
        System.out.println(temp.isValid());              // true

        // Test Huffman Node isValid #3 max_score = 1
        n1 = new HuffmanNode('a');
        n2 = new HuffmanNode('b');
        n3 = new HuffmanNode('c');
        temp1 = new HuffmanNode(n1, n2);
        temp2 = new HuffmanNode(n3, null);
        temp = new HuffmanNode(temp1, temp2);
        System.out.println(n1.isValid());                // true
        System.out.println(n2.isValid());                // true
        System.out.println(n3.isValid());                // true
        System.out.println(temp1.isValid());             // true
        System.out.println(temp2.isValid());             // false
        System.out.println(temp.isValid());              // false

        // Test Huffman Node isLeaf max_score = 1
        n1 = new HuffmanNode('a');
        n2 = new HuffmanNode('b');
        n3 = new HuffmanNode(n1, n2);
        System.out.println(n1.isLeaf());                 // true
        System.out.println(n2.isLeaf());                 // true
        System.out.println(n3.isLeaf());                 // false

        // Test Huffman Node getters/setters #1 max_score = 0.5
        n1 = new HuffmanNode('a');
        n2 = new HuffmanNode('b');
        n2.setData('c');
        n1.setZero(n2);
        System.out.println(n1.getZero().getData());      // c


        // Test Huffman Node getters/setters #2 max_score = 0.5
        n1 = new HuffmanNode('a');
        n2 = new HuffmanNode('c');
        n1.setData('b');
        n1.setOne(n2);
        System.out.println(n1.getOne().getData());       // c

    }
}

/*
True
true
false
true
false
true
true
true
true
true
true
true
true
true
true
true
true
true
true
false
false
true
true
false
c
c
 */