import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MyStackTest {

    @Test
    public void given3NumberWhenAddedtoStackShouldHaveLastAddedNode(){
        MyStack myStack = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assertions.assertEquals(myThirdNode,peak);

    }

}
