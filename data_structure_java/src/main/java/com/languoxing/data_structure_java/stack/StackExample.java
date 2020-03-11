package com.languoxing.data_structure_java.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println(stack);
        System.out.println("==========");
        System.out.println("peek=" + stack.peek()); // 查看堆栈顶部的对象，但不从堆栈中移除它。
        System.out.println(stack);
        System.out.println("==========");
        System.out.println("pop=" + stack.pop()); // 移除堆栈顶部的对象，并作为此函数的值返回该对象
        System.out.println(stack);

    }
}
