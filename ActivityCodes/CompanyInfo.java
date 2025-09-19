class CompanyInfo {
    public static void main(String[] a){
        System.out.println("Smart Electronics");
        displayHours();
    }

    public static void displayHours() {
        String display =    "Monday - Friday 8 am to to 6 pm\n"
                          + "Saturday        8 am to noon\n"
                          + "Sunday          closed";

        System.out.println(display);
    }
    
}

