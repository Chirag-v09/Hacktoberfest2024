//Dijkastra algorithm
#include <stdio.h>
#define N 9999
int G[6][6]={
    {0,4,5,N,N,N},
    {4,0,11,9,7,N},
    {5,11,0,N,3,N},
    {N,9,N,0,13,2},
    {N,7,3,13,0,6},
    {N,N,N,2,6,0},
};

int visit[6];
int distance[6];
int shortestDistance();
void Dijkstra();


int main(){
     Dijkstra();
     return 0;
}

int shortestDistance(){
   int min = -1;
   int minimum = N;
  for(int i = 0;i< 6 ;i++){
    if(visit[i]==0 && distance[i]<minimum){
        minimum = distance[i];
        min = i;
    }
  }
  return min;
}

void  Dijkstra(){
    for(int i=0;i<6;i++){
        visit[i] = 0;
        distance[i] = N ;
    }
    distance[0] = 0;
    
    for(int i=0;i<5;i++){
    int u = shortestDistance();
    visit[u] =1;
    for(int j=0;j<6;j++){
    if(!visit[j] && G[u][j]!=N && distance[u]+G[u][j]<distance[j]){
        distance[j] = distance[u]+G[u][j];  
    }
    }
}
for(int i=0;i<6;i++ ){
   printf("Distance of %d from source node : %d\n",i,distance[i]);
}
}