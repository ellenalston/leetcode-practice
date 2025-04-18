# Write your MySQL query statement below
WITH ProcessTimes AS (
    SELECT
    machine_id,
    process_id, 
    MAX(CASE WHEN activity_type = 'end' THEN timestamp END) -
    MAX(CASE WHEN activity_type = 'start' THEN timestamp END) AS processing_time
    FROM activity
    GROUP BY machine_id, process_id
)

SELECT 
machine_id,
ROUND(avg(processing_time), 3) AS processing_time
FROM  ProcessTimes
GROUP BY machine_id;
