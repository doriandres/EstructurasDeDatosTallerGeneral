package doriancortestallergeneral.DataStructures;

/**
 * @author dcortes
 */
public class Queue {

    private final Class type;
    private int length;
    private Node first;
    private Node last;
    private final int size;

    /**
     * Creates a Queue with defined size
     *
     * @param type Queue allowed data type
     * @param size Queue size
     */
    public Queue(Class type, int size) {
        if (size < 0) {
            size = 0;
        }
        this.type = type;
        this.size = size;
    }

    /**
     * Creates a Queue
     *
     * @param type Queue allowed data type
     */
    public Queue(Class type) {
        this.type = type;
        this.size = -1;
    }

    /**
     * Validates if a given object matches the List defined type
     *
     * @param object Object to check
     * @return Result
     */
    private boolean isValidType(Object object) {
        return type.equals(object.getClass());
    }

    /**
     * Queue length
     *
     * @return Queue length
     */
    public int length() {
        return length;
    }

    /**
     * Returns the Queue allowed type
     *
     * @return Queue allowed type
     */
    public Class getType() {
        return type;
    }

    /**
     * Creates a Node to store a value in the Stack
     *
     * @param object Object to store in the Node
     * @return Node
     */
    private Node createNode(Object object) {
        Node node = new Node(type);
        node.setData(object);
        return node;
    }
    
    /**
     * Returns the top element in the Queue without removing it
     *
     * @return First object in the Queue
     */
    public Object peek() {
        return first.getData();
    }

    /**
     * Dequeues the first object in the Queue and returns it
     * 
     * @return First object in the Queue
     */
    public Object dequeue() {
        Object data = first.getData();
        first = first.getNext();
        length--;
        return data;
    }

    /**
     * Enqueues an object to the end of the Queue
     * 
     * @param object Object to Enqueue
     */
    public void enqueue(Object object) {
        if (!isValidType(object)) {
            return;
        }
        if (!hasSpace()) {
            return;
        }

        Node node = createNode(object);
        if (first == null) {
            first = node;
        } else {
            last.setNext(node);
        }

        last = node;
        length++;
    }

    /**
     * Checks if the Queue contains a given object
     * 
     * @param object Object to find
     * @return Result
     */
    public boolean contains(Object object) {
        Node aux = first;
        while (aux != null) {
            if (aux.contains(object)) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    /**
     * Checks if the Queue has space
     * 
     * @return Result
     */
    public boolean hasSpace() {
        return !(size != -1 && (size == 0 || length == size));
    }

    /**
     * Returns the available spaces in the Queue
     * 
     * @return Available spaces
     */
    public int getAvailableSpace() {        
        return size == -1 ? size : size - length;
    }

    /**
     * Counts how many times an element is present in the List
     *
     * @return Times an element is present in the List
     */
    public int count(Object object) {
        int result = 0;
        Node aux = first;
        while (aux != null) {
            if (aux.contains(object)) {
                result++;
            }
            aux = aux.getNext();
        }
        return result;
    }
}
