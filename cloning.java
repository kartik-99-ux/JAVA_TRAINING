
public class cloning {
    public static void main(String arg[])
    {  ab obj=new ab();
 
      obj.i=8;
      obj.j=9;
      ab.obj1=(ab)obj.clone();
   
        
    }
    
}
 class ab
 {
   int i;
   int j;
     
 }
