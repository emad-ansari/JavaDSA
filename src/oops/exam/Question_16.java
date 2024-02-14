
package oops.exam;
class Question_16{

    // make a private inner class 
    private class InnerClass implements PublicInterface {
        @Override
        public void display() {
            System.out.println("this is private inner class");
        }   
    }

    public InnerClass getInstance() {
        return new InnerClass();
    }

}

class Main {
    public static void main(String[] args) {
        Question_16 outer = new Question_16();
        PublicInterface publicInterface = outer.getInstance(); // upcasting into publicInterface

        // when we will try to downcast it into the privateInner class it will give the complier error
        // Innerclass  privateInnerClass = (Innerclass ) publicInterface;

    }
}