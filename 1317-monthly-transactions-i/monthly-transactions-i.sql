Select CONCAT(Year(trans_date),'-',LPAD(Month(trans_date),2,'0')) AS month, country, count(*) as trans_count, SUM(CASE WHEN state = 'approved' THEN 1 ELSE 0 END) AS approved_count, SUM(amount) AS trans_total_amount, SUM(CASE WHEN state = 'approved' THEN Amount else 0 end) as approved_total_amount
From Transactions
group by country, Month