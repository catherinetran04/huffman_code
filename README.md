#  `Huffman Coding Project`
# Overview
This project implements a basic Huffman Coding system, which is a lossless data compression algorithm. The project includes classes for building a Huffman Tree, managing the encoded characters, and handling binary sequences associated with each character.

The main classes in this project are:
- HuffmanCodeBook
- HuffmanCodeTree
- HuffmanNode

# Requirements
Java Development Kit (JDK) 8 or higher.
Basic understanding of Java data structures and algorithms.

# Files Included
- HuffmanCodeBook.java: Contains the class for managing the character-to-binary-sequence mapping.
- HuffmanCodeTree.java: Contains the class for building and managing the Huffman Tree.
- HuffmanNode.java: Defines the structure of nodes in the Huffman Tree.

# Features
- Efficient Data Compression: Implements the Huffman coding algorithm to compress data based on the frequency of characters.
Huffman Tree Construction: Uses a binary tree structure to represent the Huffman encoding scheme.
- Custom Codebook: The HuffmanCodeBook stores character-to-binary-sequence mappings.
- Binary Sequence Management: Encodes strings into a binary sequence using the Huffman coding scheme.

# Class Breakdown
1. HuffmanCodeBook.java
The HuffmanCodeBook class manages a mapping of characters to binary sequences (Huffman codes). It stores the letters and their corresponding binary sequences, allowing encoding of strings.

Key Methods:
- addSequence(char c, BinarySequence seq): Adds a letter and its associated binary sequence to the codebook.
- contains(char letter): Checks if a letter is contained in the codebook.
- containsAll(String letters): Verifies if the codebook contains all letters in a given string.
- getSequence(char c): Retrieves the binary sequence associated with a given character.
- encode(String s): Encodes an input string into a binary sequence by mapping each character to its corresponding sequence in the codebook.

2. HuffmanCodeTree.java
The HuffmanCodeTree class constructs the Huffman Tree based on character frequencies. It uses a priority queue to build a tree where the most frequent characters are closer to the root, enabling optimal encoding.

Key Methods:
- buildTree(Map<Character, Integer> frequencyMap): Builds the Huffman tree from a map of character frequencies.
- generateCode(HuffmanNode root, String code): Recursively traverses the Huffman tree to generate binary codes for each character.

3. HuffmanNode.java
The HuffmanNode class represents the individual nodes of the Huffman Tree. Each node can either be a leaf node (representing a character) or an internal node (with child nodes).

Fields:
- char character: The character represented by the node (in leaf nodes).
- int frequency: The frequency of the character or sum of frequencies in the subtree rooted at this node.
- HuffmanNode left: Left child node.
- HuffmanNode right: Right child node.

# How to Run
Compile the Java files:
```
javac HuffmanCodeBook.java HuffmanCodeTree.java HuffmanNode.java
```
To execute the Huffman compression, create instances of HuffmanCodeBook and HuffmanCodeTree and pass a string to be encoded using the codebook.

Example usage:
```
HuffmanCodeBook codeBook = new HuffmanCodeBook();
HuffmanCodeTree codeTree = new HuffmanCodeTree();

// Build tree from character frequencies
Map<Character, Integer> frequencyMap = new HashMap<>();
frequencyMap.put('a', 5);
frequencyMap.put('b', 9);
// Add more characters...

codeTree.buildTree(frequencyMap);

// Encode a string using the codebook
BinarySequence encoded = codeBook.encode("yourstring");
System.out.println("Encoded sequence: " + encoded);
```
