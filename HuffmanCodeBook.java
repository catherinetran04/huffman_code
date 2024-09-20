public class HuffmanCodeBook {
    char[] letter;
    BinarySequence[] sequence;
    int size;
    int length;
    /**
     * when first created, object contains no letters/sequences
     */
    public HuffmanCodeBook (){
        letter = null;
        sequence = null;
        size = 0;
    }
    /**
     * add given character/letter and binary sequence into the codeBook
     */
    public void addSequence (char c, BinarySequence seq) {
        char[] newLetter = new char[length +1];
        BinarySequence[] newSeq = new BinarySequence[length +1];
        for (int i = 0; i < length; i++){
            if (this.letter != null) {
                newLetter[i] = letter[i];
                newSeq[i] = sequence[i];
            }
        }
        letter = newLetter;
        sequence = newSeq;
        letter[length] = c;
        sequence[length] = seq;
        length++;
    }
    /**
     * return true/false to indicate if codebook contains a given letter
     * letter contained if previous call to addSequence has added letter
     */
    public boolean contains (char letter) {
        if (this.letter != null) {
            for (int i = 0; i < this.letter.length; i++) {
                if (this.letter != null && this.letter[i] == letter) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * see if codeBook can handle a given piece of text
     * return true if every letter in the input string is contained
     */
    public boolean containsAll (String letters) {
        for (int i = 0; i < letters.length(); i++) {
            if (contains(letters.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * get binary sequence associated with the given letter
     */
    public BinarySequence getSequence (char c) {
        for (int i = 0; i < length; i++) {
            if ( this.letter != null && letter[i] == c) {
                return sequence[i];
            }
        }
        return null;
    }

    /**
     * encode the input string into a binary sequence
     */
    public BinarySequence encode (String s) {
        char[] word = s.toCharArray();
        BinarySequence enc = new BinarySequence();
        for (int i = 0; i < s.length(); i++) {
            BinarySequence x = getSequence(word[i]);
            enc.append(x);
        }
        if (this.sequence == null) {
            return null;
        }
        return enc;
    }
    public char getCharacters(int i) {
        return letter[i];
    }
}