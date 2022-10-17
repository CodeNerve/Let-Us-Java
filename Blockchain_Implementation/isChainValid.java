// Java implementation to check
// validity of the blockchain

// Function to check
// validity of the blockchain
public static Boolean isChainValid()
        {
        Block currentBlock;
        Block previousBlock;

        // Iterating through
        // all the blocks
        for (int i = 1;
        i < blockchain.size();
        i++) {

        // Storing the current block
        // and the previous block
        currentBlock = blockchain.get(i);
        previousBlock = blockchain.get(i - 1);

        // Checking if the current hash
        // is equal to the
        // calculated hash or not
        if (!currentBlock.hash
        .equals(
        currentBlock
        .calculateHash())) {
        System.out.println(
        "Hashes are not equal");
        return false;
        }

        // Checking of the previous hash
        // is equal to the calculated
        // previous hash or not
        if (!previousBlock
        .hash
        .equals(
        currentBlock
        .previousHash)) {
        System.out.println(
        "Previous Hashes are not equal");
        return false;
        }
        }

        // If all the hashes are equal
        // to the calculated hashes,
        // then the blockchain is valid
        return true;
        }
