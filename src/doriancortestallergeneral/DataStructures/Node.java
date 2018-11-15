package doriancortestallergeneral.DataStructures;

/**
 * @author dcortes
 */
public class Node {
        
    private Class type;
    private Object data;  
    private Node next;

    public Node(Class type) {
        this.type = type;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }  

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }   
    
    public boolean contains(Object object){
        return data.equals(object);
    }
    
}
