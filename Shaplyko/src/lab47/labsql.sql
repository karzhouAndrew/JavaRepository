Задание  47.
Составить следующие запросы:
Вывести список получателей платежей, и сумму платежей по каждому из них.

SELECT r.receiver, SUM(e.sum)
FROM receivers r, expenses e
WHERE e.receiver=r.num
GROUP BY r.receiver


Вывести сумму платежей за тот день, когда был наибольший платеж

SELECT SUM(e.sum)
FROM expenses e
WHERE e.date=(SELECT MAX(e1.date)
FROM expenses e1
WHERE e1.sum=(SELECT MAX(e2.sum)
FROM expenses e2))


Вывести наибольший платеж за тот день, когда сумма платежей была наибольшей.

SELECT MAX(sum) AS max_sum
FROM expenses
WHERE date = (SELECT date FROM (SELECT date, SUM(sum) AS val_sum
FROM expenses
GROUP BY date) AS pay_sum
ORDER BY val_sum DESC LIMIT 0,1);

