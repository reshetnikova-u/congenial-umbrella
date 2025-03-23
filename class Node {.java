class Node {
    private Object data;
    private Node next;
    
    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    // Геттеры и сеттеры
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
}

public class Stack {
    private Node top;
    
    public Stack() {
        top = null;
    }

    // Добавляет новый элемент в вершину стека
    public void push(Object item) {
        Node newNode = new Node(item);
        if (top == null) {
            top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
    }

    // Удаляет верхний элемент из стека и возвращает его значение
    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        Object result = top.getData();
        top = top.getNext(); // Переходим к следующему узлу
        return result;
    }

    // Проверка, является ли стек пустым
    public boolean isEmpty() {
        return top == null;
    }

    // Метод для вывода всех элементов стека
    public void printStack() {
        Node current = top;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}