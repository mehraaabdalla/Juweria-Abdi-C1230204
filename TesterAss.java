public class aliyaaa {
    public static void main(String[] args) {
                // Stack ka abuur
                Arraystack<String> stack = new Arraystack<>();

                // Ku dar (push)
                stack.push("juweria");
                stack.push("Hodan");
                stack.push("Khadar");
                stack.push("aliya");



                //  elements
                stack.display();


                System.out.println("Top element : " + stack.peek());


                System.out.println("Removed element : " + stack.pop());


                stack.display();


                System.out.println("Current size: " + stack.size());

                // Check if empty
                System.out.println("Is stack empty? " + stack.isEmpty());
}
        }
