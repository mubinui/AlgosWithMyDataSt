public class Tester {
    public static void main(String[] args) {

        try{
            Bfs_Graph g = new Bfs_Graph(7);
            g.addEdge(1,2);
            g.addEdge(1,3);
            g.addEdge(2,5);
            g.addEdge(3,5);
            g.addEdge(2,4);
            g.addEdge(4,5);
            g.addEdge(4,6);
            g.addEdge(5,6);
            System.out.println("BFS running ");
            g.BFS(1);
            System.out.println();
            System.out.println("......................");




        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
