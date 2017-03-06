import java.util.HashMap;

/**
 * Created by shizhuangzhuang on 2017/3/6.
 * leetcode 138
 * 复制一个链表，这个链表比普通的链表多一个指针，这个指针可以指向任意地方，可以为空也可以为链表中的任一个节点
 */
// Definition for singly-linked list with a random pointer.
 class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
    };

public class RandomList {
    public RandomListNode copyRandomList(RandomListNode head) {
        HashMap<RandomListNode,RandomListNode> newMap=new HashMap<RandomListNode,RandomListNode>();
        RandomListNode cur=head;
        while(cur!=null){
            RandomListNode newNode=new RandomListNode(cur.label);
            newMap.put(cur,newNode);
            cur=cur.next;
        }
        cur=head;
        while(cur!=null){
            RandomListNode node=newMap.get(cur);
            node.next=newMap.get(cur.next);
            node.random=newMap.get(cur.random);
            cur=cur.next;
        }
        return newMap.get(head);
    }
}
