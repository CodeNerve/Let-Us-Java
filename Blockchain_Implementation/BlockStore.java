// Java implementation to store
// blocks in an ArrayList

import java.util.ArrayList;

public class BlockStore {

    // ArrayList to store the blocks
    public static ArrayList<Block> blockchain
            = new ArrayList<Block>();

    // Driver code
    public static void main(String[] args)
    {
        // Adding the data to the ArrayList
        blockchain.add(new Block(
                "First block", "0"));
        blockchain.add(new Block(
                "Second block",
                blockchain
                        .get(blockchain.size() - 1)
                        .hash));

        blockchain.add(new Block(
                "Third block",
                blockchain
                        .get(blockchain.size() - 1)
                        .hash));

        blockchain.add(new Block(
                "Fourth block",
                blockchain
                        .get(blockchain.size() - 1)
                        .hash));

        blockchain.add(new Block(
                "Fifth block",
                blockchain
                        .get(blockchain.size() - 1)
                        .hash));
    }
}
