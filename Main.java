public class Main {
    public static void main(String[] args) {
        try {
            Stack stack = new Stack();
            
            // Добавляем элементы в стек
            stack.push(1);
            stack.push(2);
            stack.push(3);
            
            // Выводим содержимое стека
            stack.printStack(); // Stack elements: 3 2 1 
            
            // Извлекаем элемент из стека
            Object poppedItem = stack.pop();
            System.out.println("Popped element: " + poppedItem); // Popped element: 3
            
            // Снова выводим содержимое стека
            stack.printStack(); // Stack elements: 2 1 
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}