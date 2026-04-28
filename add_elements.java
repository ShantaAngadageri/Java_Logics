import java.util.*;
public class add_elements
{
    public static void main(String[] args){
        List<String> l1=new ArrayList<String>(Arrays.asList("Bheesma", "Arjuna", "Avyukta","Karna","Bheema"));
        for(int i=0;i<l1.size();i++){
            for(int j=i;j<l1.size()-1-i;j++){
                if(l1.get(j).compareTo(l1.get(j+1))>0){
                    String temp=l1.get(j);
                    l1.set(j, l1.get(j+1));
                    l1.set(j+1, temp);
                }
            }
        }
        System.out.println(l1);
    }
    
}