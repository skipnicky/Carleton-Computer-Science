package comp1406t8;

/** A linked list implementation for the list ADT that stores _strings
 *
 * Represents a list S0, S1, S2, ..., Sn-1 of Strings
 */
public class LList extends LinkedList{

	/** Creates an empty linked list */
	public LList(){super();}

	/** Creates a linked list with a single item (S0)
	  *
		* @param s is string S0 in the created list of size 1.
		*/
	public LList(String s ){
		super(s);
	}

	/* remove elements from the list */
	public String removeFront(){
		String ret = "";
		if(head == null){
			ret = head.getData();
		}else{
			if(head == tail){
				ret = head.getData();
				head = null;
				tail = null;
				size--;
			}else{
				ret = head.getData();
				head = head.next;
				size--;
			}
		}
		return ret;
	}

	/* remove an item by position */
	public String remove(int position){
		String ret = "";

		//store head node
		Node temp = head;
		if(head == null){
			ret = head.getData();
		}

		if(position == 0){
			ret = head.getData();
			head = temp.next; //change head
			size--;
		}else if(position == size-1){

					//finds previous node of the node to be deleted
					for(int i = 0; temp != null && i < position - 1; i++){
						temp = temp.next;
					}

					//if pos more than number of nodes
					if(temp == null || temp.next == null){
						return temp.getData();
					}

					tail = temp;
					Node next = temp.next.next;
					ret = temp.next.getData();
					temp.next = next;
					size--;
		}else{

					//finds previous node of the node to be deleted
					for(int i = 0; temp != null && i < position - 1; i++){
						temp = temp.next;
					}

					//if pos more than number of nodes
					if(temp == null || temp.next == null){
						return temp.getData();
					}

					//tail = temp;
					//System.out.println(tail);
					Node next = temp.next.next;
					ret = temp.next.getData();
					temp.next = next;
					size--;
		}
		return ret;
	}

	/* find element in list */
	public int find(String d){
		Node current = head;
		int counter = 0;
		while(current != null){
			if(current.getData().equals(d)){
				return counter;
			}
			current = current.next;
			counter++;
		}
		return -1;
	}

	/* set (modify) the item at the given position */
	public boolean set(int position, String d){
		Node current = head;
		int checkPos = 0;

		while(current != null){
			if(position == checkPos){
				current.setData(d);
				return true;
			}
			current = current.next;
			checkPos++;
		}
		return false;
	}
}
