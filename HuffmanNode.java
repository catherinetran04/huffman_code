public class HuffmanNode {
    private HuffmanNode zero;
    private HuffmanNode one;
    private Character data;

    /**
     * makes non-leaf node by providing it's two child nodes
     */
    public HuffmanNode(HuffmanNode zero, HuffmanNode one) {
        this.zero = zero;
        this.one = one;
        data = null;
    }

    /**
     * makes a leaf node, specifying the data. nodes set to null
     */
    public HuffmanNode(char data) {
        zero = null;
        one = null;
        this.data = Character.valueOf(data);
    }

    public HuffmanNode getZero() {
        return zero;
    }

    public HuffmanNode getOne() {
        return one;
    }

    public Character getData() {
        return data;
    }

    public void setZero(HuffmanNode zero) {
        this.zero = zero;
    }

    public void setOne(HuffmanNode one) {
        this.one = one;
    }

    public void setData(char data) {
        this.data = data;
    }

    /**
     * node is leaf if no left or right children
     */
    public boolean isLeaf() {
        if (one == null && zero == null) {
            return true;
        }
        return false;
    }

    public boolean isValid() {
        if (data == null && zero == null) {
            return false;
        }
        if (data == null && one == null) {
            return false;
        }
        if (data != null && one != null && zero != null) {
            return false;
        }
        if (this.one != null && this.zero != null) {
            boolean temp1 = one.isValid();
            if (temp1 == false) {
                return false;
            }
            boolean temp2 = zero.isValid();
            if (temp2 == false) {
                return false;
            }
        }
        return true;
    }
}
