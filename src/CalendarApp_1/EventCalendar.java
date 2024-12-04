package CalendarApp_1;



public class EventCalendar extends CalendarApp_Base implements Comparable<EventCalendar> {


    private String eventName;
    private String eventDate;
    private String startTime;
    private String endTime;
    private String location;
    private String priority;
    private String frequency;
    private String note;
    private int attendance;
    private String holiday;

    public EventCalendar(String appName, String eventName, String eventDate, String startTime, String endTime, String location, String priority, String frequency, String note, int attendance, String holiday) {
        super(appName);
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.priority = priority;
        this.frequency = frequency;
        this.note = note;
        this.attendance = attendance;
        this.holiday = holiday;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {

        this.eventName = eventName;
    }

    public String getEventDate() {

        return eventDate;
    }

    public void setEventDate(String eventDate) {

        this.eventDate = eventDate;
    }

    public String getStartTime() {

        return startTime;
    }

    public void setStartTime(String startTime) {

        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {

        this.endTime = endTime;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getPriority() {

        return priority;
    }

    public void setPriority(String priority) {

        this.priority = priority;
    }

    public String getFrequency() {

        return frequency;
    }

    public void setFrequency(String frequency) {

        this.frequency = frequency;

    }
    public String getNote() {

        return note;
    }

    public void setNote(String note) {

        this.note = note;
    }

    public int getAttendance() {

        return attendance;
    }

    public void setAttendance(int attendance) {

        this.attendance = attendance;
    }

    public String getHoliday() {

        return holiday;
    }

    public void setHoliday(String holiday) {

        this.holiday = holiday;
    }



    @Override
    public int compareTo(EventCalendar event) {
        int dateComparison = this.eventDate.compareTo(event.eventDate);
        if (dateComparison != 0) {
            return dateComparison;
        }
        // If dates are equal, compare event names
        return this.eventName.compareTo(event.eventName);
    }

    }

