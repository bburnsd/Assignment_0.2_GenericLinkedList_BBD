
public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> myList=new LinkedList<Integer>();
		
		Node<Integer> aNode=new Node<Integer>();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node<Integer>();
		aNode.setData(2);
		myList.addNode(aNode);
		
		Node<Integer> tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.data);
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
			
		
		

	}

}
