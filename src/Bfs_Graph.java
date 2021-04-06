public class Bfs_Graph {
    int V ;
    List [] adjList;

    Bfs_Graph(int v){
        this.V = v;
        adjList = new List[V];
        for(int i = 0; i<V; i++){
            adjList[i] = new List();

        }



    }
    public void addEdge(int src, int dest){
        adjList[src].enqueue(dest);
        adjList[dest].enqueue(src);

    }

    public void  BFS(int st){
        List list = new List();
        boolean [] visited = new boolean[V];
        list.enqueue(st);
        visited[st] = true;

        while (!list.isEmpty()){

        }



    }

}
