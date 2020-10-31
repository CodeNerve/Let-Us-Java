public class LinearProbingHashTable<TKey, TValue> {
    
    private int size;           //# of elements
    private TKey[] keys;        //The hash table: stored in parallel arrays
    private TValue[] values;
    
    //Initialize hash table
    public LinearProbingHashTable(int initialCapacity) {
        keys = (TKey[]) new Object[initialCapacity];
        values = (TValue[]) new Object[initialCapacity];
        size = 0;
    }
    
    //Add element to hash table
    public void put(TKey key, TValue value) {
       
       //If # of elements becomes 1/2 size of array, double it
       if (size + 1 > keys.length / 2)
            resize(keys.length * 2);
       
        //Calculate hash & convert it to index of bucket: chops hash code in half
        //(since no negatives) and uses modulo to scale to 0 - buckets.length - 1
        int index = Math.abs(key.hashCode()) % keys.length;
        
        //Starting at hash index, advance until an empty bucket is found
        while (keys[index] != null) {
            index++;
            if (index >= keys.length)
                index = 0;
        }
        
        //Place element
        keys[index] = key;
        values[index] = value;
        size++;
    }
    
    //Get value of element in hash table, given key
    public TValue get(TKey key) {
        
        //Calculate hash & convert it to index of bucket
        int index = Math.abs(key.hashCode()) % keys.length;
        
        //Starting at hash index, advance until the key or an
        //empty element is found (empty element means that
        //the loop has looked at all keys that collide to the
        //same hash and didn't find your key)
        while (keys[index] != null && !keys[index].equals(key)) {
            index++;
            if (index >= keys.length)
                index = 0;
        }
        
        //Either returns the key or null if the key wasn't found
        return (TValue)values[index];
    }
    
    //Gets the # of elements in the hash table
    public int size() {
        return size;
    }
    
    //Is the hash table empty?
    public boolean isEmpty() {
        return size == 0;
    }
    
    //Change size of hash table, reassign all elements to new buckets
    private void resize(int newCapacity) {
        
        //Save old hash table
        TKey[] oldKeys = keys;
        TValue[] oldValues = values;
        
        //Reset hash table to the new size
        keys = (TKey[]) new Object[newCapacity];
        values = (TValue[]) new Object[newCapacity];
        size = 0;
        
        //Go through old hash table's buckets and rehash filled ones
        for (int i = 0; i < oldKeys.length; i++) {
            if (oldKeys[i] != null) {
                put(oldKeys[i], oldValues[i]);
            }
        }
    }
}
