package doriancortestallergeneral.DataStructures;

/**
 * @author dcortes
 */
public class Stack {

    private final Class type;
    private int length;
    private Node top;
    private final int size;

    /**
     * Creates a Stack with defined size
     *
     * @param type Stack allowed data type
     * @param size Stack size
     */
    public Stack(Class type, int size) {
        if (size < 0) {
            size = 0;
        }
        this.type = type;
        this.size = size;
    }

    /**
     * Creates a Stack
     *
     * @param type Stack allowed data type
     */
    public Stack(Class type) {
        this.type = type;
        this.size = -1;
    }

    /**
     * Returns the top element in the Stack without removing it
     *
     * @return Top object
     */
    public Object peek() {
        return top.getData();
    }

    /**
     * Returns the top element in the Stack and removes it
     *
     * @return Top object
     */
    public Object pop() {
        Object topResult = top.getData();
        top = top.getNext();
        length--;
        return topResult;
    }

    /**
     * Pushes an object to the top of the Stack
     *
     * @param object Object to push
     */
    public void push(Object object) {
        if (!isValidType(object)) {
            return;
        }
        if (!hasSpace()) {
            return;
        }

        Node node = createNode(object);
        if (top != null) {
            node.setNext(top);
        }
        top = node;
        length++;
    }

    /**
     * Validates if a given object matches the Stack defined type
     *
     * @param object Object to check
     * @return Result
     */
    private boolean isValidType(Object object) {
        return type.equals(object.getClass());
    }

    /**
     * Stack length
     *
     * @return Stack length
     */
    public int length() {
        return length;
    }

    /**
     * Returns the Stack allowed type
     *
     * @return Stack allowed type
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
     * Checks if the Stack contains a given object
     *
     * @param object Object to find
     * @return Result
     */
    public boolean contains(Object object) {
        Node aux = top;
        while (aux != null) {
            if (aux.contains(object)) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    /**
     * Checks if the stack has space
     *
     * @return Result
     */
    public boolean hasSpace() {
        return !(size != -1 && (size == 0 || length == size));
    }

    /**
     * Returns the available spaces in the stack
     *
     * @return Available spaces
     */
    public int getAvailableSpace() {
        return size == -1 ? size : size - length;

    }
}
