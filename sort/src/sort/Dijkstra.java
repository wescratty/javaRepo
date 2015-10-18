package sort;
import java.io.File;
import java.util.Scanner;
 
/**
 *
 * @author VIK VIKASH VIKASHVVERMA VIKKU
 * @website http://vikash-thiswillgoaway.blogspot.com
 */
public class Dijkstra {
 
    static int[][] cost;
    static int[] dist;
 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("./src/dijkstraData.txt"));///sort/src/dijkstraData.txt
        int n =200;
        cost = new int[n][n];
        dist = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    cost[i][j] = 0;
                } else {
                    cost[i][j] = 99999;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().trim().split("\t");
            int v = Integer.parseInt(s[0]);
            for (int j = 1; j < s.length; j++) {
                String[] ls = s[j].split(",");
                cost[v - 1][Integer.parseInt(ls[0]) - 1] = Integer.parseInt(ls[1]);
            }
        }
        
//        for (int i = 0; i < cost.length; i++) {
//        	for (int j = 0; j < cost.length; j++) {
//        		System.out.println(i+":"+j+"::"+cost[i][j]);
//				
//			}
//			
//		}
 
           shortestPath(0,n);
     
        for (int i = 0; i < n; i++) {//7,37,59,82,99,115,133,165,188,197.
           
            switch (i + 1) {
                case 7: System.out.print(dist[i] + ",");
                    break;
                case 37: System.out.print(dist[i] + ",");
                    break;
                case 59: System.out.print(dist[i] + ",");
                    break;
                case 82: System.out.print(dist[i] + ",");
                    break;
                case 99: System.out.print(dist[i] + ",");
                    break;
                case 115: System.out.print(dist[i] + ",");
                    break;
                case 133: System.out.print(dist[i] + ",");
                    break;
                case 165: System.out.print(dist[i] + ",");
                    break;
                case 188: System.out.print(dist[i] + ",");
                    break;
                case 197: System.out.print(dist[i]);
                    break;
 
 
 
            }
        }
 
 
    }
 
    static void shortestPath(int v, int n) {
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = 0;
            dist[i] = cost[v][i];  //distance from 1 to all others = 99999 or ..
        }
        s[v] = 1;
        dist[v] = 0;
        for (int i = 1; i < n - 1; i++) {
            int u = 0, dis = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[j] == 0) {
                    dis = dist[j];
                    //System.out.println("dis: "+dis);
                    u = j;
                    for (int k = j + 1; k < s.length; k++) {  // if havent looked see if we have the shortest so far
 
                        if (dis > dist[k] && s[k] == 0) {
                            dis = dist[k];
                            u = k;
                        }
                    }
                    System.out.println("u =:"+u);
                    break;
                }
 
            }
            s[u] = 1;  //new shortest one; check total shortes
            for (int j = 1; j < n; j++) {
                if (s[j] == 0) {
                    if (dist[j] > (dist[u] + cost[u][j])) {
                        dist[j] = dist[u] + cost[u][j];
 
                    }
                }
            }
        }
 
    }
}