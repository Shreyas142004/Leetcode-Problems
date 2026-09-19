# Write your MySQL query statement be
SELECT * 
FROM Cinema 
WHERE id%2 =1
and description <> 'boring'
ORDER BY rating desc;