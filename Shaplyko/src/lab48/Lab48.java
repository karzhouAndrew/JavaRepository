package lab48;

/*Напишите программу получающую данные о расходе в качестве исходных параметров main,
и добавляющую этот расход в базу, после чего выводящую таблицу расходов на экран.
*/

public class Lab48 {
    public static void main(String[] args) throws ClassNotFoundException {
        DBWork work = new DBWork();
        work.workQuary();
    }
}