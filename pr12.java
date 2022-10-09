//id-21ce010,name-vedika
// 12) Create an Association class that encapsulates two objects of different types. Similar
// to Exercise above, create a Transition class that does the same of Association class
// with three objects.

class Bank {

    private String name;

    Bank(String name) {

        this.name = name;
    }

    public String getBankName() {
        return this.name;
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getEmployeeName() {
        return this.name;
    }
}

class pr12 {

    public static void main(String[] args) {

        Bank bank = new Bank("SBI");
        Employee emp = new Employee("Vedika Bhalodi");
        System.out.println(emp.getEmployeeName()
                + " is employee of "
                + bank.getBankName());
    }
}