import java.util.*;
class reverse_arraylist{
    public static void main(String[] args){
        List<Integer> l1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int i=0;
        int j=l1.size()-1;
        while(i<j){
            int temp=l1.get(i);
            l1.set(i, l1.get(j));
            l1.set(j, temp);
            i++;
            j--;
        }
        System.out.println(l1);
    }

} 