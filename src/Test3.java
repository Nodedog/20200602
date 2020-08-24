import java.util.Stack;

public class Test3 {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        private Node head = new Node(-1);

        //进栈
        public void push(int node) {
            Node newNode = new Node(data);
            newNode.next = head.next;
            head.next = newNode;
        }


        //取栈顶元素
        public Integer peek(){
            if (head.next ==  null){
                return  null;
            }
            return head.next.data;
        }



        //出栈
        public int pop() {
            //如果两个栈都是空栈，此时说明队列是空的
            if (stack1.empty() && stack2.empty()) {
                System.out.println("是空的");
            }

            //如果栈2中有元素，那出队列就出栈2中的
            if (!stack2.empty()) {
                stack2.pop();
            }
            //此时表明栈2已是空栈，再要出队列的话，那就需要把栈1中的所有元
            //素入栈到栈2中，注意一定要是栈1中的所有元素都入栈到栈2中
            else {
                while (stack1.size() > 0) {
                    Integer c = peek();
                    stack2.push(c);
                }
            }
            stack2.push();
        }
    }
}
