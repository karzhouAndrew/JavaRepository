Задание  44.
Напишите команды для заполнения таблицы receivers.

CREATE TABLE receivers (
num INT(11) NOT NULL AUTO_INCREMENT,
receiver VARCHAR(50) NULL DEFAULT NULL,
PRIMARY KEY (num)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB


INSERT INTO listexpenses.receivers (num, receiver) VALUES (1, ' Интернет-провайдер "Соло" ');
INSERT INTO listexpenses.receivers (num, receiver) VALUES (2, ' Гипермаркет "Корона" ');
INSERT INTO listexpenses.receivers (num, receiver) VALUES (3, 'МТС');

Задание  45.
Напишите запрос, делающий выборку из обеих таблиц полей, где величина расходов больше 10000. В выборке должны
присутствовать четыре поля: номер платежа, дата, имя получателя, величина.

SELECT expenses.num, date, sum, receivers.receiver FROM expenses ,receivers WHERE expenses.receiver = receivers.num
AND sum > 10000;


Задание  46.
Напишите запрос удаляющий из платежей, все платежи по величине меньше 30000.

DELETE FROM expenses WHERE sum < 30000;
