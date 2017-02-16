package com.company;

/**
 * Created by hackeru on 2/16/2017.
 */
class NodeWithHead {   //מכיל ערך מסוג NODE

    Node value;
    NodeWithHead next;

    public NodeWithHead(Node value, NodeWithHead next) {
        this.value = value;
        this.next = next;
    }

    public NodeWithHead(Node value) {
        this.value = value;
    }

}
