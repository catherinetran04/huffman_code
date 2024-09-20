public class HuffmanCodeTree {

    private HuffmanNode root;

    /**
     * creates code tree using provided node as root
     */
    public HuffmanCodeTree (HuffmanNode root) {
        this.root = root;
    }
    /**
     * create code tree based on data stored in code book
     */
    public HuffmanCodeTree (HuffmanCodeBook codeBook) {
        HuffmanNode newRoot = new HuffmanNode(null, null);
        for (int i = 0; i < codeBook.length; i++) {
            char letter = codeBook.getCharacters(i);
            BinarySequence x = codeBook.getSequence(letter);
            put(x,letter);
        }
    }

    /**
     * check if tree formed by root node and its descendants is a valid code tree
     */
    public boolean isValid() {
        return (root.isValid()) ;
    }

    /**
     * modify binary tree structure so the node stores given char
     */
    public void put (BinarySequence seq, char letter) {
        if (root == null) {
            HuffmanNode x = new HuffmanNode(null, null);
            root = x;
        }
        HuffmanNode n = root;
        for (int i = 0; i < seq.size(); i++) {
            if (n != null) {
                if (n.getZero() == null) {
                    HuffmanNode x = new HuffmanNode(null, null);
                    n.setZero(x);
                }
                if (n.getOne() == null) {
                    HuffmanNode x = new HuffmanNode(null, null);
                    n.setOne(x);
                }
                if (seq.get(i) == false) {
                    n = n.getZero();
                } else {
                    n = n.getOne();
                }
                if (i == seq.size() -1) {
                    n.setData(letter);
                }
            }
        }
    }

    /**
     * decode BinarySequence into a string
     */
    public String decode(BinarySequence s) {
            StringBuilder word = new StringBuilder();
            HuffmanNode n = root;
            for (int i = 0; i < s.size(); i++) {
                if (n.getZero() == null) {
                    HuffmanNode x = new HuffmanNode(null, null);
                    n.setZero(x);
                }
                if (n.getOne() == null) {
                    HuffmanNode x = new HuffmanNode(null, null);
                    n.setOne(x);
                }
                if (s.get(i) == true) {
                    n = n.getOne();
                } else {
                    n = n.getZero();
                }
                if (n.isLeaf()) {
                    char x = n.getData();
                    word.append(x);
                    n = root;
                }
            }
            String w = word.toString();
            return w;
    }

}