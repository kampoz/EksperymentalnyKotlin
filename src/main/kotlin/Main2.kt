package org.example

fun main() {
    val root = TreeNode("Root")
    val tree = Tree(root)

    val child1 = TreeNode("Child 1")
    val child2 = TreeNode("Child 2")
    val grandChild1 = TreeNode("Grandchild 1")

    tree.addChild(root, child1)
    tree.addChild(root, child2)
    tree.addChild(child1, grandChild1)

    val iterator = DepthFirstIterator(root)

    while (iterator.hasNext()) {
        println(iterator.next())
    }
}


data class TreeNode<T>(val value: T) {
    val children: MutableList<TreeNode<T>> = mutableListOf()
}


class Tree<T>(val root: TreeNode<T>) {
    fun addChild(parent: TreeNode<T>, child: TreeNode<T>) {
        parent.children.add(child)
    }
}


interface TreeIterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}

class DepthFirstIterator<T>(private val root: TreeNode<T>) : TreeIterator<T> {
    private val stack = mutableListOf<TreeNode<T>>()

    init {
        stack.add(root)
    }

    override fun hasNext(): Boolean {
        return stack.isNotEmpty()
    }

    override fun next(): T {
        if (!hasNext()) throw NoSuchElementException("No more elements in the tree.")
        val currentNode = stack.removeAt(stack.size - 1)
        stack.addAll(currentNode.children.reversed()) // Dodaj dzieci do stosu
        return currentNode.value
    }
}
