public class Tester {
    public static void main(String[] args) {

        try{
            Bfs_Graph graph = new Bfs_Graph(5);
            graph.addEdge(0,3);
            graph.addEdge(1,4);
            graph.addEdge(2,4);
            graph.addEdge(3,1);
            graph.addEdge(3,2);
            graph.addEdge(1,2);

            for(int i = 0; i<5;i++){
                List list = graph.adjList[i];
                Node n = list.head;
                System.out.print("List["+i+"]->");
                list.printList(n);
            }

            // Stack tester
            Stack stack = new Stack();
            System.out.println(stack.isEmpty()+"->True");
            System.out.println(stack.Size()+"->0");
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            System.out.println(stack.pop()+"->40");
            System.out.println(stack.peek()+"->30");
            System.out.println(stack.pop()+"->30");
            System.out.println(stack.Size()+"->2");
            System.out.println(stack.peek()+"->20");
            System.out.println(stack.pop()+"->20");
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());




        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
