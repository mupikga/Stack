public class Test {
    public static void main(String[] args){
        System.out.println("TEST");

        Stack<Integer> s = new StackImpl<Integer>(3);

        try {
            System.out.println("Size: " + s.size());

            s.push(7);
            s.push(14);
            s.push(28);
            s.pop();

        } catch (EmptyStackException empty){
            empty.printStackTrace();
        } catch (FullStackException full){
            full.printStackTrace();
        } finally {
            //
        }

    }
}
