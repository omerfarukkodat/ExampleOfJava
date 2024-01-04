public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack();
        intStack.push(1);
        intStack.push(23);
        intStack.push(34);
        intStack.push(-1);

        // 1 , 23 , 34 , -1
        System.out.print("The max number is " + max(intStack));
    }
    public static double max(GenericStack<? extends Number>stack){
        double max = stack.pop().doubleValue();
        System.out.println(max);
// max = -1
        while (!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            //value = 34 max = 34 , 23
            System.out.println(value);
            if (value>max){
                max = value;
            }
        }
        return max;
    }



}
