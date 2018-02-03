package Demo;

import java.util.LinkedList;
import java.util.List;
import java.util.*;
public class Coll_List {
		

public static void main(String []args)	{
	List<Group> listA=new LinkedList<Group>();  
    //Creating Books  
	Group g1=new Group(5,"Evil",88);  
	Group g2=new Group(9," rise of people",77);  
	Group g3=new Group(7,"killing animals",34);  
    
	
	listA.add(g1);  
	listA.add(g2);  
	listA.add(g3);  
	
	Collections.sort(listA);
    //Traversing list  
    for(Group b:listA){  
    System.out.println(b.id + " " + b.name + " " + b.price + " ");  
    }  
}
}
