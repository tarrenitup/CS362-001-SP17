// code found at: http://stackoverflow.com/questions/19330731/tree-implementation-in-java-root-parents-and-children
package edu.osu.cs362;
import java.util.*;

public class MyTreeNode<T>{
    private T data = null;
    private List<MyTreeNode> children = new ArrayList<>();
    private MyTreeNode parent = null;

    public MyTreeNode(T data) {
        this.data = data;
    }

    // public void addChild(MyTreeNode child) {    //This is the original & correct method, before bug #1 & #2 are added to the 'addChild(MyTreeNode child)' method, below.
    //     child.setParent(this);
    //     this.children.add(child);
    // }

    public void addChild(MyTreeNode child) {
        this.setParent(child);  // bug #1, 'child' & 'this' are switched around. Setting the argument as the parent rather than the child, as one would imply the specification to be.
        child.children.add(this); // bug #2, 'child' & 'this' likewise, switched around. Setting the current object as the argument's child, the reverse of the intended use.
    }

    public void addChild(T data) {
        MyTreeNode<T> newChild = new MyTreeNode<>(data);
        newChild.setParent(this);
        // children.add(newChild); // bug #3 simply removes the step in which the newly formed child node object is added to the current node's children ArrayList.
    }

    public void addChildren(List<MyTreeNode> children) {
        for(MyTreeNode t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public List<MyTreeNode> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // private void setParent(MyTreeNode parent) {   // the original method before bug #4 is introduced, as below.
    //     this.parent = parent;
    // }

    private void setParent(MyTreeNode parent) {
      parent = this.parent;       // bug #4, illustrates a common programming mistake, in which the programmer uses the assignment operator in the wrong order.
    }

    // public MyTreeNode getParent() {    // the original method before bug #5 is introduced, as below.
    //     return parent;
    // }

    public MyTreeNode getParent() {
        return this;    // but #5, returns the object calling the method rather than its parent node.
    }
}
