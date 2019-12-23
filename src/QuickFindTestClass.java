public class QuickFindTestClass {
    public static void main(String args[]){

        QuickFind quickFind = new QuickFind(3);

        quickFind.union(1,2);
        if (quickFind.isConnected(1,2)) System.out.println("1 and 2 is connected");
    }
}
