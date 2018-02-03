package Demo;

import java.util.*;  
class Group implements Comparable<Group>{  
int id;  
String name;  
int price;  

public Group(int id, String name, int price) {  
    this.id = id;  
    this.name = name;  
    this.price = price;  
}  
public int compareTo(Group G){  
if(price==G.price)  
return 0;  
else if(id>G.id)  
return 1;  
else  
return -1;  
} 
} 
