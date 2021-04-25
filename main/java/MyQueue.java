public class MyQueue{

    private final MyLinkdList myLinkedList;
    public MyQueue(){
        this.myLinkedList = new MyLinkdList();
    }

    public void enqueue(INode myNode){

        myLinkedList.append(myNode);
    }

    public void printQueue(){

        myLinkedList.printMyNodes();
    }

    public INode dequeue(){
        INode tempNode = myLinkedList.pop();
        return tempNode;
    }
}
