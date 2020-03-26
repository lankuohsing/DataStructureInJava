package com.languoxing.data_structure_java.graph;

import java.util.ArrayList;

/*
 * https://blog.csdn.net/ha000/article/details/52368566
 */
public class Graph {
    class Vertex {
        private boolean wasVisited;// 是否被遍历
        private int label;// 结点名称
        ArrayList<Integer> allVisitedList;// 被这个结点访问过的顶点

        public Vertex(int label) {
            this.label = label;
            this.wasVisited = false;
        }

        public void setLabel(int label) {
            this.label = label;
        }

        public int getLabel() {
            return this.label;
        }

        public void setAllVisitedList(ArrayList<Integer> allVisitedList) {
            this.allVisitedList = allVisitedList;
        }

        public ArrayList<Integer> getAllVisitedList() {
            return this.allVisitedList;
        }

        public boolean getWasVisited() {
            return wasVisited;
        }

        public void setWasVisited(boolean wasVisited) {
            this.wasVisited = wasVisited;
        }
    }

    private Vertex vertexList[];// list of vertices
    private int adjMat[][];// adjacency matrix

    private int numVerts;
    private static int MAX_VERTS = 4;// n个点
    int i = 0;
    int j = 0;

    private Vertex[] getVertexList() {
        return vertexList;
    }

    public int[][] getAdjMat() {
        return adjMat;
    }

    public int getN() {
        return MAX_VERTS;
    }

    public Graph(int index) {
        adjMat = new int[MAX_VERTS][MAX_VERTS]; // 邻接矩阵
        vertexList = new Vertex[MAX_VERTS]; // 顶点数组
        numVerts = 0;

        for (i = 0; i < MAX_VERTS; i++) {
            for (j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }

        addVertex(1);
        addVertex(2);
        addVertex(3);
        addVertex(4);

        addEdge(1, 2, 13);
        addEdge(1, 2, 13);
        addEdge(1, 3, 12);
        addEdge(1, 4, 13);
        addEdge(2, 3, 6);
        addEdge(3, 4, 9);

        switch (index) {
        case 0:
            break;
        case 1:
            delEdge(4, 2);
            break;
        default:
            break;
        }
    }

    private void delEdge(int start, int end) {
        adjMat[start][end] = 0;
        adjMat[end][start] = 0;
    }

    private void addEdge(int start, int end, int weight) {// 无向图
        adjMat[start][end] = weight;
        adjMat[end][start] = weight;
    }

    public void addVertex(int label) {
        vertexList[numVerts++] = new Vertex(label);// 添加点
    }

    public int displayVertex(int i) {
        return vertexList[i].getLabel();
    }

}
