package CalendarApp_1;

import java.util.ArrayList;
import java.util.Collections;

public class CalendarApp_Main {

    public static void main(String[] args) {

        // Create instances of EventCalendar
       EventCalendar event1 = new EventCalendar(
                "Google Calendar",
                "Team Meeting",
                "2024-11-20",
                "10:00 AM",
                "11:00 AM",
                "Office",
                "High",
                "Weekly",
                "Discuss project updates",
                10,
                "No holiday"
        );

        EventCalendar event2 = new EventCalendar(
                "Google Calendar",
                "Christmas Celebration",
                "2024-12-25",
                "12:00 PM",
                "03:00 PM",
                "Club",
                "Medium",
                "None",
                "Celebrate with friends",
                50,
                "Christmas"
        );

        EventCalendar event3 = new EventCalendar(
                "Google Calendar",
                "Doctor's Appointment",
                "2024-11-21",
                "04:00 PM",
                "05:00 PM",
                "Clinic",
                "High",
                "None",
                "Routine check-up",
                1,
                "No holiday"
        );

        // Store events in a list
        ArrayList<EventCalendar> eventList = new ArrayList<>();
        eventList.add(event1);
        eventList.add(event2);
        eventList.add(event3);

        // Display unsorted events
        System.out.println("Events Before Sorting:");
        for (EventCalendar event : eventList) {
            System.out.println(event.getEventName() + " on " + event.getEventDate());
        }

        // Sort events based on event date using Comparable
       // Collections.sort(eventList, (e1, e2) -> e1.getEventDate().compareTo(e2.getEventDate()));

        Collections.sort(eventList);
        // Display sorted events
        System.out.println("\n"+ "Events After Sorting by Date:");
        for (EventCalendar event : eventList) {
            System.out.println(event.getEventName() + " on " + event.getEventDate());
        }

        // Display details of a specific event
        System.out.println("\n" + "Details of First Event:");
        EventCalendar firstEvent = eventList.get(0);
        firstEvent.displayInfo();
        System.out.println("Event Name: " + firstEvent.getEventName());
        System.out.println("Date: " + firstEvent.getEventDate());
        System.out.println("Start Time: " + firstEvent.getStartTime());
        System.out.println("End Time: " + firstEvent.getEndTime());
        System.out.println("Location: " + firstEvent.getLocation());
        System.out.println("Priority: " + firstEvent.getPriority());
        System.out.println("Frequency: " + firstEvent.getFrequency());
        System.out.println("Note: " + firstEvent.getNote());
        System.out.println("Attendance: " + firstEvent.getAttendance());
        System.out.println("Holiday: " + firstEvent.getHoliday());
    }
}
