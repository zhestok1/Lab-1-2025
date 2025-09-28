class MyFirstClass {
      public static void main(String[] args) {
        MySecondClass o = new MySecondClass(52, 63);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setFirstNumber(i);
                o.setSecondNumber(j);
                System.out.print(o.add());
                System.out.print(" ");
            }
            System.out.println();
        }

    }
		
}


class MySecondClass {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    // Инициализация полей класса
    public MySecondClass(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add(){
        return firstNumber + secondNumber;
    }
}
