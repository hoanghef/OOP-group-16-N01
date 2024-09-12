public static void main(String[] args) {
        DiscreteSignal signal = new DiscreteSignal();
        signal.setSignalValue(0, 1.0);
        signal.setSignalValue(1, 0.5);
        signal.setSignalValue(2, -0.5);
        signal.setSignalValue(3, 0.25);


        System.out.println("Tín hiệu ban đầu:");
        signal.printSignal();


        for (int n = -1; n <= 5; n++) {
            System.out.println("Giá trị tín hiệu tại n = " + n + ": x(" + n + ") = " + signal.getSignalValue(n));
        }
    }
}

 public static void main(String[] args) {

        int n = 4;
        System.out.println("Giá trị của tín hiệu X(" + n + ") = " + getSignalValue(n));

        System.out.println("Giá trị tín hiệu từ n = 0 đến n = 15:");
        for (int i = 0; i <= 15; i++) {
            System.out.println("X(" + i + ") = " + getSignalValue(i));
        }
    }
}