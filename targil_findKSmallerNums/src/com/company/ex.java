package com.company;

/**
 * Created by MyUser on 13/02/2017.
 */
public class ex {

        static int[] num={7,5,8,6,4,5,8,2,1,5,7};
        static int[] k=new int[5];

        public ex(int[] num) {
            this.num = num;
            tryFunc();
        }



    public static void tryFunc() {

            int i = 0;
            for (; i < k.length; i++) {
                k[i] = num[i];
            }
            MyPriorityQueue myPriorityQueueK = new MyPriorityQueue(k);
//        while (num[i]>Integer.MIN_VALUE)
            while (i < num.length) {
                if (num[i] < myPriorityQueueK.getMax()) {
                    myPriorityQueueK.extractMax();
                    myPriorityQueueK.insert(num[i]);
                }
                i++;
            }
            print();
        }

        private static void print() {
            for (int i = 0; i < k.length; i++) {
                System.out.print(k[i] + " ");
            }
        }
}
