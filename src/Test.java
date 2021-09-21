public class Test {
    public static void main(String[] args){
        System.out.println("TEST");

        Stack<Integer> s = new StackImpl<Integer>(5);

        try {
            System.out.println(s.size());
            s.push(7);
            System.out.println(s.size());
            s.push(12);
            System.out.println(s.size());
            s.push(20);
            System.out.println(s.size());

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
