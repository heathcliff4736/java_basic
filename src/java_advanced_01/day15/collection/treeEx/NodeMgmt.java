package java_advanced_01.day15.collection.treeEx;

// 노드 클래스 만들기
public class NodeMgmt {

    // 시작 노드의 주소값을 넣을 공간
    Node head = null;

    public class Node {
        // left, right가 브랜치
        Node left, right;
        int value;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        // CASE1 : Node가 하나도 없을때
        if (head == null) {
            this.head = new Node(data);
        } else {
            // CASE2 : Node가 하나 이상 들어가 있을때
            Node findNode = this.head;
            while(true) {
                //     CASE2-1 현재 Node 왼쪽에 node가 들어가야 할 때
                if (findNode.value > data) findNode = findNode.left;
                //     CASE2-2 현재 Node 오른쪽에 node가 들어가야 할 때
                else if (findNode.value < data) findNode = findNode.right;
            }
        }

        return true;
    }
}
