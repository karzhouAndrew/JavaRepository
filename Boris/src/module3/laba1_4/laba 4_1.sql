/*Вывести список получателей платежей, и сумму платежей по каждому из них.*/

SELECT name, SUM(value)
FROM receivers r, expenses e
WHERE r.num = e.receiver
GROUP BY name;