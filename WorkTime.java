import java.time.LocalTime;

public class WorkTime {
    
    private LocalTime time = LocalTime.now();
    private LocalTime minWorkTime = LocalTime.of(9, 0);
    private LocalTime maxWorkTime = LocalTime.of(18, 0);
    private boolean work;

    public boolean isWork() {
        return work;
    }

    public WorkTime() {
        this.work = (this.time.getHour() <= this.maxWorkTime.getHour() && 
            this.time.getHour() >= this.minWorkTime.getHour()) ? true : false;
    }
}
