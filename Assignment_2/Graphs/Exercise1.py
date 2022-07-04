from collections import deque


class GraphNode:
    def __init__(self, data: int) -> None:
        self.data = data
    
class GraphWithAdjacencyList:
    def __init__(self):
        self.adjNodes = {}
        
    '''
    Adds a new node to the graph.
    '''
    def addNode(self, key):
        self.adjNodes[key] = []
        
    '''
    Removes a new node to the graph.
    '''
    def removeNode(self, key):
        self.adjNodes.pop(key)
    
    
    '''
    Adds an edge between node1 and node2
    '''
    def addEdge(self, node1, node2):
        self.adjNodes[node1].append(node2)
    
    
    '''
    Removes an edge between node1 and node2
    '''
    def removeEdge(self, node1, node2):
        self.adjNodes[node1].remove(node2)
        
    '''
    Get nodes that are connected to the node represented by ‘key’
    '''
    def getAdjNodes(self, key):
        nodes = self.adjNodes[key]
        return nodes
    
    '''
    Write a method to perform DFS(int key) traverses DFS starting from key printing each node along the way.
    '''
    def DepthFirstSearch(self, key):
        visitedSet = set()
        stack = []
        
        stack.append(key)
        while len(stack) != 0:
            temp = stack.pop()
            print(temp.data)
            if temp not in visitedSet.keys():
                visitedSet.add(temp)
                for adj in self.getAdjNodes(temp):
                    if adj not in visitedSet.keys():
                        stack.append(adj)
            
                
        
        
    '''
    Write a method to perform BFS(int key) traverses BFS starting from key printing each node along the wa
    '''
    def BreadthFirstSearch(self, key):
        queue = deque()
        queue.append(key)
        visitedSet = set()
        visitedSet.add(key)
        
        while len(queue) != 0:
            temp = queue.pop()
            print(temp.data)
            for adj in self.getAdjNodes(temp):
                if adj not in visitedSet:
                    visitedSet.add(adj)
                    queue.append(adj)
        
if __name__ == "__main__":
    dummyGraph = GraphWithAdjacencyList()

    var1 = GraphNode(1)
    var2 = GraphNode(2)
    var3 = GraphNode(3)
    var4 = GraphNode(4)
    var5 = GraphNode(5)
    var6 = GraphNode(6)

    dummyGraph.addNode(var1)
    dummyGraph.addNode(var2)
    dummyGraph.addNode(var3)
    dummyGraph.addNode(var4)
    dummyGraph.addNode(var5)
    dummyGraph.addNode(var6)


    dummyGraph.addEdge(var1, var2)
    dummyGraph.addEdge(var1, var3)
    dummyGraph.addEdge(var3, var4)
    dummyGraph.addEdge(var4, var6)
    dummyGraph.addEdge(var6, var5)
    dummyGraph.addEdge(var6, var2)

    dummyGraph.DepthFirstSearch(var3)
    dummyGraph.BreadthFirstSearch(var3)          
    
    dummyGraph.removeEdge(var6, var5)
    dummyGraph.removeEdge(var6, var2)
    
    
    dummyGraph.DepthFirstSearch(var3)
    dummyGraph.BreadthFirstSearch(var3)
    
    dummyGraph.removeNode(var6)

    dummyGraph.DepthFirstSearch(var3)
    dummyGraph.BreadthFirstSearch(var3)  
            


        
    
    
    