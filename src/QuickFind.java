public class QuickFind {

    private int[] id;

    public QuickFind(int N) {
        id = new int[N];//Initialize array with the size N
        for (int i = 0; i < N; i++) {
            id[i] = i; //Set every value's id to be itself
        }
    }

    public boolean isConnected(int a,int b){
        return id[a] == id[b]; //return true if the id of a is equal to that of b, false otherwise
    }

    public void union(int a, int b){
        int aID = id[a];
        int bID = id[b];
        for (int i = 0; i < id.length; i++) {
            /*Iterate through the id array set the id value of a to be equal to that of b*/
            if (id[i] == aID) id[i] = bID;
        }
    }
}
