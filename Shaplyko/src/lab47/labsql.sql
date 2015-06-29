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

SELECT e.date, MAX(e.sum)
FROM (SELECT e1.date d, sum(e1.sum) с
FROM expenses e1
GROUP BY e1.date) а,
expenses e
WHERE a.с=(SELECT max(а1.с)
FROM (SELECT e1.date d, SUM(e1.sum) с
FROM expenses e1
GROUP BY e1.date) а1) AND
p.date=a.d
GROUP BY e.date

