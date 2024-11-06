public class Worker {
    private String fio;
    private String job;
    private String mail;
    private long phone;
    private int zp;
    private int age;

    public Worker(String _fio, String _job, String _mail, long _phone, int _zp, int _age) {
       fio = _fio;
       job = _job;
       mail = _mail;
       phone = _phone;
       zp = _zp;
       age = _age;
    }
    public static void main(String[] args) {
        Worker Worker1 = new Worker("Кравченко Егор Русланович", "Тестировщик" , "egich008@gmail.com", 291998998, 2300, 26);
        Worker1.printWorker();
    }


    public void  printWorker() {
        System.out.println ("Сотрудник: " + "ФИО = " + fio + ", Должность = " + job + ", Email = " + mail + ", Телефон = " + phone + ", Зарплата = " + zp + ", Возраст = " + age);
    }
}


