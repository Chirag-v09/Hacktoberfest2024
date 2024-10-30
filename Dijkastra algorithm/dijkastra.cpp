#include <iostream>
#include <vector>
#include <limits.h>

using namespace std;

int findMinDistance(vector<int>& distance, vector<bool>& visited, int vertices) {
    int min = INT_MAX, minIndex;

    for (int v = 0; v < vertices; v++)
        if (!visited[v] && distance[v] <= min) {
            min = distance[v];
            minIndex = v;
        }

    return minIndex;
}

void dijkstra(vector<vector<int>>& graph, int source) {
    int vertices = graph.size();
    vector<int> distance(vertices, INT_MAX);
    vector<bool> visited(vertices, false);

    distance[source] = 0;

    for (int count = 0; count < vertices - 1; count++) {
        int u = findMinDistance(distance, visited, vertices);
        visited[u] = true;

        for (int v = 0; v < vertices; v++)
            if (!visited[v] && graph[u][v] && distance[u] != INT_MAX &&
                distance[u] + graph[u][v] < distance[v]) {
                distance[v] = distance[u] + graph[u][v];
            }
    }

    cout << "Vertex \t Distance from Source\n";
    for (int i = 0; i < vertices; i++)
        cout << i << " \t\t " << distance[i] << endl;
}

int main() {
    int vertices;
    cout << "Enter number of vertices: ";
    cin >> vertices;

    vector<vector<int>> graph(vertices, vector<int>(vertices));

    cout << "Enter adjacency matrix:\n";
    for (int i = 0; i < vertices; i++)
        for (int j = 0; j < vertices; j++)
            cin >> graph[i][j];

    int source;
    cout << "Enter source vertex: ";
    cin >> source;

    dijkstra(graph, source);

    return 0;
}
