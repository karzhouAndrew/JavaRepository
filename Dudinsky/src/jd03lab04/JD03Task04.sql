/* Задание  4. Составить следующие запросы:
Вывести список получателей платежей, и сумму платежей по каждому из них.*/

SELECT
  name       AS 'Получатель платежа',
  SUM(value) AS 'Сумма платежей'
FROM receivers rs, expenses
WHERE receiver = rs.num
GROUP BY name;


/* Вывести сумму платежей за тот день, когда был наибольший платеж. */

SELECT SUM(value) AS 'Сумма платежей в день наибольшего платежа'
FROM expenses
WHERE paydate = (SELECT paydate
                 FROM expenses
                 WHERE value = (SELECT MAX(value)
                                FROM expenses)
                );


/* Вывести наибольший платеж за тот день, когда сумма платежей была наибольшей. */

SELECT MAX(value) AS 'Наибольший платеж за день с наибольшей суммой'
FROM expenses
WHERE paydate = (SELECT paydate
                 FROM (SELECT paydate, SUM(value)
                       FROM expenses
                       GROUP BY paydate
                       HAVING SUM(value) = (SELECT MAX(sum_val)
                                            FROM (SELECT SUM(value) AS sum_val
                                                  FROM expenses
                                                  GROUP BY paydate
                                                 ) AS pd_grpd_sums
                                            )
                      ) AS max_sum_pd
                );