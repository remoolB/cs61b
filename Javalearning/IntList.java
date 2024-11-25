public  class IntList {
    public int first;
    public IntList next;

    public IntList(int f, IntList r){
        this.first = f;
        this.next = r;
    }

    // 递归法计算大小
    public int size(){
        if (this.next == null) return 1;
        else return 1 + this.next.size();
    }

    //迭代法求长度
    public int iterativesize(){
        int i = 0;
        IntList p = this; //指向自己
        while (p != null) {
            p = p.next;
            i++;
        }
        return i;
    }

    //递归法访问元素
    public int get(int i) {
        if (i == 0) return this.first;
        else return this.next.get(i - 1);
    }

    public static void main(String[] args) {
        IntList L = null;
        L = new IntList(20,L); //后面的L指的是null
        L = new IntList(15,L);

        System.out.println(L.get(2));
        System.out.println(L.size());
        System.out.println(L.iterativesize());
    }
}