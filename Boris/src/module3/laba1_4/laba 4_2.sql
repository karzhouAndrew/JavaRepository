/*Вывести сумму платежей за тот день, когда был наибольший платеж*/

SELECT SUM(value) AS max_sum_payment_in_day
FROM expenses
WHERE paydate = ( 
					SELECT paydate
					FROM expenses
					WHERE value = (
										SELECT MAX(value)
										FROM expenses
										)
					)
;