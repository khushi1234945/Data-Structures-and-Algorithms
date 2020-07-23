package linkedlist;

import java.util.Scanner;

public class Linkedlist {
    Node head;
    public static Linkedlist insertValue(Linkedlist list,int data) {
    	Node insertNode=new Node(data);
    	if(list.head==null)
    		list.head=insertNode;
    	else
    	{
    		Node currentNode=list.head;
    		while(currentNode.getNext()!=null)
    		{
    			currentNode=currentNode.getNext();
    		}
    		currentNode.setNext(insertNode);
    		
    	}
    	return list;
    	
    }
    
    public static Linkedlist deleteValue(Linkedlist list,int key)
    {
    	Node currentNode=list.head;
    	Node previous=null;
    	if(currentNode.getNext()!=null && currentNode.getData()==key)
    		list.head=currentNode.getNext();
    	else
    	{
    		while(currentNode!=null && currentNode.getData()!=key)
    		{
    			previous=currentNode;
    			currentNode=currentNode.getNext();
    		}
    		if(currentNode!=null)
    			previous.setNext(currentNode.getNext());
    		if(currentNode==null)
    			System.out.println("Element not found");
    	}
    	return list;
    	 }
    
    
    public static Linkedlist insertStart(Linkedlist list,int data)
    {
    	Node insertNode=new Node(data);
        insertNode.setNext(list.head);
        list.head=insertNode;
        return list;
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void printList(Linkedlist list)
    {
    	Node currentNode=list.head;
    	while(currentNode!=null)
    	{
    		System.out.print(currentNode.getData()+" ");
    		currentNode=currentNode.getNext();
    	}
    	
    }
    
    
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any 6 values:");
		Linkedlist myList=new Linkedlist();
		for(int i=0;i<6;i++)
		 insertValue(myList,scan.nextInt());
		System.out.println("list: ");
		printList(myList);
		
		
  }

}
