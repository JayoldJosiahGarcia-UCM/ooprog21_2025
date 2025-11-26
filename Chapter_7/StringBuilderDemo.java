class StringBuilderDemo {
    public static void main(String[]args){
        StringBuilder nameString = new StringBuilder("Barbara");
        StringBuilder addrressString = new StringBuilder("6311 Hickory Nut Grove Road");

        System.out.println("(StringBuilder 1) nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());
        System.out.println("(StringBuilder 2) addrressString: " + addrressString);
        System.out.println("Capacity of addrressString is: " + addrressString.capacity());
        nameString.setLength(20);
        addrressString.setLength(20);
        System.out.println("(Length set to "+ nameString.capacity() +" for StringBuilder 1) The name is " + nameString);
        System.out.println("(Length set to "+ nameString.capacity() +" for StringBuilder 2) The address is " + addrressString);
    }
}