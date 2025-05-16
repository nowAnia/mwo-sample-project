package pl.edu.agh.mwo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Date;

//@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Pitstop {

    @JsonProperty("session_key")
    private int sessionKey;
    @JsonProperty("meeting_key")
    private int meetingKey;
    @JsonProperty("date")
    private Date date;
    @JsonProperty("driver_number")
    private int driverNumber;
    @JsonProperty("pit_duration")
    private Long pitDuration;
    @JsonProperty("lap_number")
    private int lapNumber;

    @Override
    public String toString() {
        return "Pitstop{" +
                "sessionKey=" + sessionKey +
                ", meetingKey=" + meetingKey +
                ", date=" + date +
                ", driverNumber=" + driverNumber +
                ", pitDuration=" + pitDuration +
                ", lapNumber=" + lapNumber +
                '}';
    }

    public int getSessionKey() {
        return sessionKey;
    }

    public int getMeetingKey() {
        return meetingKey;
    }

    public Date getDate() {
        return date;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public Long getPitDuration() {
        return pitDuration;
    }

    public int getLapNumber() {
        return lapNumber;
    }
}
