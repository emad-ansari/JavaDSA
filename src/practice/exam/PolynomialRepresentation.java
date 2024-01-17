package practice.exam;

public class PolynomialRepresentation {
    private Node head;


    private class Node {
        private int value;
        private int exp;
        private Node next;

        private Node (int value , int exp){
            this.value = value;
            this.exp = exp;
        }
    }

    public void insert(int value, int exp){
        Node newNode = new Node(value , exp);

        if (head == null){
            head = newNode;
        }
        else {
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public PolynomialRepresentation addTwoPolynomial(PolynomialRepresentation P, PolynomialRepresentation Q){
        PolynomialRepresentation ans = new PolynomialRepresentation();
        // if the exponential of P and Q for the any term are same then add then
        Node firstPolynomial = P.head;
        Node secondPolynomial =  Q.head;

        while(firstPolynomial != null && secondPolynomial != null){
            if (firstPolynomial.exp > secondPolynomial.exp){
                ans.insert(firstPolynomial.value, firstPolynomial.exp);
                firstPolynomial = firstPolynomial.next;
            }
            else if (secondPolynomial.exp > firstPolynomial.exp){
                ans.insert(secondPolynomial.value, secondPolynomial.exp);
                secondPolynomial = secondPolynomial.next;

            }
            else {
                int sum = firstPolynomial.value + secondPolynomial.value;
                ans.insert(sum, firstPolynomial.exp);
                firstPolynomial = firstPolynomial.next;
                secondPolynomial = secondPolynomial.next;
            }
        }

        return ans;
    }
    public void display(){
        Node node = head;
        while (node != null){
            System.out.print("( " + node.value + "x^"+ node.exp + " ) " + " ");        
            node = node.next;
        
        }
        System.out.println();
    }



    public static void main(String[] args) {
        PolynomialRepresentation P = new PolynomialRepresentation();
        P.insert(3, 4);
        P.insert(2, 3);
        P.insert(-4, 2);
        P.insert(7, 0);

        PolynomialRepresentation Q = new PolynomialRepresentation();
        Q.insert(5, 3);
        Q.insert(4, 2);
        Q.insert(-5, 0);

        P.display();

        Q.display();

        PolynomialRepresentation ans = new PolynomialRepresentation();

        PolynomialRepresentation result = ans.addTwoPolynomial(P, Q);
        result.display();
    }

    
}
