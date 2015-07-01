/*Вывести наиболший платеж за тот день, когда сумма платежей была наибольшей.*/

SELECT MAX(value) AS big_payment
FROM expenses
WHERE paydate = (
						SELECT paydate
						FROM (
								SELECT paydate, SUM(value) AS sum_value
								FROM expenses
								GROUP BY paydate) AS paysum
						ORDER BY sum_value DESC
						LIMIT 0,1)
;