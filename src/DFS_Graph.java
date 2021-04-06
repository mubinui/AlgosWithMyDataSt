public class DFS_Graph {
    int V;
    List [] list ;
    DFS_Graph(int v){
        this.V = v;
        list = new List[V];
        for(int i = 0; i<V; i++){
            list[i] = new List();
            //adjacency list is tested !!!!
        }

    }
    public void addEdge(int s , int d){
        // Graph without direction
        list[s].enqueue(d);
        list[d].enqueue(s);
    }

    public void DFS(int sn){
        Stack stack = new Stack();
        boolean [] visited = new boolean[V];
        stack.push(sn);
        visited[sn] = true;

        while(!stack.isEmpty()){



        }


    }
}
