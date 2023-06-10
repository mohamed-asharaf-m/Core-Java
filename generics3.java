package generecis;
class MyGenericClass<T>
{  
    T obj;  
    void add(T obj)
    {
           this.obj=obj;
    }  
    T get()
    {
           return obj;
    }  
}  
 
class generics3
{  
     public static void main(String args[])
     {  
           MyGenericClass<Integer> m_int=new MyGenericClass<Integer>();  
           m_int.add(2);
           MyGenericClass<String>mstr=new MyGenericClass<String>();  
           mstr.add("SoftwaretestingHelp");
 
           System.out.println("Member of MyGenericClass<Integer>:" + m_int.get());
           System.out.println("Member of MyGenericClass<String>:" + mstr.get());
     }
} 