package doriancortestallergeneral.DataStructures;

/**
 * @author dcortes
 */
public class List {

    private final Class type;
    private int length;
    private Node header;
    private final int size;

    /**
     * Creates a List with size defined
     *
     * @param type List allowed data type
     * @param size List size
     */
    public List(Class type, int size) {
        if (size < 0) {
            size = 0;
        }
        this.type = type;
        this.size = size;
    }

    /**
     * Creates a List
     *
     * @param type List allowed data type
     */
    public List(Class type) {
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
     * List length
     *
     * @return List length
     */
    public int length() {
        return length;
    }

    /**
     * Returns the List allowed type
     *
     * @return List allowed type
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
     * Adds an object to the list
     *
     * @param object Object to add
     */
    public void add(Object object) {
        if (!isValidType(object)) {
            return;
        }
        if (!hasSpace()) {
            return;
        }

        Node node = createNode(object);
        if (header == null) {
            header = node;
        } else if (header.getNext() == null) {
            header.setNext(node);
        } else {
            Node aux = header;
            do {
                aux = aux.getNext();
            } while (aux.getNext() != null);
            aux.setNext(node);
        }
        length++;
    }

    /**
     * Retrieves the object in the list at the given index
     *
     * @param index Index
     * @return Object
     */
    public Object get(int index) {
        if (index > (length - 1)) {
            return null;
        }
        Node aux = header;
        int currentIndex = 0;
        while (aux != null) {
            if (currentIndex == index) {
                return aux.getData();
            }
            aux = aux.getNext();
            currentIndex++;
        }
        return null;
    }

    /**
     * Removes an Object from the list
     *
     * @param object Object to remove
     */
    public void remove(Object object) {
        if (!isValidType(object)) {
            return;
        }

        do {
            if (header.contains(object)) {
                header = header.getNext();
                length--;
            }
        } while (header != null && header.contains(object));

        if(header == null){
            return;
        }
        
        Node prev = header;
        Node aux = header.getNext();

        while (aux != null) {
            if (!aux.contains(object)) {
                prev = aux;
                aux = aux.getNext();
            } else {
                prev.setNext(aux.getNext());
                aux = aux.getNext();
                length--;
            }
        }

    }

    /**
     * Checks if the List contains an Object
     *
     * @param object Object to find
     * @return Result
     */
    public boolean contains(Object object) {
        Node aux = header;
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
