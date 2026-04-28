import java.util.*;
class missing_number{
    public static void main(String[] args){
        List<Integer> l1= new ArrayList<Integer>(Arrays.asList(3,9,1,4,11,6,13,8,17,10));
        Collections.sort(l1);
        for(int i=l1.get(0);i<=l1.get(l1.size()-1);i++){
            if(!l1.contains(i))
            {
                System.out.println(i);
            }
        }
    }
}