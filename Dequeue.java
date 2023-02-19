class Node{
	int val;
	Node next;
	Node prev;
	Node(int val){
		this.val=val;
		next= null;
		prev=null;
	}
}
 class Dequeue{
 	Node front;
 	Node back;
 	Dequeue(){
 		front= null;
 		back=null;
 	}
 
 public void pushFront(int x){
 	Node temp=new Node(x);
 	if(front==null){
 		back=temp;
 		front=temp;
 		return;
 	}
 	temp.next=front;
 	temp.prev=back;
 	front=temp;


 }
 public void pushBack(int x){
 	if(back==null){
 		front=temp;
 		back=temp;
 		return;
 	}
 	back.next=temp;
 	temp.prev=back;
 	back=temp;


 }
 public void popFront(){
 	if(front==null)
 		return;

 	System.out.println("deleting"+ front.val);
 	if(front==back){
 		front= null;
        back=null;
        return;
    }
   front=front.next;
   front.prev=null;

 }
 public void popBack(){
 	if(back==null)
 		return;
 	System.out.println("deleting"+ back.val);
 	if(back==front){
 	back=null;
 	front=null;
     }
     back=back.prev;
     back.front=null;



 }
 public String toString(){
 	String ret="Dequeue(front):";
 	Node temp=front;
 	while(temp!=null){
 		ret+=temp.val + ",";
 		temp=temp.next;
 	}
 	ret +="NUULL";
 	return ret;
 }
 
 }


 public Class Main{
 	public static void public static void main(String[] args) {
 		Dequeue dq= new Dequeue();
 		dq.pushFront(1);
 		dq.pushFront(2);
 		dq.pushFront(3);

 		dq.pushBack(4);
 		dq.pushBack(5);

 		System.out.println(dq);
 		dq.popFront();
 		dq.popFront();
 		System.out.println(dq);

 		dq.popBack();
 		dq.popBack();
 		System.out.println(dq);





 	}
 }