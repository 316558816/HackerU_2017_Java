package com.company;

public class Main {

    public static void main(String[] args) {

     //Stack<ArrStack>[]arrStackStack=new  <>(new int[]{1, 2, 3});
    //  arrStackStack=



    }


            public static void reversStack(Stack stack){
                Stack stack1=new ArrStack();

                while (!stack.isEmpty()){
                    stack1.push(stack.pop());
                }
                Stack stack2=new ArrStack();
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
                while (!stack2.isEmpty()){
                    stack.push(stack2.pop());
                }
            }

        public static void remove(Stack stack,Object obj){

                Stack stack1=new ArrStack();
                Object o=null;
                while (!stack.isEmpty()) {

                    o = stack.pop();
                    if (!(o.equals(obj)))
                        stack1.push(o);
                }
                while (!stack1.isEmpty())
                {
                    stack.push(stack1.pop());


                }




                }




                }












