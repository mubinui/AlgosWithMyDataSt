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

    public void  BFS(int st) throws Exception {
        List queue = new List();
        boolean [] visited = new boolean[V];
        queue.enqueue(st);
        visited[st] = true;


        while (!queue.isEmpty()){
            if(visited[st]){
                int ob = (int)queue.dequeue();
                System.out.print(ob+" ->");
            }


            List lst = adjList[st];
            int lt = (int) lst.head.next.elem;
            for(Node n = lst.head; n!=null; n=n.next ){
                if(!visited[(int)n.elem]){
                    queue.enqueue(n.elem);
                    visited[(int)n.elem]=true;
                }
            }
            st = lt;


        }

    }

}
