SELECT id
FROM Weather
WHERE temperature > (SELECT temperature FROM Weather w2 WHERE w2.recordDate = DATE_SUB(Weather.recordDate, INTERVAL 1 DAY));
