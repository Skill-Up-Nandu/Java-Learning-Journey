
class demoGC {
    int id;
    demoGC(int id){
        this.id = id;
       
    }

    protected void finalize() throws Throwable {
         System.out.println("id : "+id);
    }
}

public class GarbageCollector {

    public static void main(String[] args) {
        demoGC obj1 = new demoGC(100);
        obj1 = null;
        System.gc();
        // demoGC obj2 = new demoGC(200);

        System.out.println("Main Method is Free");
        

    }
}
