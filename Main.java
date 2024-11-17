import java.util.Stack;

public class Main 
{
    public static void main (String[] args) 
    {
       
        @SuppressWarnings("rawtypes")
        StackInterface stack1 = (StackInterface) new Stack();
        StackInterface stack2 = new StackImp2();

        stack1.push("Hello, World");
        stack1.push("Java");
        stack1.push("Programming");
        stack2.push("C++");
        stack2.push("Python");

        System.out.println("Stack 1: " + stack1.pop());
        System.out.println("Stack 2: " + stack2.pop());
        System.out.println("Stack 1: " + stack1.pop());
        System.out.println("Stack 2: " + stack2.pop());

        String expression = "((1+2)*2)";
        System.out.println("is the expression valid?" + MathExpressionValidator.isValidExpression(expression));
    }
}


