SELECT sensor_id, count(distinct event_type)
from events
group by sensor_id