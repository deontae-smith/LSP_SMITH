package org.howard.edu.lsp.assignment6.integerset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BooleanSupplier;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;


import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;


public class IntegerSet{
	  
	   private ArrayList<Integer> list= new ArrayList<Integer>();
	  
	   public IntegerSet(ArrayList<Integer> list) {
	       this.list=list;
	   }
	  
	  
 



/** clears the all representation of class
    * 
    */


   public void clear() {
       list.clear();
   }
  
   
   /**  returns the length of set
    * 
    * @return
    */

  
   public int length() {
       return list.size();
   }
  
/**   
 * return true if 2 lists are equal
 * @param b
 * @return
 */
   public boolean equals(IntegerSet b) {
      
       ArrayList<Integer> list2=b.list;
         
       if(list.size()!=list2.size()) {
           return false;
       }
         
       ArrayList<Integer> temp1=list;
         
       ArrayList<Integer> temp2=list2;
         
       Collections.sort(temp1);
       Collections.sort(temp2);
         
       for(int i=0;i<temp1.size();i++) {
           if(temp1.get(i)!=temp2.get(i)) {
               return false;
           }
       }
         
       return true;
      
   }
  
  
   /**   returns a largest item and throw exception if list is empty
    * 
    * @return
    * @throws IntegerSetException
    */
  
   public int largestelement() throws IntegerSetException {
      
       if(list.size()==0) {
    	   IntegerSetException e= new IntegerSetException();
           throw e;
       }
      
       int max=0;
      
       for(int i=0;i<list.size();i++) {
           if(list.get(i)>max) {
               max=list.get(i);
           }
       }
      
       return max;
      
   }
  
   /**    returns a largest item and throw exception if list is empty
    * 
    * @return
    * @throws IntegerSetException
    */
  
   public int smallestelement() throws IntegerSetException {
      
       if(list.size()==0) {
    	   IntegerSetException e= new IntegerSetException();
           throw e;
       }
      
       int min=Integer.MAX_VALUE;
      
       for(int i=0;i<list.size();i++) {
           if(list.get(i)<min) {
               min=list.get(i);
           }
       }
      
       return min;
      
   }
  
   /**    add item if already not exist in list
    * 
    * @param item
    */
  
   public void add(int item ) {
      
       boolean exist=false;
      
       for(int i=0;i<list.size();i++) {
          
           if(list.get(i)==item) {
               exist=true;
           }
       }
      
       if(exist==false) {
           list.add(item);
       }
      
   }
  
   /**    remove item if already not exist in list
    * 
    * @param item
    */
  
   public void removeItem(int item ) {
      
      
      
       for(int i=0;i<list.size();i++) {
          
           if(list.get(i)==item) {
               list.remove(i);
           }
       }
      
   }
  
   /**  return union of of 2 sets
    * 
    * @param list2
    * @return
 * @throws IntegerSetException 
    */
   public IntegerSet union(IntegerSet list2) throws RuntimeException  {
	   
	   if (list.isEmpty() || list2.isEmpty())
		   throw new RuntimeException("Empty set in union");
       ArrayList<Integer> temp=list2.getlist();
      
       Set<Integer> set = new HashSet<>();
       set.addAll(list);
       set.addAll(temp);
      
       ArrayList<Integer> list3= new ArrayList<>(set);
      
       IntegerSet list4= new IntegerSet(list3);
      
       return list4;
      
   }
      
  
  
   /**   return intersection of of 2 sets
    * 
    * @param list2
    * @return
    */
   public IntegerSet intersection(IntegerSet list2) {
	   if (list.isEmpty() || list2.isEmpty())
		   throw new RuntimeException("Empty set in union");
	      
       ArrayList<Integer> temp=list2.getlist();
      
       list.retainAll(temp);
      
IntegerSet list4= new IntegerSet(list);
      
       return list4;
   }
 
  
   /**    returns difference of 2 sets
    * 
    * @param list2
    * @return
    */
   public IntegerSet difference (IntegerSet list2) {
	      
       ArrayList<Integer> temp=list2.getlist();
      
       // Remove all elements in list2 from list
       list.removeAll(temp);
      
IntegerSet list4= new IntegerSet(list);
      
       return list4;
      
   }

public boolean isEmpty() {
	if (list.isEmpty() == true) {
		return true;
		
	}
	else {
		return false;
	}
	// TODO Auto-generated method stub
	
}


public boolean contains(int vaule) {
	if (list.contains(vaule) == true){
		return true;
		
	}
	else {
		return false;
	}
}
  

public String toString() {
	return list.toString();
}
  

public ArrayList<Integer> getlist(){
    return list;
}

}